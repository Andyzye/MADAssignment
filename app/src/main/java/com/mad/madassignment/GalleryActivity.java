package com.mad.madassignment;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.Image;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;

public class GalleryActivity extends AppCompatActivity {
    private ImageView mImageView;
    private Uri mImageUri;
    private static final int REQUEST_CODE = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
         mImageView = (ImageView) findViewById(R.id.imageView);
         startGallery();
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent resultData) {
        if(requestCode == REQUEST_CODE && resultCode == RESULT_OK){
            if(resultData != null){
                mImageUri = resultData.getData();
                Glide.with(this).load(mImageUri).into(mImageView);
            }
        }
    }

    public void openGallery(View view){
        startGallery();
    }

    private void startGallery(){
        Intent intent = new Intent(Intent.ACTION_OPEN_DOCUMENT);
        intent.addCategory(Intent.CATEGORY_OPENABLE);
        intent.setType("image/*");
        startActivityForResult(intent, REQUEST_CODE);
    }

}
