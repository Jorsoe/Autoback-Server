package com.example.autobackup.service;

import com.alibaba.fastjson.JSONObject;
import com.example.autobackup.Result;
import com.example.autobackup.Strings;
import com.example.autobackup.dao.NodeMapper;
import com.example.autobackup.dao.NodeStatus;
import com.example.autobackup.entity.Node;
import com.example.autobackup.entity.NodeExample;
import com.example.autobackup.entity.Tree;
import com.example.autobackup.util.ZipUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class NodeService {

    @Autowired
    NodeMapper nodeMapper;

    // sync 同步方法
    public JSONObject sync(List<Tree> array) {
        List<Tree> cond = new ArrayList<>();
        for (Tree tree : array) {
            if (needUpload(tree)) {
                cond.add(tree);
            }
        }
        clear(array);
        return Result.Success(cond);
    }


    // clear 删除根据客户端上报的最新的数据删除数据库中的多余数据
    private void clear(List<Tree> array) {
        nodeMapper.deleteNotIn(array);
    }

    // needUpload 判断当前树节点是否需要更新 分以下几种情况
    // 1. 结点在数据库中找不到   - true
    //    1.1 结点是文件夹 插入新的数据库记录  但是不需要上传
    //    1.2 结点是文件 插入并且要求客户端上传
    // 2. 能够找到结点，last modify 不相等
    //    2.1 结点是文件夹  - 更新当前节点的last modify 但是不上传文件 返回false
    //    2.2 结点是文件    -  更新当前节点的last modify 文件并且返回true
    // 3. 能够找到结点，last modify 相等
    //   3.1 文件没上传 返回true，否则返回false
    // 4. 删除数据库中多余的
    private boolean needUpload(Tree tree) {
        NodeExample e = new NodeExample();
        NodeExample.Criteria c = e.createCriteria();
        // 根据源文件的绝对路径寻找文件
        c.andOriginRelativePathEqualTo(tree.getPath());
        List<Node> nodes = nodeMapper.selectByExample(e);
        if (nodes.size() == 0) {
            // 结点在数据库中找不到   需要更新
            insertNewTreeNode(tree);
            return tree.isLeft();
        }
        // 存在当前节点
        Node old = nodes.get(0);
        if (old.getLastModify() == tree.getLastModify()) {
            // 文件没有变化不需要更新  end
            if (old.getHot() == 0 && tree.isLeft()) {
                // 压缩当前的文件
                String fileName = old.getTargetRelativePath();
                String orginName = fileName.substring(fileName.lastIndexOf("\\") + 1, fileName.lastIndexOf("."));
                String zipd = Strings.ROOT+fileName + ".zip";
                ZipUtil.compress(zipd, Strings.ROOT+fileName);
                File file = new File(Strings.ROOT+fileName);// 读取
                file.delete();
                old.setZipPath(zipd);
            }
            old.setUpdated(new Date());
            old.setHot(old.getHot() - 1);
            nodeMapper.updateByPrimaryKey(old);
            return false;
        }
        // 文件发生了变化
        updateNewTreeNode(old, tree);
        return true;
    }

    // updateNewTreeNode 更新新的节点
    private void updateNewTreeNode(Node node, Tree tree) {
        node.setLastModify(tree.getLastModify());
        node.setUpdated(new Date());
        node.setStatus(NodeStatus.UN_UPLOAD);
        node.setHot(100);
        nodeMapper.updateByPrimaryKey(node);
    }

    // insertNewTreeNode 创建新的node 记录
    private void insertNewTreeNode(Tree tree) {
        Node newNode = new Node();
        newNode.setId(UUID.randomUUID().toString());
        newNode.setAlias(tree.getName());
        newNode.setCreated(new Date());
        newNode.setUpdated(new Date());
        newNode.setDownloadCount(0);
        newNode.setHot(100);
        newNode.setIsLeaf(tree.isLeft() ? 1 : 0);
        newNode.setOriginRelativePath(tree.getPath());
        newNode.setTargetRelativePath(tree.getPath());
        newNode.setPid(tree.getParentId());
        newNode.setOid(tree.getId());
        newNode.setLastModify(tree.getLastModify());
        newNode.setIsDeleted(0);
        newNode.setStatus(NodeStatus.UPLOAD);
        newNode.setOriginName(tree.getName());
        nodeMapper.insert(newNode);
    }

    // getItems 获取记录
    public List<Node> getItems(int page, int pageSize) {
        NodeExample e = new NodeExample();
        NodeExample.Criteria c = e.createCriteria();
        return nodeMapper.selectByExample(e);
    }
}
