package com.mad.madassignment.conformation;

public interface ConformationInterface {
   interface view {
        void displayImage();
        void finishCurrentActivity();
    }
    interface presenter{
        void clickedCaptureBtn();
        void retakePhoto();
        void displayIntentedImage();
    }
}
