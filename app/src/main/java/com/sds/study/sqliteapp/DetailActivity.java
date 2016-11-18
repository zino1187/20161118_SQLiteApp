package com.sds.study.sqliteapp;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;

/*
  Created by student on 2016-11-18.
*/
public class DetailActivity extends AppCompatActivity{
    ImageView img;
    LinearLayout layout;
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_detail);

        img=(ImageView)findViewById(R.id.img);
        AnimationDrawable drawable=null;
        drawable=(AnimationDrawable)img.getDrawable();
        drawable.start();

        layout=(LinearLayout) findViewById(R.id.layout);
        AnimationDrawable back=null;
        back=(AnimationDrawable) layout.getBackground();
        back.start();
    }
}










