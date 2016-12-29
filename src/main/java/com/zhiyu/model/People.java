package com.zhiyu.model;

/**
 * Created by zhaojianfan on 16/12/29.
 */
public class People {

    private int id;
    private String name;
    private String PeopleId;
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

    public String getPeopleId() {
        return PeopleId;
    }

    public void setPeopleId(String peopleId) {
        PeopleId = peopleId;
    }

    public String getParentsId() {
        return ParentsId;
    }

    public void setParentsId(String parentsId) {
        ParentsId = parentsId;
    }
}
