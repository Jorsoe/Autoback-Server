package com.example.autobackup;

import com.alibaba.fastjson.JSONObject;
import com.example.autobackup.dao.NodeMapper;
import com.example.autobackup.entity.Node;
import com.example.autobackup.entity.Tree;
import com.example.autobackup.service.NodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLDecoder;
import java.util.List;

@Controller
public class NodeController {

    @Autowired
    NodeService nodeService;

    @Autowired
    NodeMapper nodeMapper;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ModelAndView show(Model model) {
        int page = (model.getAttribute("page") == null ? 1 : (int) model.getAttribute("page"));
        int pageSize = (model.getAttribute("pageSize") == null ? 1 : (int) model.getAttribute("pageSize"));


        List<Node> items = nodeService.getItems(page, pageSize);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("systemName", "自动监控备份系统");
        modelAndView.addObject("items", items);
        modelAndView.addObject("item", new Node());
        modelAndView.setViewName("index");


        return modelAndView;
    }


    @PostMapping(value = "/sync")
    @ResponseBody
    public JSONObject show(@RequestBody String list) {

        try {
            String rs = URLDecoder.decode(list, "utf-8");
            rs = rs.substring(0, rs.length() - 1);
            List<Tree> array = JSONObject.parseArray(rs, Tree.class);
            System.out.println(array.get(0).getLastModify());
            return nodeService.sync(array);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        return Result.Failed("服务器故障");
    }

    @RequestMapping("/download")
    public String download(HttpServletRequest request, HttpServletResponse response) {

        response.setContentType("text/html;charset=utf-8");
        try {
            request.setCharacterEncoding("UTF-8");
        } catch (UnsupportedEncodingException e1) {
            e1.printStackTrace();
        }

        java.io.BufferedInputStream bis = null;
        java.io.BufferedOutputStream bos = null;

        String id = request.getParameter("id");
        Node node = nodeMapper.selectByPrimaryKey(id);
        node.setDownloadCount(node.getDownloadCount() + 1);
        node.setHot(100);
        nodeMapper.updateByPrimaryKey(node);
//        String downLoadPath = node.getTargetRelativePath();  //注意不同系统的分隔符
        String downLoadPath = Strings.ROOT+node.getTargetRelativePath();  //注意不同系统的分隔符
        if (node.getZipPath() != null && node.getZipPath().length() > 0) {
            downLoadPath = node.getZipPath();
        }
        String fileName = node.getAlias();
        System.out.println(downLoadPath);

        try {
            long fileLength = new File(downLoadPath).length();
            response.setContentType("application/x-msdownload;");
            response.setHeader("Content-disposition", "attachment; filename=" + new String(fileName.getBytes("utf-8"), "ISO8859-1"));
            response.setHeader("Content-Length", String.valueOf(fileLength));
            bis = new BufferedInputStream(new FileInputStream(downLoadPath));
            bos = new BufferedOutputStream(response.getOutputStream());
            byte[] buff = new byte[2048];
            int bytesRead;
            while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {
                bos.write(buff, 0, bytesRead);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (bis != null)
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            if (bos != null)
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
        return null;
    }
}
