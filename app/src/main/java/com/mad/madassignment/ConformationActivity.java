package com.mad.madassignment;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class ConformationActivity extends AppCompatActivity {

    private ImageView mImageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conformation);

        mImageView = (ImageView) findViewById(R.id.capturedImage);

        //byte[] byteArray = getIntent().getByteArrayExtra("image");
        //Bitmap bitmap = BitmapFactory.decodeByteArray(byteArray,0,byteArray.length);

        //Bitmap receiptImage = (Bitmap) getIntent().getExtras().getParcelable("passImage");
        //Glide.with(this).load(bitmap).into(mImageView);

        //Uri uri = getIntent().getData();
       // Glide.with(this).load(uri).into(mImageView);
    }

}
