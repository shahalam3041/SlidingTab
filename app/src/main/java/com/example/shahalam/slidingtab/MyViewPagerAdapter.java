package com.example.shahalam.slidingtab;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.shahalam.slidingtab.Tabs.TabOne;
import com.example.shahalam.slidingtab.Tabs.TabThree;
import com.example.shahalam.slidingtab.Tabs.TabTwo;

public class MyViewPagerAdapter extends FragmentStatePagerAdapter {
    public MyViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0: return new TabOne();
            case 1: return new TabTwo();
            case 2: return new TabThree();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position)
        {
            case 0: return "TabOne";
            case 1: return "TabTwo";
            case 2: return "TabThree";
            default: return null;
        }
    }
}
