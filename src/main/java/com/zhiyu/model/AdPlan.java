package com.zhiyu.model;

/**
 * Created by zhaojianfan on 16/12/29.
 */
public class AdPlan {

    private int id;
    private String UserId;
    private String Name;
    private String Status;
    private String DayConst;
    private String RealtimeMoney;
    private String AdplanId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getDayConst() {
        return DayConst;
    }

    public void setDayConst(String dayConst) {
        DayConst = dayConst;
    }

    public String getRealtimeMoney() {
        return RealtimeMoney;
    }

    public void setRealtimeMoney(String realtimeMoney) {
        RealtimeMoney = realtimeMoney;
    }

    public String getAdplanId() {
        return AdplanId;
    }

    public void setAdplanId(String adplanId) {
        AdplanId = adplanId;
    }
}
