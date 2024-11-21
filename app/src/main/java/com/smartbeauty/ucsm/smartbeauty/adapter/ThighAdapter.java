package com.smartbeauty.ucsm.smartbeauty.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.smartbeauty.ucsm.smartbeauty.R;
import com.smartbeauty.ucsm.smartbeauty.modle.ImageItem;

import java.util.List;

/**
 * Created by CUSM on 10/31/2016.
 */

public class ThighAdapter extends BaseAdapter {
    private Context mContext;
    private List<ImageItem> imageList;

    public ThighAdapter(Context context,List<ImageItem> imageList){
        this.mContext=context;
        this.imageList=imageList;
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
        View view=View.inflate(mContext, R.layout.photo_item_layout,null);
        ImageView photoItem=(ImageView) view.findViewById(R.id.photoItem);
        Bitmap bm= BitmapFactory.decodeByteArray(imageList.get(position).getThigh(),0,imageList.get(position).getThigh().length);
        photoItem.setImageBitmap(bm);
        return view;
    }
}