package com.smartbeauty.ucsm.smartbeauty.activity;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;
import android.widget.ViewFlipper;

import com.smartbeauty.ucsm.smartbeauty.R;
import com.smartbeauty.ucsm.smartbeauty.adapter.FaceFragmentPagerAdapter;
import com.smartbeauty.ucsm.smartbeauty.adapter.HairFragmentPagerAdapter;



public class FaceActivity extends AppCompatActivity {
    public static TabLayout tabLayout;
    public static ViewPager viewPager;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hair_main);
        tabLayout=(TabLayout)findViewById(R.id.tabs);
        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        FragmentManager fragmentManager = getSupportFragmentManager();
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        FaceFragmentPagerAdapter faceFragmentPagerAdapter=new FaceFragmentPagerAdapter(fragmentManager);
        viewPager.setAdapter(faceFragmentPagerAdapter);

        tabLayout.addTab(tabLayout.newTab().setText("ျဖဴစင္၀င္းပေသာ မ်က္ႏွာေလးပိုင္ဆိုင္ေစရန္"));
        tabLayout.addTab(tabLayout.newTab().setText("လိုင္နာဆြဲနည္းမ်ား"));
        tabLayout.addTab(tabLayout.newTab().setText("မ်က္ခံုးေမႊးဆြဲနည္းမ်ား"));
        tabLayout.addTab(tabLayout.newTab().setText("ႏွာေခါင္းပံုေဖာ္နည္းမ်ား"));
        tabLayout.addTab(tabLayout.newTab().setText("ႏႈတ္ခမ္းနီဆိုးနည္းမ်ုား"));
        tabLayout.addTab(tabLayout.newTab().setText("ပါးနီျခယ္နည္းမ်ား"));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


    }
}