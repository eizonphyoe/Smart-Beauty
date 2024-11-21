package com.smartbeauty.ucsm.smartbeauty.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.smartbeauty.ucsm.smartbeauty.R;
import com.smartbeauty.ucsm.smartbeauty.modle.FirstActivityList;


public class FirstActivityListAdapter extends ArrayAdapter<FirstActivityList> {

    public FirstActivityListAdapter(Context context, int resource) {
        super(context, resource);
    }

    @Override
    public void add(FirstActivityList object) {
        super.add(object);
    }

    @Override
    public FirstActivityList getItem(int position) {
        return super.getItem(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null)
        {
            LayoutInflater inflater=LayoutInflater.from(getContext());
            convertView=inflater.inflate(R.layout.first_activity_listdata,null);
        }
       FirstActivityList fActivityList=(FirstActivityList) getItem(position);
        ImageView img=(ImageView)convertView.findViewById(R.id.image);
        TextView tView=(TextView)convertView.findViewById(R.id.imageText);
        img.setImageResource(fActivityList.getImg());
        tView.setText(fActivityList.getType());
        return convertView;
    }
}