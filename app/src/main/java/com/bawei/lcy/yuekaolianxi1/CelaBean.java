package com.bawei.lcy.yuekaolianxi1;

/**
 * Created by LCY on 2017/9/19.
 */

public class CelaBean {
    private int image;
    private String name;

    public CelaBean(int image, String name) {
        this.image = image;
        this.name = name;
    }

    @Override
    public String toString() {
        return "CelaBean{" +
                "image=" + image +
                ", name='" + name + '\'' +
                '}';
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
