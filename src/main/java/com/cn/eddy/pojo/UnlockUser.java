package com.cn.eddy.pojo;

import java.util.Date;

public class UnlockUser {
    private Long jobId;

    private String custCode;

    private String suppCode;

    private String rejectRemark;

    private String creator;

    private Date createTime;

    private String modifier;

    private Date modifyTime;

    private Short recVer;

    private Short isDelete;

    private String substr1;

    private String substr2;

    private String substr3;

    private Date subdate1;

    private Date subdate2;

    private Date subdate3;

    private Short subnum1;

    private Short subnum2;

    private Short subnum3;

    private Date starttime;

    private Date closetime;

    private String startoperator;

    private String closeoperator;

    public Long getJobId() {
        return jobId;
    }

    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    public String getCustCode() {
        return custCode;
    }

    public void setCustCode(String custCode) {
        this.custCode = custCode == null ? null : custCode.trim();
    }

    public String getSuppCode() {
        return suppCode;
    }

    public void setSuppCode(String suppCode) {
        this.suppCode = suppCode == null ? null : suppCode.trim();
    }

    public String getRejectRemark() {
        return rejectRemark;
    }

    public void setRejectRemark(String rejectRemark) {
        this.rejectRemark = rejectRemark == null ? null : rejectRemark.trim();
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Short getRecVer() {
        return recVer;
    }

    public void setRecVer(Short recVer) {
        this.recVer = recVer;
    }

    public Short getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Short isDelete) {
        this.isDelete = isDelete;
    }

    public String getSubstr1() {
        return substr1;
    }

    public void setSubstr1(String substr1) {
        this.substr1 = substr1 == null ? null : substr1.trim();
    }

    public String getSubstr2() {
        return substr2;
    }

    public void setSubstr2(String substr2) {
        this.substr2 = substr2 == null ? null : substr2.trim();
    }

    public String getSubstr3() {
        return substr3;
    }

    public void setSubstr3(String substr3) {
        this.substr3 = substr3 == null ? null : substr3.trim();
    }

    public Date getSubdate1() {
        return subdate1;
    }

    public void setSubdate1(Date subdate1) {
        this.subdate1 = subdate1;
    }

    public Date getSubdate2() {
        return subdate2;
    }

    public void setSubdate2(Date subdate2) {
        this.subdate2 = subdate2;
    }

    public Date getSubdate3() {
        return subdate3;
    }

    public void setSubdate3(Date subdate3) {
        this.subdate3 = subdate3;
    }

    public Short getSubnum1() {
        return subnum1;
    }

    public void setSubnum1(Short subnum1) {
        this.subnum1 = subnum1;
    }

    public Short getSubnum2() {
        return subnum2;
    }

    public void setSubnum2(Short subnum2) {
        this.subnum2 = subnum2;
    }

    public Short getSubnum3() {
        return subnum3;
    }

    public void setSubnum3(Short subnum3) {
        this.subnum3 = subnum3;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getClosetime() {
        return closetime;
    }

    public void setClosetime(Date closetime) {
        this.closetime = closetime;
    }

    public String getStartoperator() {
        return startoperator;
    }

    public void setStartoperator(String startoperator) {
        this.startoperator = startoperator == null ? null : startoperator.trim();
    }

    public String getCloseoperator() {
        return closeoperator;
    }

    public void setCloseoperator(String closeoperator) {
        this.closeoperator = closeoperator == null ? null : closeoperator.trim();
    }
}