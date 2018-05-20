package com.mad.madassignment.gallery;

public class GalleryPresenter implements GalleryInterface.presenter{
    private final GalleryInterface.view view;

    public GalleryPresenter(GalleryInterface.view view) {
        this.view = view;
    }

    @Override
    public void openGalleryIntent() {
        view.startGallery();
    }

    @Override
    public void setImage() {

    }
}
