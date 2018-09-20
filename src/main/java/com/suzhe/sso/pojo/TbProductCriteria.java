package com.suzhe.sso.pojo;

import java.math.BigDecimal;
import java.util.Date;

import java.util.ArrayList;
import java.util.List;

public class TbProductCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public TbProductCriteria() {
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

        public Criteria andProductNameIsNull() {
            addCriterion("product_name is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("product_name  is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("product_name  =", value, "id");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("product_name  <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("product_name  >", value, "id");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("product_name  >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("product_name  <", value, "id");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("product_name  <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("product_name  like", value, "id");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("product_name  not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("product_name  in", values, "id");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("product_name  not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andProductNameetween(String value1, String value2) {
            addCriterion("product_name  between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("product_name  not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAnnualYieldIsNull() {
            addCriterion("annual_yield is null");
            return (Criteria) this;
        }

        public Criteria andAnnualYieldIsNotNull() {
            addCriterion("annual_yield  is not null");
            return (Criteria) this;
        }

        public Criteria andAnnualYieldEqualTo(BigDecimal value) {
            addCriterion("annual_yield  =", value, "id");
            return (Criteria) this;
        }

        public Criteria andAnnualYieldNotEqualTo(BigDecimal value) {
            addCriterion("annual_yield  <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andAnnualYieldGreaterThan(BigDecimal value) {
            addCriterion("annual_yield  >", value, "id");
            return (Criteria) this;
        }

        public Criteria andAnnualYieldGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("annual_yield  >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andAnnualYieldLessThan(BigDecimal value) {
            addCriterion("annual_yield  <", value, "id");
            return (Criteria) this;
        }

        public Criteria andAnnualYieldLessThanOrEqualTo(BigDecimal value) {
            addCriterion("annual_yield  <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andAnnualYieldLike(BigDecimal value) {
            addCriterion("annual_yield  like", value, "id");
            return (Criteria) this;
        }

        public Criteria andAnnualYieldNotLike(BigDecimal value) {
            addCriterion("annual_yield  not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andAnnualYieldIn(List<BigDecimal> values) {
            addCriterion("annual_yield  in", values, "id");
            return (Criteria) this;
        }

        public Criteria andAnnualYieldNotIn(List<BigDecimal> values) {
            addCriterion("annual_yield  not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andAnnualYieldetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("annual_yield  between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAnnualYieldNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("annual_yield  not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNull() {
            addCriterion("total_amount is null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNotNull() {
            addCriterion("total_amount  is not null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountEqualTo(BigDecimal value) {
            addCriterion("total_amount  =", value, "id");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotEqualTo(BigDecimal value) {
            addCriterion("total_amount  <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThan(BigDecimal value) {
            addCriterion("total_amount  >", value, "id");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_amount  >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThan(BigDecimal value) {
            addCriterion("total_amount  <", value, "id");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_amount  <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLike(BigDecimal value) {
            addCriterion("total_amount  like", value, "id");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotLike(BigDecimal value) {
            addCriterion("total_amount  not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIn(List<BigDecimal> values) {
            addCriterion("total_amount  in", values, "id");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotIn(List<BigDecimal> values) {
            addCriterion("total_amount  not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andTotalAmountetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_amount  between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_amount  not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andRemainingAmountIsNull() {
            addCriterion("remaining_amount is null");
            return (Criteria) this;
        }

        public Criteria andRemainingAmountIsNotNull() {
            addCriterion("remaining_amount  is not null");
            return (Criteria) this;
        }

        public Criteria andRemainingAmountEqualTo(BigDecimal value) {
            addCriterion("remaining_amount  =", value, "id");
            return (Criteria) this;
        }

        public Criteria andRemainingAmountNotEqualTo(BigDecimal value) {
            addCriterion("remaining_amount  <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andRemainingAmountGreaterThan(BigDecimal value) {
            addCriterion("remaining_amount  >", value, "id");
            return (Criteria) this;
        }

        public Criteria andRemainingAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("remaining_amount  >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andRemainingAmountLessThan(BigDecimal value) {
            addCriterion("remaining_amount  <", value, "id");
            return (Criteria) this;
        }

        public Criteria andRemainingAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("remaining_amount  <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andRemainingAmountLike(BigDecimal value) {
            addCriterion("remaining_amount  like", value, "id");
            return (Criteria) this;
        }

        public Criteria andRemainingAmountNotLike(BigDecimal value) {
            addCriterion("remaining_amount  not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andRemainingAmountIn(List<BigDecimal> values) {
            addCriterion("remaining_amount  in", values, "id");
            return (Criteria) this;
        }

        public Criteria andRemainingAmountNotIn(List<BigDecimal> values) {
            addCriterion("remaining_amount  not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andRemainingAmountetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("remaining_amount  between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andRemainingAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("remaining_amount  not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andInvestPeriodIsNull() {
            addCriterion("invest_period is null");
            return (Criteria) this;
        }

        public Criteria andInvestPeriodIsNotNull() {
            addCriterion("invest_period  is not null");
            return (Criteria) this;
        }

        public Criteria andInvestPeriodEqualTo(Integer value) {
            addCriterion("invest_period  =", value, "id");
            return (Criteria) this;
        }

        public Criteria andInvestPeriodNotEqualTo(Integer value) {
            addCriterion("invest_period  <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andInvestPeriodGreaterThan(Integer value) {
            addCriterion("invest_period  >", value, "id");
            return (Criteria) this;
        }

        public Criteria andInvestPeriodGreaterThanOrEqualTo(Integer value) {
            addCriterion("invest_period  >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andInvestPeriodLessThan(Integer value) {
            addCriterion("invest_period  <", value, "id");
            return (Criteria) this;
        }

        public Criteria andInvestPeriodLessThanOrEqualTo(Integer value) {
            addCriterion("invest_period  <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andInvestPeriodLike(Integer value) {
            addCriterion("invest_period  like", value, "id");
            return (Criteria) this;
        }

        public Criteria andInvestPeriodNotLike(Integer value) {
            addCriterion("invest_period  not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andInvestPeriodIn(List<Integer> values) {
            addCriterion("invest_period  in", values, "id");
            return (Criteria) this;
        }

        public Criteria andInvestPeriodNotIn(List<Integer> values) {
            addCriterion("invest_period  not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andInvestPeriodetween(Integer value1, Integer value2) {
            addCriterion("invest_period  between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andInvestPeriodNotBetween(Integer value1, Integer value2) {
            addCriterion("invest_period  not between", value1, value2, "id");
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

productName("product_name"),

annualYield("annual_yield"),

totalAmount("total_amount"),

remainingAmount("remaining_amount"),

investPeriod("invest_period"),

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
