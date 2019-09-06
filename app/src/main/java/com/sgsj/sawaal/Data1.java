package com.sgsj.sawaal;

import android.support.v7.widget.CardView;
import android.widget.ImageView;

public class Data1 {
    public String profilename;
    public String profilescore;
    public ImageView profileimg;

    Data1(String profilename, String profilescore, ImageView profileimg) {
        this.profilename = profilename;
        this.profilescore=profilescore;
        this.profileimg = profileimg;
    }
}
