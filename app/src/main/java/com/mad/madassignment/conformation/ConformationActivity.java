package com.mad.madassignment.conformation;


import android.Manifest;
import android.content.Intent;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;

import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.karumi.dexter.Dexter;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.single.PermissionListener;
import com.mad.madassignment.ProcessImage.ProcessImageActivity;
import com.mad.madassignment.R;

import java.io.File;

import butterknife.BindView;
import butterknife.OnClick;
import butterknife.ButterKnife;


public class ConformationActivity extends AppCompatActivity implements ConformationInterface.view{

    private ConformationPresenter mPresenter;
    private Uri mImageUri;
    private String mIntentedData;
    @BindView(R.id.conformationImage_Iv) ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conformation);
        ButterKnife.bind(this);
        requestStoragePermission();
        mPresenter = new ConformationPresenter(this);

        mIntentedData = getIntent().getStringExtra("location");
        mImageUri = Uri.fromFile(new File(mIntentedData));
        //Glide.with(this).load(mImageUri).transform(new RotateTransformation(this, 90f)).into(imageView);
        Glide.with(this).load(mImageUri).into(imageView);
    }


    private void requestStoragePermission() {
        Dexter.withActivity(this)
                .withPermission(Manifest.permission.READ_EXTERNAL_STORAGE)
                .withListener(new PermissionListener() {
                    @Override
                    public void onPermissionGranted(PermissionGrantedResponse response) {
                        Toast.makeText(ConformationActivity.this, "permission granted", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onPermissionDenied(PermissionDeniedResponse response) {
                        Toast.makeText(ConformationActivity.this, "permission denied", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onPermissionRationaleShouldBeShown(PermissionRequest permission, PermissionToken token) {
                            token.continuePermissionRequest();
                    }
                }).check();
    }

    @Override
    public void displayImage() {
       mPresenter.displayIntentedImage();
    }

    @Override
    public void finishCurrentActivity() {
        finish();
    }

    @OnClick(R.id.retake_btn)
    public void takePhoto(View view){
        mPresenter.retakePhoto();
    }

    @OnClick(R.id.confirm_btn)
    public void processImage(View view){
        Intent intent = new Intent(ConformationActivity.this, ProcessImageActivity.class);
        intent.putExtra("intentedData", mIntentedData);
        startActivity(intent);
    }
}
