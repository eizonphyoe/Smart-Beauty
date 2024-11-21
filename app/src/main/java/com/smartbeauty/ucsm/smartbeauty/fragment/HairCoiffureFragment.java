package com.smartbeauty.ucsm.smartbeauty.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import com.smartbeauty.ucsm.smartbeauty.R;;
import com.smartbeauty.ucsm.smartbeauty.activity.PhotoDetailActivity;
import com.smartbeauty.ucsm.smartbeauty.adapter.BoyImageAdapter;
import com.smartbeauty.ucsm.smartbeauty.adapter.HairCoiffureAdapter;
import com.smartbeauty.ucsm.smartbeauty.database.DatabaseHandler;
import com.smartbeauty.ucsm.smartbeauty.modle.ImageItem;

import java.util.List;
import java.util.ListIterator;


public class HairCoiffureFragment extends Fragment {
    private GridView gridView;
    private HairCoiffureAdapter hairCoiffureAdapter;
    private List<ImageItem> lstimageitem;
    DatabaseHandler databaseHandler;

    public HairCoiffureFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.photo_grid_layout,container,false);
        gridView=(GridView)view.findViewById(R.id.gridView);
        //lstimageitem=new ArrayList<>();
        databaseHandler=new DatabaseHandler(getActivity().getApplicationContext());
        lstimageitem=databaseHandler.getHairCoiffure();
        Log.i("List=Database==>",lstimageitem.size()+"");
        hairCoiffureAdapter=new HairCoiffureAdapter(getActivity().getApplicationContext(),lstimageitem);

        gridView.setAdapter(hairCoiffureAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                ImageItem item = (ImageItem) parent.getItemAtPosition(position);

                Intent intent = new Intent(getActivity(), PhotoDetailActivity.class);
                intent.putExtra("image", item.getHairCoiffure());
                startActivity(intent);



            }
        });
        return view;

    }
}