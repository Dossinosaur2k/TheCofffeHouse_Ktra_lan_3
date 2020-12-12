package com.example.thecoffeehouse;

import android.widget.Spinner;

public class itemmap {
    String namestore,mota;
    double x,y;
    Integer image;

    public itemmap(String namestore, String mota, double x, double y, Integer image) {
        this.namestore = namestore;
        this.mota = mota;
        this.x = x;
        this.y = y;
        this.image=image;
    }

    public String getNamestore() {
        return namestore;
    }

    public void setNamestore(String namestore) {
        this.namestore = namestore;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }


    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
