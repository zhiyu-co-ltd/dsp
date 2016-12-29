package com.zhiyu.model;

/**
 * Created by zhaojianfan on 16/12/29.
 */
public class User {

    private int Id;
    private String UserId;
    private String Email;
    private String QQ;
    private String Password;
    private String Name;
    private String Phone;
    private String Weixin;
    private String Type;
    private String CompanyType;
    private String AdAccountMoney;
    private String CostToday;
    private int UpdateStatus;
    private String  UpdateTime;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getQQ() {
        return QQ;
    }

    public void setQQ(String QQ) {
        this.QQ = QQ;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getWeixin() {
        return Weixin;
    }

    public void setWeixin(String weixin) {
        Weixin = weixin;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getCompanyType() {
        return CompanyType;
    }

    public void setCompanyType(String companyType) {
        CompanyType = companyType;
    }

    public String getAdAccountMoney() {
        return AdAccountMoney;
    }

    public void setAdAccountMoney(String adAccountMoney) {
        AdAccountMoney = adAccountMoney;
    }

    public String getCostToday() {
        return CostToday;
    }

    public void setCostToday(String costToday) {
        CostToday = costToday;
    }

    public int getUpdateStatus() {
        return UpdateStatus;
    }

    public void setUpdateStatus(int updateStatus) {
        UpdateStatus = updateStatus;
    }

    public String getUpdateTime() {
        return UpdateTime;
    }

    public void setUpdateTime(String updateTime) {
        UpdateTime = updateTime;
    }
}
