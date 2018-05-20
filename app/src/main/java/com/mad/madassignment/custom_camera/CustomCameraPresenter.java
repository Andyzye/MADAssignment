package com.mad.madassignment.custom_camera;


import java.io.File;
import java.io.IOException;

public class CustomCameraPresenter implements CustomCameraInterface.presenter{
    private final CustomCameraInterface.view view;

    public CustomCameraPresenter(CustomCameraInterface.view view) {
        this.view = view;
    }

    @Override
    public void createImageGalleryCalled() {
        view.createImageGallery();
    }

    @Override
    public File createImageFileNameCalled() {
        try {
           return view.createImageFileName();
        } catch (IOException e) {
            e.printStackTrace();
        } return null;
    }

    @Override
    public void lockFocus() {
        view.lockFocus();
    }

    @Override
    public void unLockFocus() {
        view.unlockFocus();
    }

    @Override
    public void openGalleryActivityCalled() {
        view.openGalleryActivity();
    }

    @Override
    public void captureImageBackgroundCalled() {
        view.captureImageBackground();
    }
}
