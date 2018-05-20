package com.mad.madassignment.gallery;

public interface GalleryInterface {
    interface view {
        void startGallery();

    }
    interface presenter{
        void openGalleryIntent();
        void setImage();
    }
}
