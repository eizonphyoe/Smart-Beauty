package com.smartbeauty.ucsm.smartbeauty.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.smartbeauty.ucsm.smartbeauty.fragment.BlusherFragment;
import com.smartbeauty.ucsm.smartbeauty.fragment.EyeLinerFragment;
import com.smartbeauty.ucsm.smartbeauty.fragment.EyebrowFragment;
import com.smartbeauty.ucsm.smartbeauty.fragment.FacialFragment;
import com.smartbeauty.ucsm.smartbeauty.fragment.LipFragment;
import com.smartbeauty.ucsm.smartbeauty.fragment.NoseFragment;

/**
 * Created by CUSM on 10/29/2016.
 */

public class FaceFragmentPagerAdapter extends FragmentStatePagerAdapter {
    int fragment_count=6;
    public FaceFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                FacialFragment facialFragment=new FacialFragment();
                return facialFragment;
            case 1:
                EyeLinerFragment eyeLinerFragment=new EyeLinerFragment();
                return eyeLinerFragment;
            case 2:
                EyebrowFragment eyebrowFragment=new EyebrowFragment();
                return eyebrowFragment;
            case 3:
                NoseFragment noseFragment=new NoseFragment();
                return noseFragment;
            case 4:
                LipFragment lipFragment=new LipFragment();
                return lipFragment;
            case 5:
                BlusherFragment blusherFragment=new BlusherFragment();
                return blusherFragment;
        }
        return null;
    }

    @Override
    public int getCount() {
        return fragment_count;
    }
}
