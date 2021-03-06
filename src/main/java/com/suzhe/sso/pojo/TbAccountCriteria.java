package com.suzhe.sso.pojo;

import java.math.BigDecimal;
import java.util.Date;

import java.util.ArrayList;
import java.util.List;

public class TbAccountCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public TbAccountCriteria() {
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

    public void setPageNo(Integer pageNo) {
        this.pageNo=pageNo;
        this.startRow = (pageNo-1)*this.pageSize;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setStartRow(Integer startRow) {
        this.startRow=startRow;
    }

    public Integer getStartRow() {
        return startRow;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize=pageSize;
        this.startRow = (pageNo-1)*this.pageSize;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setFields(String fields) {
        this.fields=fields;
    }

    public String getFields() {
        return fields;
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
            addCriterion("id  is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id  =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id  <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id  >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id  >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id  <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id  <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(Integer value) {
            addCriterion("id  like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(Integer value) {
            addCriterion("id  not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id  in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id  not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdetween(Integer value1, Integer value2) {
            addCriterion("id  between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id  not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id  is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id  =", value, "id");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id  <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id  >", value, "id");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id  >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id  <", value, "id");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id  <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(Integer value) {
            addCriterion("user_id  like", value, "id");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(Integer value) {
            addCriterion("user_id  not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id  in", values, "id");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id  not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andUserIdetween(Integer value1, Integer value2) {
            addCriterion("user_id  between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id  not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsIsNull() {
            addCriterion("total_assets is null");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsIsNotNull() {
            addCriterion("total_assets  is not null");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsEqualTo(BigDecimal value) {
            addCriterion("total_assets  =", value, "id");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsNotEqualTo(BigDecimal value) {
            addCriterion("total_assets  <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsGreaterThan(BigDecimal value) {
            addCriterion("total_assets  >", value, "id");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_assets  >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsLessThan(BigDecimal value) {
            addCriterion("total_assets  <", value, "id");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_assets  <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsLike(BigDecimal value) {
            addCriterion("total_assets  like", value, "id");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsNotLike(BigDecimal value) {
            addCriterion("total_assets  not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsIn(List<BigDecimal> values) {
            addCriterion("total_assets  in", values, "id");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsNotIn(List<BigDecimal> values) {
            addCriterion("total_assets  not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_assets  between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_assets  not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTotalIncomeIsNull() {
            addCriterion("total_income is null");
            return (Criteria) this;
        }

        public Criteria andTotalIncomeIsNotNull() {
            addCriterion("total_income  is not null");
            return (Criteria) this;
        }

        public Criteria andTotalIncomeEqualTo(BigDecimal value) {
            addCriterion("total_income  =", value, "id");
            return (Criteria) this;
        }

        public Criteria andTotalIncomeNotEqualTo(BigDecimal value) {
            addCriterion("total_income  <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andTotalIncomeGreaterThan(BigDecimal value) {
            addCriterion("total_income  >", value, "id");
            return (Criteria) this;
        }

        public Criteria andTotalIncomeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_income  >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andTotalIncomeLessThan(BigDecimal value) {
            addCriterion("total_income  <", value, "id");
            return (Criteria) this;
        }

        public Criteria andTotalIncomeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_income  <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andTotalIncomeLike(BigDecimal value) {
            addCriterion("total_income  like", value, "id");
            return (Criteria) this;
        }

        public Criteria andTotalIncomeNotLike(BigDecimal value) {
            addCriterion("total_income  not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andTotalIncomeIn(List<BigDecimal> values) {
            addCriterion("total_income  in", values, "id");
            return (Criteria) this;
        }

        public Criteria andTotalIncomeNotIn(List<BigDecimal> values) {
            addCriterion("total_income  not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andTotalIncomeetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_income  between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTotalIncomeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_income  not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andWalletIsNull() {
            addCriterion("wallet is null");
            return (Criteria) this;
        }

        public Criteria andWalletIsNotNull() {
            addCriterion("wallet  is not null");
            return (Criteria) this;
        }

        public Criteria andWalletEqualTo(BigDecimal value) {
            addCriterion("wallet  =", value, "id");
            return (Criteria) this;
        }

        public Criteria andWalletNotEqualTo(BigDecimal value) {
            addCriterion("wallet  <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andWalletGreaterThan(BigDecimal value) {
            addCriterion("wallet  >", value, "id");
            return (Criteria) this;
        }

        public Criteria andWalletGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("wallet  >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andWalletLessThan(BigDecimal value) {
            addCriterion("wallet  <", value, "id");
            return (Criteria) this;
        }

        public Criteria andWalletLessThanOrEqualTo(BigDecimal value) {
            addCriterion("wallet  <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andWalletLike(BigDecimal value) {
            addCriterion("wallet  like", value, "id");
            return (Criteria) this;
        }

        public Criteria andWalletNotLike(BigDecimal value) {
            addCriterion("wallet  not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andWalletIn(List<BigDecimal> values) {
            addCriterion("wallet  in", values, "id");
            return (Criteria) this;
        }

        public Criteria andWalletNotIn(List<BigDecimal> values) {
            addCriterion("wallet  not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andWalletetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wallet  between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andWalletNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wallet  not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time  is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time  =", value, "id");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time  <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time  >", value, "id");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time  >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time  <", value, "id");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time  <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLike(Date value) {
            addCriterion("create_time  like", value, "id");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotLike(Date value) {
            addCriterion("create_time  not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time  in", values, "id");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time  not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andCreateTimeetween(Date value1, Date value2) {
            addCriterion("create_time  between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time  not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time  is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time  =", value, "id");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time  <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time  >", value, "id");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time  >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time  <", value, "id");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time  <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLike(Date value) {
            addCriterion("update_time  like", value, "id");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotLike(Date value) {
            addCriterion("update_time  not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time  in", values, "id");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time  not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeetween(Date value1, Date value2) {
            addCriterion("update_time  between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time  not between", value1, value2, "id");
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

    public enum OrderMode{
          Asc("asc"),Desc("desc");
          private String code;

          private OrderMode(String code){
                 this.code = code;
          }


          public String getCode() {
                return code;
          }

          public void setCode(String code) {
                 this.code = code;
           }
     }

    public enum OrderPropertyEnum{

        id("id"),

userId("user_id"),

totalAssets("total_assets"),

totalIncome("total_income"),

wallet("wallet"),

createTime("create_time"),

updateTime("update_time");



        private String code;

        private OrderPropertyEnum(String code){
                this.code = code;
        }


         public String getCode() {
                return code;
         }

         public void setCode(String code) {
                  this.code = code;
         }

    }



}
