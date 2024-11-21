package com.smartbeauty.ucsm.smartbeauty.modle;
public class FaceList {
    private String name;
    private int image;

    public FaceList() {
    }

    public FaceList(String name, int image) {
        this.name = name;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}