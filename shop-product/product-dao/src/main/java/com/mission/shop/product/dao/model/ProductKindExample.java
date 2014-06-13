package com.mission.shop.product.dao.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductKindExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table product_kind
	 * @mbggenerated  Thu Jun 12 16:14:17 CST 2014
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table product_kind
	 * @mbggenerated  Thu Jun 12 16:14:17 CST 2014
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table product_kind
	 * @mbggenerated  Thu Jun 12 16:14:17 CST 2014
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_kind
	 * @mbggenerated  Thu Jun 12 16:14:17 CST 2014
	 */
	public ProductKindExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_kind
	 * @mbggenerated  Thu Jun 12 16:14:17 CST 2014
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_kind
	 * @mbggenerated  Thu Jun 12 16:14:17 CST 2014
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_kind
	 * @mbggenerated  Thu Jun 12 16:14:17 CST 2014
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_kind
	 * @mbggenerated  Thu Jun 12 16:14:17 CST 2014
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_kind
	 * @mbggenerated  Thu Jun 12 16:14:17 CST 2014
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_kind
	 * @mbggenerated  Thu Jun 12 16:14:17 CST 2014
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_kind
	 * @mbggenerated  Thu Jun 12 16:14:17 CST 2014
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_kind
	 * @mbggenerated  Thu Jun 12 16:14:17 CST 2014
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_kind
	 * @mbggenerated  Thu Jun 12 16:14:17 CST 2014
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_kind
	 * @mbggenerated  Thu Jun 12 16:14:17 CST 2014
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table product_kind
	 * @mbggenerated  Thu Jun 12 16:14:17 CST 2014
	 */
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

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andKindIdIsNull() {
			addCriterion("kind_id is null");
			return (Criteria) this;
		}

		public Criteria andKindIdIsNotNull() {
			addCriterion("kind_id is not null");
			return (Criteria) this;
		}

		public Criteria andKindIdEqualTo(Long value) {
			addCriterion("kind_id =", value, "kindId");
			return (Criteria) this;
		}

		public Criteria andKindIdNotEqualTo(Long value) {
			addCriterion("kind_id <>", value, "kindId");
			return (Criteria) this;
		}

		public Criteria andKindIdGreaterThan(Long value) {
			addCriterion("kind_id >", value, "kindId");
			return (Criteria) this;
		}

		public Criteria andKindIdGreaterThanOrEqualTo(Long value) {
			addCriterion("kind_id >=", value, "kindId");
			return (Criteria) this;
		}

		public Criteria andKindIdLessThan(Long value) {
			addCriterion("kind_id <", value, "kindId");
			return (Criteria) this;
		}

		public Criteria andKindIdLessThanOrEqualTo(Long value) {
			addCriterion("kind_id <=", value, "kindId");
			return (Criteria) this;
		}

		public Criteria andKindIdIn(List<Long> values) {
			addCriterion("kind_id in", values, "kindId");
			return (Criteria) this;
		}

		public Criteria andKindIdNotIn(List<Long> values) {
			addCriterion("kind_id not in", values, "kindId");
			return (Criteria) this;
		}

		public Criteria andKindIdBetween(Long value1, Long value2) {
			addCriterion("kind_id between", value1, value2, "kindId");
			return (Criteria) this;
		}

		public Criteria andKindIdNotBetween(Long value1, Long value2) {
			addCriterion("kind_id not between", value1, value2, "kindId");
			return (Criteria) this;
		}

		public Criteria andTypeNameIsNull() {
			addCriterion("type_name is null");
			return (Criteria) this;
		}

		public Criteria andTypeNameIsNotNull() {
			addCriterion("type_name is not null");
			return (Criteria) this;
		}

		public Criteria andTypeNameEqualTo(String value) {
			addCriterion("type_name =", value, "typeName");
			return (Criteria) this;
		}

		public Criteria andTypeNameNotEqualTo(String value) {
			addCriterion("type_name <>", value, "typeName");
			return (Criteria) this;
		}

		public Criteria andTypeNameGreaterThan(String value) {
			addCriterion("type_name >", value, "typeName");
			return (Criteria) this;
		}

		public Criteria andTypeNameGreaterThanOrEqualTo(String value) {
			addCriterion("type_name >=", value, "typeName");
			return (Criteria) this;
		}

		public Criteria andTypeNameLessThan(String value) {
			addCriterion("type_name <", value, "typeName");
			return (Criteria) this;
		}

		public Criteria andTypeNameLessThanOrEqualTo(String value) {
			addCriterion("type_name <=", value, "typeName");
			return (Criteria) this;
		}

		public Criteria andTypeNameLike(String value) {
			addCriterion("type_name like", value, "typeName");
			return (Criteria) this;
		}

		public Criteria andTypeNameNotLike(String value) {
			addCriterion("type_name not like", value, "typeName");
			return (Criteria) this;
		}

		public Criteria andTypeNameIn(List<String> values) {
			addCriterion("type_name in", values, "typeName");
			return (Criteria) this;
		}

		public Criteria andTypeNameNotIn(List<String> values) {
			addCriterion("type_name not in", values, "typeName");
			return (Criteria) this;
		}

		public Criteria andTypeNameBetween(String value1, String value2) {
			addCriterion("type_name between", value1, value2, "typeName");
			return (Criteria) this;
		}

		public Criteria andTypeNameNotBetween(String value1, String value2) {
			addCriterion("type_name not between", value1, value2, "typeName");
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

		public Criteria andStatusEqualTo(String value) {
			addCriterion("status =", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotEqualTo(String value) {
			addCriterion("status <>", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusGreaterThan(String value) {
			addCriterion("status >", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusGreaterThanOrEqualTo(String value) {
			addCriterion("status >=", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLessThan(String value) {
			addCriterion("status <", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLessThanOrEqualTo(String value) {
			addCriterion("status <=", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLike(String value) {
			addCriterion("status like", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotLike(String value) {
			addCriterion("status not like", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusIn(List<String> values) {
			addCriterion("status in", values, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotIn(List<String> values) {
			addCriterion("status not in", values, "status");
			return (Criteria) this;
		}

		public Criteria andStatusBetween(String value1, String value2) {
			addCriterion("status between", value1, value2, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotBetween(String value1, String value2) {
			addCriterion("status not between", value1, value2, "status");
			return (Criteria) this;
		}

		public Criteria andCreateTimeIsNull() {
			addCriterion("create_time is null");
			return (Criteria) this;
		}

		public Criteria andCreateTimeIsNotNull() {
			addCriterion("create_time is not null");
			return (Criteria) this;
		}

		public Criteria andCreateTimeEqualTo(Date value) {
			addCriterion("create_time =", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeNotEqualTo(Date value) {
			addCriterion("create_time <>", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeGreaterThan(Date value) {
			addCriterion("create_time >", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("create_time >=", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeLessThan(Date value) {
			addCriterion("create_time <", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
			addCriterion("create_time <=", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeIn(List<Date> values) {
			addCriterion("create_time in", values, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeNotIn(List<Date> values) {
			addCriterion("create_time not in", values, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeBetween(Date value1, Date value2) {
			addCriterion("create_time between", value1, value2, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
			addCriterion("create_time not between", value1, value2,
					"createTime");
			return (Criteria) this;
		}

		public Criteria andLastUpdateTimeIsNull() {
			addCriterion("last_update_time is null");
			return (Criteria) this;
		}

		public Criteria andLastUpdateTimeIsNotNull() {
			addCriterion("last_update_time is not null");
			return (Criteria) this;
		}

		public Criteria andLastUpdateTimeEqualTo(Date value) {
			addCriterion("last_update_time =", value, "lastUpdateTime");
			return (Criteria) this;
		}

		public Criteria andLastUpdateTimeNotEqualTo(Date value) {
			addCriterion("last_update_time <>", value, "lastUpdateTime");
			return (Criteria) this;
		}

		public Criteria andLastUpdateTimeGreaterThan(Date value) {
			addCriterion("last_update_time >", value, "lastUpdateTime");
			return (Criteria) this;
		}

		public Criteria andLastUpdateTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("last_update_time >=", value, "lastUpdateTime");
			return (Criteria) this;
		}

		public Criteria andLastUpdateTimeLessThan(Date value) {
			addCriterion("last_update_time <", value, "lastUpdateTime");
			return (Criteria) this;
		}

		public Criteria andLastUpdateTimeLessThanOrEqualTo(Date value) {
			addCriterion("last_update_time <=", value, "lastUpdateTime");
			return (Criteria) this;
		}

		public Criteria andLastUpdateTimeIn(List<Date> values) {
			addCriterion("last_update_time in", values, "lastUpdateTime");
			return (Criteria) this;
		}

		public Criteria andLastUpdateTimeNotIn(List<Date> values) {
			addCriterion("last_update_time not in", values, "lastUpdateTime");
			return (Criteria) this;
		}

		public Criteria andLastUpdateTimeBetween(Date value1, Date value2) {
			addCriterion("last_update_time between", value1, value2,
					"lastUpdateTime");
			return (Criteria) this;
		}

		public Criteria andLastUpdateTimeNotBetween(Date value1, Date value2) {
			addCriterion("last_update_time not between", value1, value2,
					"lastUpdateTime");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table product_kind
	 * @mbggenerated  Thu Jun 12 16:14:17 CST 2014
	 */
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

		protected Criterion(String condition, Object value, Object secondValue,
				String typeHandler) {
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

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table product_kind
     *
     * @mbggenerated do_not_delete_during_merge Thu Jun 12 11:22:43 CST 2014
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}