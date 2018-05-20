package com.mad.madassignment.conformation;


import android.net.Uri;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.mad.madassignment.R;

import java.io.File;

import butterknife.BindView;
import butterknife.OnClick;
import butterknife.ButterKnife;


public class ConformationActivity extends AppCompatActivity implements ConformationInterface.view{

    private ConformationPresenter mPresenter;
    private Uri mImageUri;
    @BindView(R.id.conformationImage_Iv) ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conformation);
        ButterKnife.bind(this);

        mPresenter = new ConformationPresenter(this);
        //byte[] byteArray = getIntent().getByteArrayExtra("image");
        //Bitmap bitmap = BitmapFactory.decodeByteArray(byteArray,0,byteArray.length);

        //Bitmap receiptImage = (Bitmap) getIntent().getExtras().getParcelable("passImage");
        //Glide.with(this).load(bitmap).into(mImageView);

        mImageUri = getIntent().getData();
        Glide.with(this).load(mImageUri).into(imageView);
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

    }
}
