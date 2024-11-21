package com.smartbeauty.ucsm.smartbeauty.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
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

public class NoseAdapter extends BaseAdapter {
    private Context mContext;
    private List<ImageItem> imageList;
    private ImageItem imageItem;

    public NoseAdapter(Context context,List<ImageItem> imageList){
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
        Bitmap bm= BitmapFactory.decodeByteArray(imageList.get(position).getNose(),0,imageList.get(position).getNose().length);                            photoItem.setImageBitmap(bm);
        Log.i("id is",""+getItemId(position)+"");


        return view;
    }
}
