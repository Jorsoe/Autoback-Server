package com.example.autobackup.entity;

import java.util.Date;

public class Node {
    private String id;

    private Integer pid;

    private Integer oid;

    private String alias;

    private Integer isLeaf;

    private String originName;

    private String unionCode;

    private Integer downloadCount;

    private Integer hot;

    private Date created;

    private Date updated;

    private Integer isDeleted;

    private Long lastModify;

    private String originRelativePath;

    private String targetRelativePath;

    private Integer status;

    private String zipPath;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias == null ? null : alias.trim();
    }

    public Integer getIsLeaf() {
        return isLeaf;
    }

    public void setIsLeaf(Integer isLeaf) {
        this.isLeaf = isLeaf;
    }

    public String getOriginName() {
        return originName;
    }

    public void setOriginName(String originName) {
        this.originName = originName == null ? null : originName.trim();
    }

    public String getUnionCode() {
        return unionCode;
    }

    public void setUnionCode(String unionCode) {
        this.unionCode = unionCode == null ? null : unionCode.trim();
    }

    public Integer getDownloadCount() {
        return downloadCount;
    }

    public void setDownloadCount(Integer downloadCount) {
        this.downloadCount = downloadCount;
    }

    public Integer getHot() {
        return hot;
    }

    public void setHot(Integer hot) {
        this.hot = hot;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Long getLastModify() {
        return lastModify;
    }

    public void setLastModify(Long lastModify) {
        this.lastModify = lastModify;
    }

    public String getOriginRelativePath() {
        return originRelativePath;
    }

    public void setOriginRelativePath(String originRelativePath) {
        this.originRelativePath = originRelativePath == null ? null : originRelativePath.trim();
    }

    public String getTargetRelativePath() {
        return targetRelativePath;
    }

    public void setTargetRelativePath(String targetRelativePath) {
        this.targetRelativePath = targetRelativePath == null ? null : targetRelativePath.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getZipPath() {
        return zipPath;
    }

    public void setZipPath(String zipPath) {
        this.zipPath = zipPath == null ? null : zipPath.trim();
    }
}