package com.example.cagla.exampleviewpager;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by done on 13/02/2017.
 */

public class SecondActivity extends AppCompatActivity {

    @BindView(R.id.image_view_pager)
    ViewPager imageViewPager;

    @OnClick(R.id.main_button)
    public void setMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ButterKnife.bind(this);

        List<ImageModel> allImages = addImages();
        ImageAdapter imageAdapter = new ImageAdapter(this, allImages);
        imageViewPager.setAdapter(imageAdapter);
    }


    private List<ImageModel> addImages(){
        List<ImageModel> images = new ArrayList<>();
        images.add(new ImageModel(R.drawable.tiger, "Tiger"));
        images.add(new ImageModel(R.drawable.up, "Up"));
        images.add(new ImageModel(R.drawable.eyes, "Eyes"));
        images.add(new ImageModel(R.drawable.cosmos, "Cosmos"));

        return images;
    }
}
