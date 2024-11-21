package com.smartbeauty.ucsm.smartbeauty.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;

import com.smartbeauty.ucsm.smartbeauty.R;
import com.smartbeauty.ucsm.smartbeauty.adapter.HairFragmentPagerAdapter;



public class HairActivity extends AppCompatActivity {
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
        HairFragmentPagerAdapter hairFragmentPagerAdapter = new HairFragmentPagerAdapter(fragmentManager);
        viewPager.setAdapter(hairFragmentPagerAdapter);

        tabLayout.addTab(tabLayout.newTab().setText("ဆံပင္ထံုးဖြဲ႕နည္း"));
        tabLayout.addTab(tabLayout.newTab().setText("ဆံသားထိန္းသိမ္းကာကြယ္နည္း"));
        tabLayout.addTab(tabLayout.newTab().setText("ဆံပင္ဒီဇိုင္း"));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
               // Toast.makeText(getApplicationContext(),"tap action",Toast.LENGTH_LONG).show();
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
