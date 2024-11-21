package com.smartbeauty.ucsm.smartbeauty.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.smartbeauty.ucsm.smartbeauty.fragment.HairCoiffureFragment;
import com.smartbeauty.ucsm.smartbeauty.fragment.HairMaintainableFragment;
import com.smartbeauty.ucsm.smartbeauty.fragment.HairStyleTypeFragment;

public class HairFragmentPagerAdapter extends FragmentStatePagerAdapter {
    final int Fragment_Page_Count=3;
    public  HairFragmentPagerAdapter(FragmentManager fm){
        super(fm);
    }
    public Fragment getItem(int position){
        switch (position){
            case 0:
                HairCoiffureFragment Hcoi=new HairCoiffureFragment();
                return  Hcoi;
            case 1:
                HairMaintainableFragment Hmai=new HairMaintainableFragment();
                return Hmai;
            case 2:
                HairStyleTypeFragment Hsty=new HairStyleTypeFragment();
                return Hsty;
        }
        return null;
    }

    @Override
    public int getCount() {
        return Fragment_Page_Count;
    }
}
