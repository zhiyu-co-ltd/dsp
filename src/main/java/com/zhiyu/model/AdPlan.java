package com.zhiyu.model;


import javax.persistence.Column;
import javax.persistence.Table;

/**
 * Created by zhaojianfan on 16/12/29.
 */
@Table(name="T_Adplan")
public class AdPlan  extends BaseEntity{


    private String userId;
    private String name;
    private String status;
    @Column(name = "dayconst")
    private String dayConst;
    private String realtimeMoney;
    private String adplanId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDayConst() {
        return dayConst;
    }

    public void setDayConst(String dayConst) {
        this.dayConst = dayConst;
    }

    public String getRealtimeMoney() {
        return realtimeMoney;
    }

    public void setRealtimeMoney(String realtimeMoney) {
        this.realtimeMoney = realtimeMoney;
    }

    public String getAdplanId() {
        return adplanId;
    }

    public void setAdplanId(String adplanId) {
        this.adplanId = adplanId;
    }
}
