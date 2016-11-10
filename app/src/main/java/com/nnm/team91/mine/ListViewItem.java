package com.nnm.team91.mine;

import android.graphics.drawable.Drawable;

/**
 * Created by tristan on 2016-11-10.
 */

public class ListViewItem {

    private Drawable sharpImg, crossImg;
    private String edtStr;

    public void setSharpImg(Drawable sharp) {
        sharpImg = sharp;
    }
    public void setEdtStr(String edt) {
        edtStr = edt;
    }
    public void setCrossImg(Drawable cross){
        crossImg = cross;
    }

    public Drawable getSharpImg() {
        return this.sharpImg;
    }
    public String getEdtStr() {
        return this.edtStr;
    }
    public Drawable getCrossImg() {
        return this.crossImg;
    }
}
