package com.example.cagla.exampleviewpager;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by done on 13/02/2017.
 */

public class ImageAdapter extends PagerAdapter {

    private Context mContext;
    private List<ImageModel> imageList;
    private LayoutInflater layoutInflater;


    public ImageAdapter(Context context, List<ImageModel> imageList) {
        this.mContext = context;
        this.imageList = imageList;
        this.layoutInflater = (LayoutInflater)this.mContext.getSystemService(this.mContext.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        View view = this.layoutInflater.inflate(R.layout.item_image, container, false);

        ImageView displayImage  = (ImageView)   view.findViewById(R.id.large_image);
        TextView imageText      = (TextView)    view.findViewById(R.id.image_name);

        displayImage.setImageResource(imageList.get(position).getImageId());
        imageText.setText(imageList.get(position).getImageName());

        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    @Override
    public int getCount() {
        return imageList.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

}
