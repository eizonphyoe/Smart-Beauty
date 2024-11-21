package com.smartbeauty.ucsm.smartbeauty.activity;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;

import com.smartbeauty.ucsm.smartbeauty.R;

/**
 * Created by UCSM on 10/25/2016.
 */

public class PhotoDetailActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.photo_detail);

        byte[] image = getIntent().getByteArrayExtra("image");
        Bitmap bitmap= BitmapFactory.decodeByteArray(image,0,image.length);

         ImageView detailimg = (ImageView) findViewById(R.id.detailimg);
        detailimg.setImageBitmap(bitmap);
    }

}
