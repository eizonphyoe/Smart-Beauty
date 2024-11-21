package com.smartbeauty.ucsm.smartbeauty.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.smartbeauty.ucsm.smartbeauty.R;
import com.smartbeauty.ucsm.smartbeauty.modle.ImageItem;

import java.util.List;

/**
 * Created by CUSM on 11/1/2016.
 */

public class HairMaintainableAdapter extends BaseAdapter {
    private Context mContext;
    private List<ImageItem> imageList;
    // private ImageItem imageItem;

    public HairMaintainableAdapter(Context context,List<ImageItem> imageList){
        this.mContext=context;
        this.imageList=imageList;
    }

    public HairMaintainableAdapter(Context mContext) {
        this.mContext = mContext;
    }



    @Override
    public int getCount() {
        return imageList.size();
    }

    @Override
    public Object getItem(int position) {
        return imageList.get(position);
    }

    @Override
    public long getItemId(int position) {

        return imageList.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view=View.inflate(mContext, R.layout.hair_maintainable,null);
        TextView hairMaintainable=(TextView) view.findViewById(R.id.hairmaintain);
        hairMaintainable.setText(imageList.get(position).getHairMaintable());

        return view;
    }
}
