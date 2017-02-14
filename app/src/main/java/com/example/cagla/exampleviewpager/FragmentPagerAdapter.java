package com.example.cagla.exampleviewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.cagla.exampleviewpager.fragments.FirstFragment;
import com.example.cagla.exampleviewpager.fragments.ForthFragment;
import com.example.cagla.exampleviewpager.fragments.SecondFragment;
import com.example.cagla.exampleviewpager.fragments.ThirdFragment;

/**
 * Created by done on 29/01/2017.
 */

public class FragmentPagerAdapter extends FragmentStatePagerAdapter {

    public FragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new FirstFragment();
            case 1:
                return new SecondFragment();
            case 2:
                return new ThirdFragment();
            case 3:
                return new ForthFragment();
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return 4;
    }

}
