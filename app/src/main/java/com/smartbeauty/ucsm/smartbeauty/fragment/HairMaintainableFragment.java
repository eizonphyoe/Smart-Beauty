package com.smartbeauty.ucsm.smartbeauty.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;

import com.smartbeauty.ucsm.smartbeauty.R;
import com.smartbeauty.ucsm.smartbeauty.activity.PhotoDetailActivity;
import com.smartbeauty.ucsm.smartbeauty.adapter.HairMaintainableAdapter;
import com.smartbeauty.ucsm.smartbeauty.adapter.HairStyleAdapter;
import com.smartbeauty.ucsm.smartbeauty.database.DatabaseHandler;
import com.smartbeauty.ucsm.smartbeauty.modle.ImageItem;

import java.util.ArrayList;
import java.util.List;


public class HairMaintainableFragment extends Fragment {
    private ImageItem imageItem;
    private List<ImageItem> imageItemList;
    DatabaseHandler databaseHandler;
    private HairMaintainableAdapter hairMaintainableAdapter;
     public HairMaintainableFragment(){

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.hair_maintainable,container,false);
        TextView hairmaintainable=(TextView) view.findViewById(R.id.hairmaintain);
        databaseHandler=new DatabaseHandler(getContext());

        imageItem=databaseHandler.getHairMaintainable();
        //hairMaintainableAdapter=new HairMaintainableAdapter(getContext(),imageItem);
        hairmaintainable.setText(imageItem.getHairMaintable());
        return view;

    }


    }
