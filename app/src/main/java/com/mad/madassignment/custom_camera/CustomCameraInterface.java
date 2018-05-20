package com.mad.madassignment.custom_camera;

import java.io.File;
import java.io.IOException;

public interface CustomCameraInterface {
    interface view{
        void createImageGallery();
        File createImageFileName() throws IOException;
        void lockFocus();
        void unlockFocus();
        void openGalleryActivity();
        void captureImageBackground();

    }
    interface presenter{
        void createImageGalleryCalled();
        File createImageFileNameCalled();
        void lockFocus();
        void unLockFocus();
        void openGalleryActivityCalled();
        void captureImageBackgroundCalled();
    }

}
