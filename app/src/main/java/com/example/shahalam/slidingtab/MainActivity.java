package com.example.shahalam.slidingtab;

import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.shahalam.slidingtab.Tabs.TabOne;
import com.example.shahalam.slidingtab.Tabs.TabTwo;
import com.example.shahalam.slidingtab.Tabs.TabThree;

public class MainActivity extends AppCompatActivity implements TabOne.OnFragmentInteractionListener,TabTwo.OnFragmentInteractionListener,TabThree.OnFragmentInteractionListener{

    ViewPager viewPager;
    TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.viewPager);
        tabLayout = findViewById(R.id.tabLayout);

        MyViewPagerAdapter pagerAdapter = new MyViewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(pagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
