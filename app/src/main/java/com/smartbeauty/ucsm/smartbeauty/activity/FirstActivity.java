package com.smartbeauty.ucsm.smartbeauty.activity;

import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.smartbeauty.ucsm.smartbeauty.R;
import com.smartbeauty.ucsm.smartbeauty.adapter.FirstActivityListAdapter;
import com.smartbeauty.ucsm.smartbeauty.modle.FirstActivityList;

import java.util.ArrayList;
import java.util.List;

public class FirstActivity extends AppCompatActivity{

    private FirstActivityListAdapter fListAdapter;
    List<FirstActivityList> firstLists;

    private ListView listView;
    String[] name={"ဆံပင္ဆင္ယင္ထံုးဖြဲ႕မႈႏွင့္ ဆံသားထိန္းသိမ္းနည္းမ်ား","မိတ္ကပ္လိမ္းျခယ္နည္းႏွင့္ မ်က္ႏွာအသားအေရထိန္းသိမ္းနည္းမ်ား","ခႏၶာကိုယ္ အဆီခ်နည္းမ်ား",
            "ေျခသည္းလက္သည္း အလွဆင္နည္းမ်ား","ျမန္မာ၀တ္စံုဒီဇိုင္းမ်ား"};
    TypedArray img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_activity_listitem);
        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        listView = (ListView) findViewById(android.R.id.list);
        img = getResources().obtainTypedArray(R.array.image);
        fListAdapter = new FirstActivityListAdapter(this, R.layout.first_activity_listdata);
        listView.setAdapter(fListAdapter);
        firstLists = readData();
        for (FirstActivityList flst : firstLists) {
            fListAdapter.add(flst);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    switch (position){
                        case 0:
                            Intent intent=new Intent(FirstActivity.this,HairActivity.class);
                            startActivity(intent);
                        break;
                        case 1:
                            Intent intent1=new Intent(FirstActivity.this,FaceActivity.class);
                            startActivity(intent1);
                        break;
                        case 2:
                            Intent intent2=new Intent(FirstActivity.this,BodyActivity.class);
                            startActivity(intent2);
                        break;
                        case 3:
                            Intent intent3=new Intent(FirstActivity.this,NailActivity.class);
                            startActivity(intent3);
                        break;
                        case 4:
                            Intent intent4=new Intent(FirstActivity.this,DressActivity.class);
                            startActivity(intent4);
                        break;
                    }

                }
            });

        }
    }


    private List<FirstActivityList> readData() {
        List<FirstActivityList> flst=new ArrayList<>();
        for(int i=0;i<name.length;i++)
        {
            FirstActivityList t=new FirstActivityList(img.getResourceId(i,-1),name[i]);
            flst.add(t);
        }
        return flst;

    }


}

