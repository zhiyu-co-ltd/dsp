package com.zhiyu.model;

/**
 * Created by zhaojianfan on 16/12/29.
 */
public class Area {

    private int id;
    private String name;
    private String AreaId;
    private String ParentsId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAreaId() {
        return AreaId;
    }

    public void setAreaId(String areaId) {
        AreaId = areaId;
    }

    public String getParentsId() {
        return ParentsId;
    }

    public void setParentsId(String parentsId) {
        ParentsId = parentsId;
    }
}
