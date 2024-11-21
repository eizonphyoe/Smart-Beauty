package com.smartbeauty.ucsm.smartbeauty.activity;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.smartbeauty.ucsm.smartbeauty.R;
import com.smartbeauty.ucsm.smartbeauty.adapter.BodyFragmentPagerAdapter;
import com.smartbeauty.ucsm.smartbeauty.adapter.FaceFragmentPagerAdapter;
import com.smartbeauty.ucsm.smartbeauty.adapter.HairFragmentPagerAdapter;



public class BodyActivity extends AppCompatActivity {
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
        BodyFragmentPagerAdapter bodyFragmentPagerAdapter=new BodyFragmentPagerAdapter(fragmentManager);
        viewPager.setAdapter(bodyFragmentPagerAdapter);

        tabLayout.addTab(tabLayout.newTab().setText("လက္ေမာင္းအဆီခ်နည္းမ်ား"));
        tabLayout.addTab(tabLayout.newTab().setText("ခါးအဆီခ်နည္းမ်ား"));
        tabLayout.addTab(tabLayout.newTab().setText("ဗိုက္အဆီခ်နည္းမ်ား"));
        tabLayout.addTab(tabLayout.newTab().setText("ေပါင္အဆီခ်နည္းမ်ား"));
        tabLayout.addTab(tabLayout.newTab().setText("ေျခသလံုးအဆီခ်နည္း"));
        tabLayout.addTab(tabLayout.newTab().setText("အရပ္ရွည္ရန္ နည္းလမ္းမ်ား"));
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