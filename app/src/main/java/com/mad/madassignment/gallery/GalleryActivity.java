package com.mad.madassignment.gallery;

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
import com.mad.madassignment.R;

import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class GalleryActivity extends AppCompatActivity implements GalleryInterface.view {
    private ImageView mImageView;
    private Uri mImageUri;
    private static final int REQUEST_CODE = 0;

    private GalleryPresenter mPresenter;

    @BindView(R.id.capture_image_iv) ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        ButterKnife.bind(this);
        mPresenter = new GalleryPresenter(this);
        mPresenter.openGalleryIntent();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent resultData) {
        if (requestCode == REQUEST_CODE && resultCode == RESULT_OK) {
            if (resultData != null) {
                mImageUri = resultData.getData();
                Glide.with(this).load(mImageUri).into(imageView);
            }
        }
    }


    @OnClick(R.id.choose_another_btn)
    public void ChooseAnotherPicture(View view) {
        mPresenter.openGalleryIntent();

    }

    @OnClick(R.id.confirm_captured_btn)
    public void CapturedProcessImage(View view){

    }

    @Override
    public void startGallery() {
        Intent intent = new Intent(Intent.ACTION_OPEN_DOCUMENT);
        intent.addCategory(Intent.CATEGORY_OPENABLE);
        intent.setType("image/*");
        startActivityForResult(intent, REQUEST_CODE);
    }


}
