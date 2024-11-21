package com.smartbeauty.ucsm.smartbeauty.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.smartbeauty.ucsm.smartbeauty.R;;
import com.smartbeauty.ucsm.smartbeauty.database.DatabaseHandler;
import com.smartbeauty.ucsm.smartbeauty.modle.ImageItem;

import java.util.List;

/**
 * Created by CUSM on 10/29/2016.
 */

public class FacialFragment extends Fragment {
    private ImageItem imageItem;
    DatabaseHandler databaseHandler;
    public FacialFragment(){

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

        imageItem=databaseHandler.getFacial();
        //hairMaintainableAdapter=new HairMaintainableAdapter(getContext(),imageItem);
        hairmaintainable.setText(imageItem.getFacial());
        return view;

    }
}
