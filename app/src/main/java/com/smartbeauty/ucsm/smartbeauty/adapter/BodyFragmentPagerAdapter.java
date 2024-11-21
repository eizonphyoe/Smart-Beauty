package com.smartbeauty.ucsm.smartbeauty.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.smartbeauty.ucsm.smartbeauty.fragment.ArmFragment;
import com.smartbeauty.ucsm.smartbeauty.fragment.BellyFragment;
import com.smartbeauty.ucsm.smartbeauty.fragment.CalfFragment;
import com.smartbeauty.ucsm.smartbeauty.fragment.LumberFragment;
import com.smartbeauty.ucsm.smartbeauty.fragment.TallFragment;
import com.smartbeauty.ucsm.smartbeauty.fragment.ThighFragment;

public class BodyFragmentPagerAdapter extends FragmentStatePagerAdapter {



    final int fragment_page_count=6;

    public BodyFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                ArmFragment armFragment=new ArmFragment();
                return armFragment;
            case 1:
                LumberFragment lumberFragment=new LumberFragment();
                return lumberFragment;
            case 2:
                BellyFragment bellyFragment=new BellyFragment();
                return bellyFragment;
            case 3:
                ThighFragment thighFragment=new ThighFragment();
                return thighFragment;
            case 4:
                CalfFragment calfFragment=new CalfFragment();
                return calfFragment;
            case 5:
                TallFragment tallFragment=new TallFragment();
                return tallFragment;
        }
        return null;
    }

    @Override
    public int getCount() {
        return fragment_page_count;
    }

}