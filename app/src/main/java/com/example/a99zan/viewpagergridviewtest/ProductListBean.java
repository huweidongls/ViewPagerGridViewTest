package com.example.a99zan.viewpagergridviewtest;

/**
 * Created by 99zan on 2018/1/19.
 */

public class ProductListBean {
    private String proName;
    private int imgUrl;

    public ProductListBean(String proName, int imgUrl) {
        this.proName = proName;
        this.imgUrl = imgUrl;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public int getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(int imgUrl) {
        this.imgUrl = imgUrl;
    }
}
