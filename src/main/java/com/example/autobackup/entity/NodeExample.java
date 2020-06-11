package com.example.autobackup.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NodeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NodeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPidIsNull() {
            addCriterion("pid is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pid is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(Integer value) {
            addCriterion("pid =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(Integer value) {
            addCriterion("pid <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(Integer value) {
            addCriterion("pid >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pid >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(Integer value) {
            addCriterion("pid <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(Integer value) {
            addCriterion("pid <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<Integer> values) {
            addCriterion("pid in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<Integer> values) {
            addCriterion("pid not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(Integer value1, Integer value2) {
            addCriterion("pid between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(Integer value1, Integer value2) {
            addCriterion("pid not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andOidIsNull() {
            addCriterion("oid is null");
            return (Criteria) this;
        }

        public Criteria andOidIsNotNull() {
            addCriterion("oid is not null");
            return (Criteria) this;
        }

        public Criteria andOidEqualTo(Integer value) {
            addCriterion("oid =", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotEqualTo(Integer value) {
            addCriterion("oid <>", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThan(Integer value) {
            addCriterion("oid >", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThanOrEqualTo(Integer value) {
            addCriterion("oid >=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThan(Integer value) {
            addCriterion("oid <", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThanOrEqualTo(Integer value) {
            addCriterion("oid <=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidIn(List<Integer> values) {
            addCriterion("oid in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotIn(List<Integer> values) {
            addCriterion("oid not in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidBetween(Integer value1, Integer value2) {
            addCriterion("oid between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotBetween(Integer value1, Integer value2) {
            addCriterion("oid not between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andAliasIsNull() {
            addCriterion("alias is null");
            return (Criteria) this;
        }

        public Criteria andAliasIsNotNull() {
            addCriterion("alias is not null");
            return (Criteria) this;
        }

        public Criteria andAliasEqualTo(String value) {
            addCriterion("alias =", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasNotEqualTo(String value) {
            addCriterion("alias <>", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasGreaterThan(String value) {
            addCriterion("alias >", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasGreaterThanOrEqualTo(String value) {
            addCriterion("alias >=", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasLessThan(String value) {
            addCriterion("alias <", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasLessThanOrEqualTo(String value) {
            addCriterion("alias <=", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasLike(String value) {
            addCriterion("alias like", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasNotLike(String value) {
            addCriterion("alias not like", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasIn(List<String> values) {
            addCriterion("alias in", values, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasNotIn(List<String> values) {
            addCriterion("alias not in", values, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasBetween(String value1, String value2) {
            addCriterion("alias between", value1, value2, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasNotBetween(String value1, String value2) {
            addCriterion("alias not between", value1, value2, "alias");
            return (Criteria) this;
        }

        public Criteria andIsLeafIsNull() {
            addCriterion("is_leaf is null");
            return (Criteria) this;
        }

        public Criteria andIsLeafIsNotNull() {
            addCriterion("is_leaf is not null");
            return (Criteria) this;
        }

        public Criteria andIsLeafEqualTo(Integer value) {
            addCriterion("is_leaf =", value, "isLeaf");
            return (Criteria) this;
        }

        public Criteria andIsLeafNotEqualTo(Integer value) {
            addCriterion("is_leaf <>", value, "isLeaf");
            return (Criteria) this;
        }

        public Criteria andIsLeafGreaterThan(Integer value) {
            addCriterion("is_leaf >", value, "isLeaf");
            return (Criteria) this;
        }

        public Criteria andIsLeafGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_leaf >=", value, "isLeaf");
            return (Criteria) this;
        }

        public Criteria andIsLeafLessThan(Integer value) {
            addCriterion("is_leaf <", value, "isLeaf");
            return (Criteria) this;
        }

        public Criteria andIsLeafLessThanOrEqualTo(Integer value) {
            addCriterion("is_leaf <=", value, "isLeaf");
            return (Criteria) this;
        }

        public Criteria andIsLeafIn(List<Integer> values) {
            addCriterion("is_leaf in", values, "isLeaf");
            return (Criteria) this;
        }

        public Criteria andIsLeafNotIn(List<Integer> values) {
            addCriterion("is_leaf not in", values, "isLeaf");
            return (Criteria) this;
        }

        public Criteria andIsLeafBetween(Integer value1, Integer value2) {
            addCriterion("is_leaf between", value1, value2, "isLeaf");
            return (Criteria) this;
        }

        public Criteria andIsLeafNotBetween(Integer value1, Integer value2) {
            addCriterion("is_leaf not between", value1, value2, "isLeaf");
            return (Criteria) this;
        }

        public Criteria andOriginNameIsNull() {
            addCriterion("origin_name is null");
            return (Criteria) this;
        }

        public Criteria andOriginNameIsNotNull() {
            addCriterion("origin_name is not null");
            return (Criteria) this;
        }

        public Criteria andOriginNameEqualTo(String value) {
            addCriterion("origin_name =", value, "originName");
            return (Criteria) this;
        }

        public Criteria andOriginNameNotEqualTo(String value) {
            addCriterion("origin_name <>", value, "originName");
            return (Criteria) this;
        }

        public Criteria andOriginNameGreaterThan(String value) {
            addCriterion("origin_name >", value, "originName");
            return (Criteria) this;
        }

        public Criteria andOriginNameGreaterThanOrEqualTo(String value) {
            addCriterion("origin_name >=", value, "originName");
            return (Criteria) this;
        }

        public Criteria andOriginNameLessThan(String value) {
            addCriterion("origin_name <", value, "originName");
            return (Criteria) this;
        }

        public Criteria andOriginNameLessThanOrEqualTo(String value) {
            addCriterion("origin_name <=", value, "originName");
            return (Criteria) this;
        }

        public Criteria andOriginNameLike(String value) {
            addCriterion("origin_name like", value, "originName");
            return (Criteria) this;
        }

        public Criteria andOriginNameNotLike(String value) {
            addCriterion("origin_name not like", value, "originName");
            return (Criteria) this;
        }

        public Criteria andOriginNameIn(List<String> values) {
            addCriterion("origin_name in", values, "originName");
            return (Criteria) this;
        }

        public Criteria andOriginNameNotIn(List<String> values) {
            addCriterion("origin_name not in", values, "originName");
            return (Criteria) this;
        }

        public Criteria andOriginNameBetween(String value1, String value2) {
            addCriterion("origin_name between", value1, value2, "originName");
            return (Criteria) this;
        }

        public Criteria andOriginNameNotBetween(String value1, String value2) {
            addCriterion("origin_name not between", value1, value2, "originName");
            return (Criteria) this;
        }

        public Criteria andUnionCodeIsNull() {
            addCriterion("union_code is null");
            return (Criteria) this;
        }

        public Criteria andUnionCodeIsNotNull() {
            addCriterion("union_code is not null");
            return (Criteria) this;
        }

        public Criteria andUnionCodeEqualTo(String value) {
            addCriterion("union_code =", value, "unionCode");
            return (Criteria) this;
        }

        public Criteria andUnionCodeNotEqualTo(String value) {
            addCriterion("union_code <>", value, "unionCode");
            return (Criteria) this;
        }

        public Criteria andUnionCodeGreaterThan(String value) {
            addCriterion("union_code >", value, "unionCode");
            return (Criteria) this;
        }

        public Criteria andUnionCodeGreaterThanOrEqualTo(String value) {
            addCriterion("union_code >=", value, "unionCode");
            return (Criteria) this;
        }

        public Criteria andUnionCodeLessThan(String value) {
            addCriterion("union_code <", value, "unionCode");
            return (Criteria) this;
        }

        public Criteria andUnionCodeLessThanOrEqualTo(String value) {
            addCriterion("union_code <=", value, "unionCode");
            return (Criteria) this;
        }

        public Criteria andUnionCodeLike(String value) {
            addCriterion("union_code like", value, "unionCode");
            return (Criteria) this;
        }

        public Criteria andUnionCodeNotLike(String value) {
            addCriterion("union_code not like", value, "unionCode");
            return (Criteria) this;
        }

        public Criteria andUnionCodeIn(List<String> values) {
            addCriterion("union_code in", values, "unionCode");
            return (Criteria) this;
        }

        public Criteria andUnionCodeNotIn(List<String> values) {
            addCriterion("union_code not in", values, "unionCode");
            return (Criteria) this;
        }

        public Criteria andUnionCodeBetween(String value1, String value2) {
            addCriterion("union_code between", value1, value2, "unionCode");
            return (Criteria) this;
        }

        public Criteria andUnionCodeNotBetween(String value1, String value2) {
            addCriterion("union_code not between", value1, value2, "unionCode");
            return (Criteria) this;
        }

        public Criteria andDownloadCountIsNull() {
            addCriterion("download_count is null");
            return (Criteria) this;
        }

        public Criteria andDownloadCountIsNotNull() {
            addCriterion("download_count is not null");
            return (Criteria) this;
        }

        public Criteria andDownloadCountEqualTo(Integer value) {
            addCriterion("download_count =", value, "downloadCount");
            return (Criteria) this;
        }

        public Criteria andDownloadCountNotEqualTo(Integer value) {
            addCriterion("download_count <>", value, "downloadCount");
            return (Criteria) this;
        }

        public Criteria andDownloadCountGreaterThan(Integer value) {
            addCriterion("download_count >", value, "downloadCount");
            return (Criteria) this;
        }

        public Criteria andDownloadCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("download_count >=", value, "downloadCount");
            return (Criteria) this;
        }

        public Criteria andDownloadCountLessThan(Integer value) {
            addCriterion("download_count <", value, "downloadCount");
            return (Criteria) this;
        }

        public Criteria andDownloadCountLessThanOrEqualTo(Integer value) {
            addCriterion("download_count <=", value, "downloadCount");
            return (Criteria) this;
        }

        public Criteria andDownloadCountIn(List<Integer> values) {
            addCriterion("download_count in", values, "downloadCount");
            return (Criteria) this;
        }

        public Criteria andDownloadCountNotIn(List<Integer> values) {
            addCriterion("download_count not in", values, "downloadCount");
            return (Criteria) this;
        }

        public Criteria andDownloadCountBetween(Integer value1, Integer value2) {
            addCriterion("download_count between", value1, value2, "downloadCount");
            return (Criteria) this;
        }

        public Criteria andDownloadCountNotBetween(Integer value1, Integer value2) {
            addCriterion("download_count not between", value1, value2, "downloadCount");
            return (Criteria) this;
        }

        public Criteria andHotIsNull() {
            addCriterion("hot is null");
            return (Criteria) this;
        }

        public Criteria andHotIsNotNull() {
            addCriterion("hot is not null");
            return (Criteria) this;
        }

        public Criteria andHotEqualTo(Integer value) {
            addCriterion("hot =", value, "hot");
            return (Criteria) this;
        }

        public Criteria andHotNotEqualTo(Integer value) {
            addCriterion("hot <>", value, "hot");
            return (Criteria) this;
        }

        public Criteria andHotGreaterThan(Integer value) {
            addCriterion("hot >", value, "hot");
            return (Criteria) this;
        }

        public Criteria andHotGreaterThanOrEqualTo(Integer value) {
            addCriterion("hot >=", value, "hot");
            return (Criteria) this;
        }

        public Criteria andHotLessThan(Integer value) {
            addCriterion("hot <", value, "hot");
            return (Criteria) this;
        }

        public Criteria andHotLessThanOrEqualTo(Integer value) {
            addCriterion("hot <=", value, "hot");
            return (Criteria) this;
        }

        public Criteria andHotIn(List<Integer> values) {
            addCriterion("hot in", values, "hot");
            return (Criteria) this;
        }

        public Criteria andHotNotIn(List<Integer> values) {
            addCriterion("hot not in", values, "hot");
            return (Criteria) this;
        }

        public Criteria andHotBetween(Integer value1, Integer value2) {
            addCriterion("hot between", value1, value2, "hot");
            return (Criteria) this;
        }

        public Criteria andHotNotBetween(Integer value1, Integer value2) {
            addCriterion("hot not between", value1, value2, "hot");
            return (Criteria) this;
        }

        public Criteria andCreatedIsNull() {
            addCriterion("created is null");
            return (Criteria) this;
        }

        public Criteria andCreatedIsNotNull() {
            addCriterion("created is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedEqualTo(Date value) {
            addCriterion("created =", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotEqualTo(Date value) {
            addCriterion("created <>", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThan(Date value) {
            addCriterion("created >", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThanOrEqualTo(Date value) {
            addCriterion("created >=", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLessThan(Date value) {
            addCriterion("created <", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLessThanOrEqualTo(Date value) {
            addCriterion("created <=", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedIn(List<Date> values) {
            addCriterion("created in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotIn(List<Date> values) {
            addCriterion("created not in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedBetween(Date value1, Date value2) {
            addCriterion("created between", value1, value2, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotBetween(Date value1, Date value2) {
            addCriterion("created not between", value1, value2, "created");
            return (Criteria) this;
        }

        public Criteria andUpdatedIsNull() {
            addCriterion("updated is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedIsNotNull() {
            addCriterion("updated is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedEqualTo(Date value) {
            addCriterion("updated =", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedNotEqualTo(Date value) {
            addCriterion("updated <>", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedGreaterThan(Date value) {
            addCriterion("updated >", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedGreaterThanOrEqualTo(Date value) {
            addCriterion("updated >=", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedLessThan(Date value) {
            addCriterion("updated <", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedLessThanOrEqualTo(Date value) {
            addCriterion("updated <=", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedIn(List<Date> values) {
            addCriterion("updated in", values, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedNotIn(List<Date> values) {
            addCriterion("updated not in", values, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedBetween(Date value1, Date value2) {
            addCriterion("updated between", value1, value2, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedNotBetween(Date value1, Date value2) {
            addCriterion("updated not between", value1, value2, "updated");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNull() {
            addCriterion("is_deleted is null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNotNull() {
            addCriterion("is_deleted is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedEqualTo(Integer value) {
            addCriterion("is_deleted =", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotEqualTo(Integer value) {
            addCriterion("is_deleted <>", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThan(Integer value) {
            addCriterion("is_deleted >", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_deleted >=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThan(Integer value) {
            addCriterion("is_deleted <", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThanOrEqualTo(Integer value) {
            addCriterion("is_deleted <=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIn(List<Integer> values) {
            addCriterion("is_deleted in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotIn(List<Integer> values) {
            addCriterion("is_deleted not in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedBetween(Integer value1, Integer value2) {
            addCriterion("is_deleted between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotBetween(Integer value1, Integer value2) {
            addCriterion("is_deleted not between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andLastModifyIsNull() {
            addCriterion("last_modify is null");
            return (Criteria) this;
        }

        public Criteria andLastModifyIsNotNull() {
            addCriterion("last_modify is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifyEqualTo(Long value) {
            addCriterion("last_modify =", value, "lastModify");
            return (Criteria) this;
        }

        public Criteria andLastModifyNotEqualTo(Long value) {
            addCriterion("last_modify <>", value, "lastModify");
            return (Criteria) this;
        }

        public Criteria andLastModifyGreaterThan(Long value) {
            addCriterion("last_modify >", value, "lastModify");
            return (Criteria) this;
        }

        public Criteria andLastModifyGreaterThanOrEqualTo(Long value) {
            addCriterion("last_modify >=", value, "lastModify");
            return (Criteria) this;
        }

        public Criteria andLastModifyLessThan(Long value) {
            addCriterion("last_modify <", value, "lastModify");
            return (Criteria) this;
        }

        public Criteria andLastModifyLessThanOrEqualTo(Long value) {
            addCriterion("last_modify <=", value, "lastModify");
            return (Criteria) this;
        }

        public Criteria andLastModifyIn(List<Long> values) {
            addCriterion("last_modify in", values, "lastModify");
            return (Criteria) this;
        }

        public Criteria andLastModifyNotIn(List<Long> values) {
            addCriterion("last_modify not in", values, "lastModify");
            return (Criteria) this;
        }

        public Criteria andLastModifyBetween(Long value1, Long value2) {
            addCriterion("last_modify between", value1, value2, "lastModify");
            return (Criteria) this;
        }

        public Criteria andLastModifyNotBetween(Long value1, Long value2) {
            addCriterion("last_modify not between", value1, value2, "lastModify");
            return (Criteria) this;
        }

        public Criteria andOriginRelativePathIsNull() {
            addCriterion("origin_relative_path is null");
            return (Criteria) this;
        }

        public Criteria andOriginRelativePathIsNotNull() {
            addCriterion("origin_relative_path is not null");
            return (Criteria) this;
        }

        public Criteria andOriginRelativePathEqualTo(String value) {
            addCriterion("origin_relative_path =", value, "originRelativePath");
            return (Criteria) this;
        }

        public Criteria andOriginRelativePathNotEqualTo(String value) {
            addCriterion("origin_relative_path <>", value, "originRelativePath");
            return (Criteria) this;
        }

        public Criteria andOriginRelativePathGreaterThan(String value) {
            addCriterion("origin_relative_path >", value, "originRelativePath");
            return (Criteria) this;
        }

        public Criteria andOriginRelativePathGreaterThanOrEqualTo(String value) {
            addCriterion("origin_relative_path >=", value, "originRelativePath");
            return (Criteria) this;
        }

        public Criteria andOriginRelativePathLessThan(String value) {
            addCriterion("origin_relative_path <", value, "originRelativePath");
            return (Criteria) this;
        }

        public Criteria andOriginRelativePathLessThanOrEqualTo(String value) {
            addCriterion("origin_relative_path <=", value, "originRelativePath");
            return (Criteria) this;
        }

        public Criteria andOriginRelativePathLike(String value) {
            addCriterion("origin_relative_path like", value, "originRelativePath");
            return (Criteria) this;
        }

        public Criteria andOriginRelativePathNotLike(String value) {
            addCriterion("origin_relative_path not like", value, "originRelativePath");
            return (Criteria) this;
        }

        public Criteria andOriginRelativePathIn(List<String> values) {
            addCriterion("origin_relative_path in", values, "originRelativePath");
            return (Criteria) this;
        }

        public Criteria andOriginRelativePathNotIn(List<String> values) {
            addCriterion("origin_relative_path not in", values, "originRelativePath");
            return (Criteria) this;
        }

        public Criteria andOriginRelativePathBetween(String value1, String value2) {
            addCriterion("origin_relative_path between", value1, value2, "originRelativePath");
            return (Criteria) this;
        }

        public Criteria andOriginRelativePathNotBetween(String value1, String value2) {
            addCriterion("origin_relative_path not between", value1, value2, "originRelativePath");
            return (Criteria) this;
        }

        public Criteria andTargetRelativePathIsNull() {
            addCriterion("target_relative_path is null");
            return (Criteria) this;
        }

        public Criteria andTargetRelativePathIsNotNull() {
            addCriterion("target_relative_path is not null");
            return (Criteria) this;
        }

        public Criteria andTargetRelativePathEqualTo(String value) {
            addCriterion("target_relative_path =", value, "targetRelativePath");
            return (Criteria) this;
        }

        public Criteria andTargetRelativePathNotEqualTo(String value) {
            addCriterion("target_relative_path <>", value, "targetRelativePath");
            return (Criteria) this;
        }

        public Criteria andTargetRelativePathGreaterThan(String value) {
            addCriterion("target_relative_path >", value, "targetRelativePath");
            return (Criteria) this;
        }

        public Criteria andTargetRelativePathGreaterThanOrEqualTo(String value) {
            addCriterion("target_relative_path >=", value, "targetRelativePath");
            return (Criteria) this;
        }

        public Criteria andTargetRelativePathLessThan(String value) {
            addCriterion("target_relative_path <", value, "targetRelativePath");
            return (Criteria) this;
        }

        public Criteria andTargetRelativePathLessThanOrEqualTo(String value) {
            addCriterion("target_relative_path <=", value, "targetRelativePath");
            return (Criteria) this;
        }

        public Criteria andTargetRelativePathLike(String value) {
            addCriterion("target_relative_path like", value, "targetRelativePath");
            return (Criteria) this;
        }

        public Criteria andTargetRelativePathNotLike(String value) {
            addCriterion("target_relative_path not like", value, "targetRelativePath");
            return (Criteria) this;
        }

        public Criteria andTargetRelativePathIn(List<String> values) {
            addCriterion("target_relative_path in", values, "targetRelativePath");
            return (Criteria) this;
        }

        public Criteria andTargetRelativePathNotIn(List<String> values) {
            addCriterion("target_relative_path not in", values, "targetRelativePath");
            return (Criteria) this;
        }

        public Criteria andTargetRelativePathBetween(String value1, String value2) {
            addCriterion("target_relative_path between", value1, value2, "targetRelativePath");
            return (Criteria) this;
        }

        public Criteria andTargetRelativePathNotBetween(String value1, String value2) {
            addCriterion("target_relative_path not between", value1, value2, "targetRelativePath");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andZipPathIsNull() {
            addCriterion("zip_path is null");
            return (Criteria) this;
        }

        public Criteria andZipPathIsNotNull() {
            addCriterion("zip_path is not null");
            return (Criteria) this;
        }

        public Criteria andZipPathEqualTo(String value) {
            addCriterion("zip_path =", value, "zipPath");
            return (Criteria) this;
        }

        public Criteria andZipPathNotEqualTo(String value) {
            addCriterion("zip_path <>", value, "zipPath");
            return (Criteria) this;
        }

        public Criteria andZipPathGreaterThan(String value) {
            addCriterion("zip_path >", value, "zipPath");
            return (Criteria) this;
        }

        public Criteria andZipPathGreaterThanOrEqualTo(String value) {
            addCriterion("zip_path >=", value, "zipPath");
            return (Criteria) this;
        }

        public Criteria andZipPathLessThan(String value) {
            addCriterion("zip_path <", value, "zipPath");
            return (Criteria) this;
        }

        public Criteria andZipPathLessThanOrEqualTo(String value) {
            addCriterion("zip_path <=", value, "zipPath");
            return (Criteria) this;
        }

        public Criteria andZipPathLike(String value) {
            addCriterion("zip_path like", value, "zipPath");
            return (Criteria) this;
        }

        public Criteria andZipPathNotLike(String value) {
            addCriterion("zip_path not like", value, "zipPath");
            return (Criteria) this;
        }

        public Criteria andZipPathIn(List<String> values) {
            addCriterion("zip_path in", values, "zipPath");
            return (Criteria) this;
        }

        public Criteria andZipPathNotIn(List<String> values) {
            addCriterion("zip_path not in", values, "zipPath");
            return (Criteria) this;
        }

        public Criteria andZipPathBetween(String value1, String value2) {
            addCriterion("zip_path between", value1, value2, "zipPath");
            return (Criteria) this;
        }

        public Criteria andZipPathNotBetween(String value1, String value2) {
            addCriterion("zip_path not between", value1, value2, "zipPath");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}