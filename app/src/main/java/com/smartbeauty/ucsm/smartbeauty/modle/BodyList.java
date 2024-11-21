package com.smartbeauty.ucsm.smartbeauty.modle;

/**
 * Created by CUSM on 10/29/2016.
 */

public class BodyList {
    private String name;
    private int image;

    public BodyList() {
    }

    public BodyList(String name, int image) {
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
