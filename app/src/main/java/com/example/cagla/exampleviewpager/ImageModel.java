package com.example.cagla.exampleviewpager;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by done on 14/02/2017.
 */

public class ImageModel {

    private int imageId;
    private String imageName;

    public ImageModel(int imageId, String imageName) {
        this.imageId = imageId;
        this.imageName = imageName;
    }
    public int getImageId() {
        return imageId;
    }
    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
    public String getImageName() {
        return imageName;
    }
    public void setImageName(String imageName) {
        this.imageName = imageName;
    }
}
