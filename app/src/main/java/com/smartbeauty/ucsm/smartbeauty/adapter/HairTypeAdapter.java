package com.smartbeauty.ucsm.smartbeauty.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import com.smartbeauty.ucsm.smartbeauty.R;
import com.smartbeauty.ucsm.smartbeauty.fragment.ArmFragment;
import com.smartbeauty.ucsm.smartbeauty.modle.ImageItem;

import java.util.List;

/**
 * Created by CUSM on 10/30/2016.
 */

public class HairTypeAdapter extends ArrayAdapter {

    ImageItem imageItem;

    public HairTypeAdapter(Context context, int resource, List objects) {
        super(context, resource, objects);
    }


    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        if (convertView == null) {
            inflater.inflate(R.layout.hair_fragment, (ViewGroup) convertView,false );
           // ImageView image=(ImageView)convertView.findViewById(R.id.photoItem);

            Bitmap bm= BitmapFactory.decodeByteArray(imageItem.getHairCoiffure(),0,imageItem.getHairCoiffure().length);
           // image.setImageBitmap(bm);



        }
        return convertView;
    }
}
