package com.yueqian.personnel.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PPlanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PPlanExample() {
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

        public Criteria andPIdIsNull() {
            addCriterion("p_id is null");
            return (Criteria) this;
        }

        public Criteria andPIdIsNotNull() {
            addCriterion("p_id is not null");
            return (Criteria) this;
        }

        public Criteria andPIdEqualTo(Integer value) {
            addCriterion("p_id =", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotEqualTo(Integer value) {
            addCriterion("p_id <>", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThan(Integer value) {
            addCriterion("p_id >", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("p_id >=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThan(Integer value) {
            addCriterion("p_id <", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThanOrEqualTo(Integer value) {
            addCriterion("p_id <=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdIn(List<Integer> values) {
            addCriterion("p_id in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotIn(List<Integer> values) {
            addCriterion("p_id not in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdBetween(Integer value1, Integer value2) {
            addCriterion("p_id between", value1, value2, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotBetween(Integer value1, Integer value2) {
            addCriterion("p_id not between", value1, value2, "pId");
            return (Criteria) this;
        }

        public Criteria andPNameIsNull() {
            addCriterion("p_name is null");
            return (Criteria) this;
        }

        public Criteria andPNameIsNotNull() {
            addCriterion("p_name is not null");
            return (Criteria) this;
        }

        public Criteria andPNameEqualTo(String value) {
            addCriterion("p_name =", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameNotEqualTo(String value) {
            addCriterion("p_name <>", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameGreaterThan(String value) {
            addCriterion("p_name >", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameGreaterThanOrEqualTo(String value) {
            addCriterion("p_name >=", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameLessThan(String value) {
            addCriterion("p_name <", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameLessThanOrEqualTo(String value) {
            addCriterion("p_name <=", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameLike(String value) {
            addCriterion("p_name like", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameNotLike(String value) {
            addCriterion("p_name not like", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameIn(List<String> values) {
            addCriterion("p_name in", values, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameNotIn(List<String> values) {
            addCriterion("p_name not in", values, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameBetween(String value1, String value2) {
            addCriterion("p_name between", value1, value2, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameNotBetween(String value1, String value2) {
            addCriterion("p_name not between", value1, value2, "pName");
            return (Criteria) this;
        }

        public Criteria andPTeacherIsNull() {
            addCriterion("p_teacher is null");
            return (Criteria) this;
        }

        public Criteria andPTeacherIsNotNull() {
            addCriterion("p_teacher is not null");
            return (Criteria) this;
        }

        public Criteria andPTeacherEqualTo(String value) {
            addCriterion("p_teacher =", value, "pTeacher");
            return (Criteria) this;
        }

        public Criteria andPTeacherNotEqualTo(String value) {
            addCriterion("p_teacher <>", value, "pTeacher");
            return (Criteria) this;
        }

        public Criteria andPTeacherGreaterThan(String value) {
            addCriterion("p_teacher >", value, "pTeacher");
            return (Criteria) this;
        }

        public Criteria andPTeacherGreaterThanOrEqualTo(String value) {
            addCriterion("p_teacher >=", value, "pTeacher");
            return (Criteria) this;
        }

        public Criteria andPTeacherLessThan(String value) {
            addCriterion("p_teacher <", value, "pTeacher");
            return (Criteria) this;
        }

        public Criteria andPTeacherLessThanOrEqualTo(String value) {
            addCriterion("p_teacher <=", value, "pTeacher");
            return (Criteria) this;
        }

        public Criteria andPTeacherLike(String value) {
            addCriterion("p_teacher like", value, "pTeacher");
            return (Criteria) this;
        }

        public Criteria andPTeacherNotLike(String value) {
            addCriterion("p_teacher not like", value, "pTeacher");
            return (Criteria) this;
        }

        public Criteria andPTeacherIn(List<String> values) {
            addCriterion("p_teacher in", values, "pTeacher");
            return (Criteria) this;
        }

        public Criteria andPTeacherNotIn(List<String> values) {
            addCriterion("p_teacher not in", values, "pTeacher");
            return (Criteria) this;
        }

        public Criteria andPTeacherBetween(String value1, String value2) {
            addCriterion("p_teacher between", value1, value2, "pTeacher");
            return (Criteria) this;
        }

        public Criteria andPTeacherNotBetween(String value1, String value2) {
            addCriterion("p_teacher not between", value1, value2, "pTeacher");
            return (Criteria) this;
        }

        public Criteria andPDestnitionIsNull() {
            addCriterion("p_destnition is null");
            return (Criteria) this;
        }

        public Criteria andPDestnitionIsNotNull() {
            addCriterion("p_destnition is not null");
            return (Criteria) this;
        }

        public Criteria andPDestnitionEqualTo(String value) {
            addCriterion("p_destnition =", value, "pDestnition");
            return (Criteria) this;
        }

        public Criteria andPDestnitionNotEqualTo(String value) {
            addCriterion("p_destnition <>", value, "pDestnition");
            return (Criteria) this;
        }

        public Criteria andPDestnitionGreaterThan(String value) {
            addCriterion("p_destnition >", value, "pDestnition");
            return (Criteria) this;
        }

        public Criteria andPDestnitionGreaterThanOrEqualTo(String value) {
            addCriterion("p_destnition >=", value, "pDestnition");
            return (Criteria) this;
        }

        public Criteria andPDestnitionLessThan(String value) {
            addCriterion("p_destnition <", value, "pDestnition");
            return (Criteria) this;
        }

        public Criteria andPDestnitionLessThanOrEqualTo(String value) {
            addCriterion("p_destnition <=", value, "pDestnition");
            return (Criteria) this;
        }

        public Criteria andPDestnitionLike(String value) {
            addCriterion("p_destnition like", value, "pDestnition");
            return (Criteria) this;
        }

        public Criteria andPDestnitionNotLike(String value) {
            addCriterion("p_destnition not like", value, "pDestnition");
            return (Criteria) this;
        }

        public Criteria andPDestnitionIn(List<String> values) {
            addCriterion("p_destnition in", values, "pDestnition");
            return (Criteria) this;
        }

        public Criteria andPDestnitionNotIn(List<String> values) {
            addCriterion("p_destnition not in", values, "pDestnition");
            return (Criteria) this;
        }

        public Criteria andPDestnitionBetween(String value1, String value2) {
            addCriterion("p_destnition between", value1, value2, "pDestnition");
            return (Criteria) this;
        }

        public Criteria andPDestnitionNotBetween(String value1, String value2) {
            addCriterion("p_destnition not between", value1, value2, "pDestnition");
            return (Criteria) this;
        }

        public Criteria andPStimeIsNull() {
            addCriterion("p_stime is null");
            return (Criteria) this;
        }

        public Criteria andPStimeIsNotNull() {
            addCriterion("p_stime is not null");
            return (Criteria) this;
        }

        public Criteria andPStimeEqualTo(Date value) {
            addCriterion("p_stime =", value, "pStime");
            return (Criteria) this;
        }

        public Criteria andPStimeNotEqualTo(Date value) {
            addCriterion("p_stime <>", value, "pStime");
            return (Criteria) this;
        }

        public Criteria andPStimeGreaterThan(Date value) {
            addCriterion("p_stime >", value, "pStime");
            return (Criteria) this;
        }

        public Criteria andPStimeGreaterThanOrEqualTo(Date value) {
            addCriterion("p_stime >=", value, "pStime");
            return (Criteria) this;
        }

        public Criteria andPStimeLessThan(Date value) {
            addCriterion("p_stime <", value, "pStime");
            return (Criteria) this;
        }

        public Criteria andPStimeLessThanOrEqualTo(Date value) {
            addCriterion("p_stime <=", value, "pStime");
            return (Criteria) this;
        }

        public Criteria andPStimeIn(List<Date> values) {
            addCriterion("p_stime in", values, "pStime");
            return (Criteria) this;
        }

        public Criteria andPStimeNotIn(List<Date> values) {
            addCriterion("p_stime not in", values, "pStime");
            return (Criteria) this;
        }

        public Criteria andPStimeBetween(Date value1, Date value2) {
            addCriterion("p_stime between", value1, value2, "pStime");
            return (Criteria) this;
        }

        public Criteria andPStimeNotBetween(Date value1, Date value2) {
            addCriterion("p_stime not between", value1, value2, "pStime");
            return (Criteria) this;
        }

        public Criteria andPEtimeIsNull() {
            addCriterion("p_etime is null");
            return (Criteria) this;
        }

        public Criteria andPEtimeIsNotNull() {
            addCriterion("p_etime is not null");
            return (Criteria) this;
        }

        public Criteria andPEtimeEqualTo(Date value) {
            addCriterion("p_etime =", value, "pEtime");
            return (Criteria) this;
        }

        public Criteria andPEtimeNotEqualTo(Date value) {
            addCriterion("p_etime <>", value, "pEtime");
            return (Criteria) this;
        }

        public Criteria andPEtimeGreaterThan(Date value) {
            addCriterion("p_etime >", value, "pEtime");
            return (Criteria) this;
        }

        public Criteria andPEtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("p_etime >=", value, "pEtime");
            return (Criteria) this;
        }

        public Criteria andPEtimeLessThan(Date value) {
            addCriterion("p_etime <", value, "pEtime");
            return (Criteria) this;
        }

        public Criteria andPEtimeLessThanOrEqualTo(Date value) {
            addCriterion("p_etime <=", value, "pEtime");
            return (Criteria) this;
        }

        public Criteria andPEtimeIn(List<Date> values) {
            addCriterion("p_etime in", values, "pEtime");
            return (Criteria) this;
        }

        public Criteria andPEtimeNotIn(List<Date> values) {
            addCriterion("p_etime not in", values, "pEtime");
            return (Criteria) this;
        }

        public Criteria andPEtimeBetween(Date value1, Date value2) {
            addCriterion("p_etime between", value1, value2, "pEtime");
            return (Criteria) this;
        }

        public Criteria andPEtimeNotBetween(Date value1, Date value2) {
            addCriterion("p_etime not between", value1, value2, "pEtime");
            return (Criteria) this;
        }

        public Criteria andPSummaryIsNull() {
            addCriterion("p_summary is null");
            return (Criteria) this;
        }

        public Criteria andPSummaryIsNotNull() {
            addCriterion("p_summary is not null");
            return (Criteria) this;
        }

        public Criteria andPSummaryEqualTo(String value) {
            addCriterion("p_summary =", value, "pSummary");
            return (Criteria) this;
        }

        public Criteria andPSummaryNotEqualTo(String value) {
            addCriterion("p_summary <>", value, "pSummary");
            return (Criteria) this;
        }

        public Criteria andPSummaryGreaterThan(String value) {
            addCriterion("p_summary >", value, "pSummary");
            return (Criteria) this;
        }

        public Criteria andPSummaryGreaterThanOrEqualTo(String value) {
            addCriterion("p_summary >=", value, "pSummary");
            return (Criteria) this;
        }

        public Criteria andPSummaryLessThan(String value) {
            addCriterion("p_summary <", value, "pSummary");
            return (Criteria) this;
        }

        public Criteria andPSummaryLessThanOrEqualTo(String value) {
            addCriterion("p_summary <=", value, "pSummary");
            return (Criteria) this;
        }

        public Criteria andPSummaryLike(String value) {
            addCriterion("p_summary like", value, "pSummary");
            return (Criteria) this;
        }

        public Criteria andPSummaryNotLike(String value) {
            addCriterion("p_summary not like", value, "pSummary");
            return (Criteria) this;
        }

        public Criteria andPSummaryIn(List<String> values) {
            addCriterion("p_summary in", values, "pSummary");
            return (Criteria) this;
        }

        public Criteria andPSummaryNotIn(List<String> values) {
            addCriterion("p_summary not in", values, "pSummary");
            return (Criteria) this;
        }

        public Criteria andPSummaryBetween(String value1, String value2) {
            addCriterion("p_summary between", value1, value2, "pSummary");
            return (Criteria) this;
        }

        public Criteria andPSummaryNotBetween(String value1, String value2) {
            addCriterion("p_summary not between", value1, value2, "pSummary");
            return (Criteria) this;
        }

        public Criteria andPPersonIsNull() {
            addCriterion("p_person is null");
            return (Criteria) this;
        }

        public Criteria andPPersonIsNotNull() {
            addCriterion("p_person is not null");
            return (Criteria) this;
        }

        public Criteria andPPersonEqualTo(String value) {
            addCriterion("p_person =", value, "pPerson");
            return (Criteria) this;
        }

        public Criteria andPPersonNotEqualTo(String value) {
            addCriterion("p_person <>", value, "pPerson");
            return (Criteria) this;
        }

        public Criteria andPPersonGreaterThan(String value) {
            addCriterion("p_person >", value, "pPerson");
            return (Criteria) this;
        }

        public Criteria andPPersonGreaterThanOrEqualTo(String value) {
            addCriterion("p_person >=", value, "pPerson");
            return (Criteria) this;
        }

        public Criteria andPPersonLessThan(String value) {
            addCriterion("p_person <", value, "pPerson");
            return (Criteria) this;
        }

        public Criteria andPPersonLessThanOrEqualTo(String value) {
            addCriterion("p_person <=", value, "pPerson");
            return (Criteria) this;
        }

        public Criteria andPPersonLike(String value) {
            addCriterion("p_person like", value, "pPerson");
            return (Criteria) this;
        }

        public Criteria andPPersonNotLike(String value) {
            addCriterion("p_person not like", value, "pPerson");
            return (Criteria) this;
        }

        public Criteria andPPersonIn(List<String> values) {
            addCriterion("p_person in", values, "pPerson");
            return (Criteria) this;
        }

        public Criteria andPPersonNotIn(List<String> values) {
            addCriterion("p_person not in", values, "pPerson");
            return (Criteria) this;
        }

        public Criteria andPPersonBetween(String value1, String value2) {
            addCriterion("p_person between", value1, value2, "pPerson");
            return (Criteria) this;
        }

        public Criteria andPPersonNotBetween(String value1, String value2) {
            addCriterion("p_person not between", value1, value2, "pPerson");
            return (Criteria) this;
        }

        public Criteria andPDatumIsNull() {
            addCriterion("p_datum is null");
            return (Criteria) this;
        }

        public Criteria andPDatumIsNotNull() {
            addCriterion("p_datum is not null");
            return (Criteria) this;
        }

        public Criteria andPDatumEqualTo(String value) {
            addCriterion("p_datum =", value, "pDatum");
            return (Criteria) this;
        }

        public Criteria andPDatumNotEqualTo(String value) {
            addCriterion("p_datum <>", value, "pDatum");
            return (Criteria) this;
        }

        public Criteria andPDatumGreaterThan(String value) {
            addCriterion("p_datum >", value, "pDatum");
            return (Criteria) this;
        }

        public Criteria andPDatumGreaterThanOrEqualTo(String value) {
            addCriterion("p_datum >=", value, "pDatum");
            return (Criteria) this;
        }

        public Criteria andPDatumLessThan(String value) {
            addCriterion("p_datum <", value, "pDatum");
            return (Criteria) this;
        }

        public Criteria andPDatumLessThanOrEqualTo(String value) {
            addCriterion("p_datum <=", value, "pDatum");
            return (Criteria) this;
        }

        public Criteria andPDatumLike(String value) {
            addCriterion("p_datum like", value, "pDatum");
            return (Criteria) this;
        }

        public Criteria andPDatumNotLike(String value) {
            addCriterion("p_datum not like", value, "pDatum");
            return (Criteria) this;
        }

        public Criteria andPDatumIn(List<String> values) {
            addCriterion("p_datum in", values, "pDatum");
            return (Criteria) this;
        }

        public Criteria andPDatumNotIn(List<String> values) {
            addCriterion("p_datum not in", values, "pDatum");
            return (Criteria) this;
        }

        public Criteria andPDatumBetween(String value1, String value2) {
            addCriterion("p_datum between", value1, value2, "pDatum");
            return (Criteria) this;
        }

        public Criteria andPDatumNotBetween(String value1, String value2) {
            addCriterion("p_datum not between", value1, value2, "pDatum");
            return (Criteria) this;
        }

        public Criteria andPIntroIsNull() {
            addCriterion("p_intro is null");
            return (Criteria) this;
        }

        public Criteria andPIntroIsNotNull() {
            addCriterion("p_intro is not null");
            return (Criteria) this;
        }

        public Criteria andPIntroEqualTo(String value) {
            addCriterion("p_intro =", value, "pIntro");
            return (Criteria) this;
        }

        public Criteria andPIntroNotEqualTo(String value) {
            addCriterion("p_intro <>", value, "pIntro");
            return (Criteria) this;
        }

        public Criteria andPIntroGreaterThan(String value) {
            addCriterion("p_intro >", value, "pIntro");
            return (Criteria) this;
        }

        public Criteria andPIntroGreaterThanOrEqualTo(String value) {
            addCriterion("p_intro >=", value, "pIntro");
            return (Criteria) this;
        }

        public Criteria andPIntroLessThan(String value) {
            addCriterion("p_intro <", value, "pIntro");
            return (Criteria) this;
        }

        public Criteria andPIntroLessThanOrEqualTo(String value) {
            addCriterion("p_intro <=", value, "pIntro");
            return (Criteria) this;
        }

        public Criteria andPIntroLike(String value) {
            addCriterion("p_intro like", value, "pIntro");
            return (Criteria) this;
        }

        public Criteria andPIntroNotLike(String value) {
            addCriterion("p_intro not like", value, "pIntro");
            return (Criteria) this;
        }

        public Criteria andPIntroIn(List<String> values) {
            addCriterion("p_intro in", values, "pIntro");
            return (Criteria) this;
        }

        public Criteria andPIntroNotIn(List<String> values) {
            addCriterion("p_intro not in", values, "pIntro");
            return (Criteria) this;
        }

        public Criteria andPIntroBetween(String value1, String value2) {
            addCriterion("p_intro between", value1, value2, "pIntro");
            return (Criteria) this;
        }

        public Criteria andPIntroNotBetween(String value1, String value2) {
            addCriterion("p_intro not between", value1, value2, "pIntro");
            return (Criteria) this;
        }

        public Criteria andPIdeaIsNull() {
            addCriterion("p_idea is null");
            return (Criteria) this;
        }

        public Criteria andPIdeaIsNotNull() {
            addCriterion("p_idea is not null");
            return (Criteria) this;
        }

        public Criteria andPIdeaEqualTo(String value) {
            addCriterion("p_idea =", value, "pIdea");
            return (Criteria) this;
        }

        public Criteria andPIdeaNotEqualTo(String value) {
            addCriterion("p_idea <>", value, "pIdea");
            return (Criteria) this;
        }

        public Criteria andPIdeaGreaterThan(String value) {
            addCriterion("p_idea >", value, "pIdea");
            return (Criteria) this;
        }

        public Criteria andPIdeaGreaterThanOrEqualTo(String value) {
            addCriterion("p_idea >=", value, "pIdea");
            return (Criteria) this;
        }

        public Criteria andPIdeaLessThan(String value) {
            addCriterion("p_idea <", value, "pIdea");
            return (Criteria) this;
        }

        public Criteria andPIdeaLessThanOrEqualTo(String value) {
            addCriterion("p_idea <=", value, "pIdea");
            return (Criteria) this;
        }

        public Criteria andPIdeaLike(String value) {
            addCriterion("p_idea like", value, "pIdea");
            return (Criteria) this;
        }

        public Criteria andPIdeaNotLike(String value) {
            addCriterion("p_idea not like", value, "pIdea");
            return (Criteria) this;
        }

        public Criteria andPIdeaIn(List<String> values) {
            addCriterion("p_idea in", values, "pIdea");
            return (Criteria) this;
        }

        public Criteria andPIdeaNotIn(List<String> values) {
            addCriterion("p_idea not in", values, "pIdea");
            return (Criteria) this;
        }

        public Criteria andPIdeaBetween(String value1, String value2) {
            addCriterion("p_idea between", value1, value2, "pIdea");
            return (Criteria) this;
        }

        public Criteria andPIdeaNotBetween(String value1, String value2) {
            addCriterion("p_idea not between", value1, value2, "pIdea");
            return (Criteria) this;
        }

        public Criteria andPCouplebackIsNull() {
            addCriterion("p_coupleback is null");
            return (Criteria) this;
        }

        public Criteria andPCouplebackIsNotNull() {
            addCriterion("p_coupleback is not null");
            return (Criteria) this;
        }

        public Criteria andPCouplebackEqualTo(String value) {
            addCriterion("p_coupleback =", value, "pCoupleback");
            return (Criteria) this;
        }

        public Criteria andPCouplebackNotEqualTo(String value) {
            addCriterion("p_coupleback <>", value, "pCoupleback");
            return (Criteria) this;
        }

        public Criteria andPCouplebackGreaterThan(String value) {
            addCriterion("p_coupleback >", value, "pCoupleback");
            return (Criteria) this;
        }

        public Criteria andPCouplebackGreaterThanOrEqualTo(String value) {
            addCriterion("p_coupleback >=", value, "pCoupleback");
            return (Criteria) this;
        }

        public Criteria andPCouplebackLessThan(String value) {
            addCriterion("p_coupleback <", value, "pCoupleback");
            return (Criteria) this;
        }

        public Criteria andPCouplebackLessThanOrEqualTo(String value) {
            addCriterion("p_coupleback <=", value, "pCoupleback");
            return (Criteria) this;
        }

        public Criteria andPCouplebackLike(String value) {
            addCriterion("p_coupleback like", value, "pCoupleback");
            return (Criteria) this;
        }

        public Criteria andPCouplebackNotLike(String value) {
            addCriterion("p_coupleback not like", value, "pCoupleback");
            return (Criteria) this;
        }

        public Criteria andPCouplebackIn(List<String> values) {
            addCriterion("p_coupleback in", values, "pCoupleback");
            return (Criteria) this;
        }

        public Criteria andPCouplebackNotIn(List<String> values) {
            addCriterion("p_coupleback not in", values, "pCoupleback");
            return (Criteria) this;
        }

        public Criteria andPCouplebackBetween(String value1, String value2) {
            addCriterion("p_coupleback between", value1, value2, "pCoupleback");
            return (Criteria) this;
        }

        public Criteria andPCouplebackNotBetween(String value1, String value2) {
            addCriterion("p_coupleback not between", value1, value2, "pCoupleback");
            return (Criteria) this;
        }

        public Criteria andPResultIsNull() {
            addCriterion("p_result is null");
            return (Criteria) this;
        }

        public Criteria andPResultIsNotNull() {
            addCriterion("p_result is not null");
            return (Criteria) this;
        }

        public Criteria andPResultEqualTo(String value) {
            addCriterion("p_result =", value, "pResult");
            return (Criteria) this;
        }

        public Criteria andPResultNotEqualTo(String value) {
            addCriterion("p_result <>", value, "pResult");
            return (Criteria) this;
        }

        public Criteria andPResultGreaterThan(String value) {
            addCriterion("p_result >", value, "pResult");
            return (Criteria) this;
        }

        public Criteria andPResultGreaterThanOrEqualTo(String value) {
            addCriterion("p_result >=", value, "pResult");
            return (Criteria) this;
        }

        public Criteria andPResultLessThan(String value) {
            addCriterion("p_result <", value, "pResult");
            return (Criteria) this;
        }

        public Criteria andPResultLessThanOrEqualTo(String value) {
            addCriterion("p_result <=", value, "pResult");
            return (Criteria) this;
        }

        public Criteria andPResultLike(String value) {
            addCriterion("p_result like", value, "pResult");
            return (Criteria) this;
        }

        public Criteria andPResultNotLike(String value) {
            addCriterion("p_result not like", value, "pResult");
            return (Criteria) this;
        }

        public Criteria andPResultIn(List<String> values) {
            addCriterion("p_result in", values, "pResult");
            return (Criteria) this;
        }

        public Criteria andPResultNotIn(List<String> values) {
            addCriterion("p_result not in", values, "pResult");
            return (Criteria) this;
        }

        public Criteria andPResultBetween(String value1, String value2) {
            addCriterion("p_result between", value1, value2, "pResult");
            return (Criteria) this;
        }

        public Criteria andPResultNotBetween(String value1, String value2) {
            addCriterion("p_result not between", value1, value2, "pResult");
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