package com.example.carlos.recyclerview;

public class Serie {
    private String name;
    private String caps;
    private int img;
    private String desc;

    public Serie(String name, String caps, int img, String desc) {
        this.name = name;
        this.caps = caps;
        this.img = img;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getCaps() {
        return caps;
    }

    public int getImg() {
        return img;
    }

    public String getDesc() {
        return desc;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCaps(String caps) {
        this.caps = caps;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
