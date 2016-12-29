package com.zhiyu.model;

/**
 * Created by zhaojianfan on 16/12/29.
 */
public class MaterialVideo {

    private int Id;
    private String Name;
    private String MaterialId;
    private String AdId;
    private String Size;
    private String Type;
    private String VideoUrl;
    private String ImageUrl;
    private int PlayTime;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getMaterialId() {
        return MaterialId;
    }

    public void setMaterialId(String materialId) {
        MaterialId = materialId;
    }

    public String getAdId() {
        return AdId;
    }

    public void setAdId(String adId) {
        AdId = adId;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String size) {
        Size = size;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getVideoUrl() {
        return VideoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        VideoUrl = videoUrl;
    }

    public String getImageUrl() {
        return ImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        ImageUrl = imageUrl;
    }

    public int getPlayTime() {
        return PlayTime;
    }

    public void setPlayTime(int playTime) {
        PlayTime = playTime;
    }
}
