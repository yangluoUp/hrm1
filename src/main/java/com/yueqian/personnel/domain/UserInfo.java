package com.yueqian.personnel.domain;

public class UserInfo {
    private Integer userId;

    private String userName;

    private String userPassword;

    private String userDuty;

    public UserInfo() {
    }

    public UserInfo(Integer userId, String userName, String userPassword, String userDuty) {
        this.userId = userId;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userDuty = userDuty;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getUserDuty() {
        return userDuty;
    }

    public void setUserDuty(String userDuty) {
        this.userDuty = userDuty == null ? null : userDuty.trim();
    }
}