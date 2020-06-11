package com.example.autobackup.dao;

import com.example.autobackup.entity.Node;
import com.example.autobackup.entity.NodeExample;
import java.util.List;

import com.example.autobackup.entity.Tree;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface NodeMapper {
    long countByExample(NodeExample example);

    int deleteByExample(NodeExample example);

    int deleteByPrimaryKey(String id);

    int insert(Node record);

    int insertSelective(Node record);

    List<Node> selectByExample(NodeExample example);

    Node selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Node record, @Param("example") NodeExample example);

    int updateByExample(@Param("record") Node record, @Param("example") NodeExample example);

    int updateByPrimaryKeySelective(Node record);

    int updateByPrimaryKey(Node record);

    void deleteNotIn(List<Tree> list);
}