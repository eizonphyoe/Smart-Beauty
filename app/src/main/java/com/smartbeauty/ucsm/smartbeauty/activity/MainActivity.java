package com.smartbeauty.ucsm.smartbeauty.activity;


import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.SearchView;
import android.widget.Toast;
import android.widget.ViewFlipper;

import com.smartbeauty.ucsm.smartbeauty.R;
import com.smartbeauty.ucsm.smartbeauty.database.DatabaseHandler;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class MainActivity extends AppCompatActivity {
    private DatabaseHandler mdbHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbarMain);
        setSupportActionBar(toolbar);
        ViewFlipper flipper=(ViewFlipper)findViewById(R.id.flipper);
        flipper.startFlipping();
        ImageButton girlBtn=(ImageButton)findViewById(R.id.girl);
        girlBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, FirstActivity.class);
                startActivity(i);
            }
        });
        ImageButton boyBtn=(ImageButton)findViewById(R.id.boy);
        boyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),FirstBoyActivity.class);
                startActivity(intent);
            }
        });
        mdbHelper=new DatabaseHandler(this);
        File database = getApplicationContext().getDatabasePath(mdbHelper.DBName);
        if (false == database.exists()) {
            mdbHelper.getReadableDatabase();
            if (copyDatabase(this)) {
                Toast.makeText(this, "Copy success", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Copy denined", Toast.LENGTH_SHORT).show();
                return;
            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.search_activity, menu);
        return super.onCreateOptionsMenu(menu);


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.about:
                Intent intent=new Intent(MainActivity.this,About.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
    private boolean copyDatabase(Context context) {
        try {
            InputStream myInput = context.getAssets().open(mdbHelper.DBName);
            String outFileName = mdbHelper.DBLocatoin + mdbHelper.DBName;
            OutputStream myOutput = new FileOutputStream(outFileName);
            byte[] buffer = new byte[1024];
            int length = 0;

            while ((length = myInput.read(buffer)) > 0) {
                myOutput.write(buffer, 0, length);
            }
            myOutput.close();
            myOutput.flush();
            myInput.close();
            return true;

        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }


}