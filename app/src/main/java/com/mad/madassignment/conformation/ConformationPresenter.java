package com.mad.madassignment.conformation;


public class ConformationPresenter implements ConformationInterface.presenter{
   private final ConformationInterface.view view;

    public ConformationPresenter(ConformationInterface.view view) {
        this.view = view;

    }

    @Override
    public void clickedCaptureBtn() {

    }

    @Override
    public void retakePhoto() {
     view.finishCurrentActivity();
    }

    @Override
    public void displayIntentedImage() {

    }

}

