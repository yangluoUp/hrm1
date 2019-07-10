package com.yueqian.personnel.domain;

import java.util.Date;

public class PPlan {
    private Integer pId;

    private String pName;

    private String pTeacher;

    private String pDestnition;

    private Date pStime;

    private Date pEtime;

    private String pSummary;

    private String pPerson;

    private String pDatum;

    private String pIntro;

    private String pIdea;

    private String pCoupleback;

    private String pResult;

    public PPlan() {
    }

    public PPlan(Integer pId, String pName, String pTeacher, String pDestnition, Date pStime, Date pEtime, String pSummary, String pPerson, String pDatum, String pIntro, String pIdea, String pCoupleback, String pResult) {
        this.pId = pId;
        this.pName = pName;
        this.pTeacher = pTeacher;
        this.pDestnition = pDestnition;
        this.pStime = pStime;
        this.pEtime = pEtime;
        this.pSummary = pSummary;
        this.pPerson = pPerson;
        this.pDatum = pDatum;
        this.pIntro = pIntro;
        this.pIdea = pIdea;
        this.pCoupleback = pCoupleback;
        this.pResult = pResult;
    }

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName == null ? null : pName.trim();
    }

    public String getpTeacher() {
        return pTeacher;
    }

    public void setpTeacher(String pTeacher) {
        this.pTeacher = pTeacher == null ? null : pTeacher.trim();
    }

    public String getpDestnition() {
        return pDestnition;
    }

    public void setpDestnition(String pDestnition) {
        this.pDestnition = pDestnition == null ? null : pDestnition.trim();
    }

    public Date getpStime() {
        return pStime;
    }

    public void setpStime(Date pStime) {
        this.pStime = pStime;
    }

    public Date getpEtime() {
        return pEtime;
    }

    public void setpEtime(Date pEtime) {
        this.pEtime = pEtime;
    }

    public String getpSummary() {
        return pSummary;
    }

    public void setpSummary(String pSummary) {
        this.pSummary = pSummary == null ? null : pSummary.trim();
    }

    public String getpPerson() {
        return pPerson;
    }

    public void setpPerson(String pPerson) {
        this.pPerson = pPerson == null ? null : pPerson.trim();
    }

    public String getpDatum() {
        return pDatum;
    }

    public void setpDatum(String pDatum) {
        this.pDatum = pDatum == null ? null : pDatum.trim();
    }

    public String getpIntro() {
        return pIntro;
    }

    public void setpIntro(String pIntro) {
        this.pIntro = pIntro == null ? null : pIntro.trim();
    }

    public String getpIdea() {
        return pIdea;
    }

    public void setpIdea(String pIdea) {
        this.pIdea = pIdea == null ? null : pIdea.trim();
    }

    public String getpCoupleback() {
        return pCoupleback;
    }

    public void setpCoupleback(String pCoupleback) {
        this.pCoupleback = pCoupleback == null ? null : pCoupleback.trim();
    }

    public String getpResult() {
        return pResult;
    }

    public void setpResult(String pResult) {
        this.pResult = pResult == null ? null : pResult.trim();
    }
}