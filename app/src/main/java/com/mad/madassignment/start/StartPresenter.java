package com.mad.madassignment.start;

public class StartPresenter implements StartInterface.presenter{


    private final StartInterface.view view;

    public StartPresenter(StartInterface.view view) {
        this.view = view;
    }

    @Override
    public void openCamera() {
        view.openCameraActivity();
    }

}
