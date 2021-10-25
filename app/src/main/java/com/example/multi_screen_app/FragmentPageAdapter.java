package com.example.multi_screen_app;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


public class FragmentPageAdapter extends FragmentPagerAdapter{

    public FragmentPagerAdapter(
            FragmentManager fm)
    {
        super(fm);
    }



    @Override
    public Fragment getItem(int position)
    {
        if (position == 0) {
            return new CampusTour1();
        }
        else if (position == 1) {
            return new Fragment2();
        }
        else {
            return new Fragmnet3();
        }
    }

    @Override
    public int getCount()
    {
        return 3;
    }
}
