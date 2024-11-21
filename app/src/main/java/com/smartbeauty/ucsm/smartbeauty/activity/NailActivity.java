package com.smartbeauty.ucsm.smartbeauty.activity;

import android.app.ActionBar;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.smartbeauty.ucsm.smartbeauty.R;
import com.smartbeauty.ucsm.smartbeauty.adapter.BodyFragmentPagerAdapter;
import com.smartbeauty.ucsm.smartbeauty.adapter.BoyImageAdapter;
import com.smartbeauty.ucsm.smartbeauty.adapter.NailAdapter;
import com.smartbeauty.ucsm.smartbeauty.database.DatabaseHandler;
import com.smartbeauty.ucsm.smartbeauty.modle.ImageItem;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;


public class NailActivity extends AppCompatActivity {
    private GridView gridView;
    private DatabaseHandler dbHandler;
    private NailAdapter nailAdapter;
    private List<ImageItem> imgitem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.photo_grid_layout);
        gridView=(GridView) findViewById(R.id.gridView);
        dbHandler=new DatabaseHandler(this);


        File database=getApplicationContext().getDatabasePath(dbHandler.DBName);
        if(false==database.exists()){
            dbHandler.getReadableDatabase();
            if(copyDatabase(this)){
                Toast.makeText(this,"Copy Success",Toast.LENGTH_SHORT).show();
            }else {
                Toast.makeText(this,"Copy denins",Toast.LENGTH_SHORT).show();
                return;
            }

        }
      /*  imgitem= dbHandler.getHairCoiffure();
        imgAdapter=new ImageAdapter(this,imgitem);
        gridView.setAdapter(imgAdapter);
*/
        imgitem= dbHandler.getNail();
        nailAdapter=new NailAdapter(this,imgitem);
        gridView.setAdapter(nailAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                ImageItem item = (ImageItem) parent.getItemAtPosition(position);

                Intent intent = new Intent(NailActivity.this, PhotoDetailActivity.class);
                intent.putExtra("image", item.getNail());
                startActivity(intent);



            }
        });


    }
    private boolean copyDatabase(Context context) {
        try {
            InputStream myInput = context.getAssets().open(dbHandler.DBName);
            String outFileName = dbHandler.DBLocatoin + dbHandler.DBName;
            Log.i("Before file out","Succes...");
            OutputStream myOutput = new FileOutputStream(outFileName);
            Log.i("After file out","Succes...");
            byte[] buffer = new byte[1024];
            int length = 0;

            while ((length = myInput.read(buffer)) > 0) {
                myOutput.write(buffer, 0, length);
            }
            myOutput.close();
            myOutput.flush();
            myInput.close();
            Log.i("Copy Database","Copy Success....");
            return true;

        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }


}