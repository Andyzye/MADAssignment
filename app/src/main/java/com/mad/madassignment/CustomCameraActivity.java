package com.mad.madassignment;

import android.hardware.Camera;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

public class CustomCameraActivity extends AppCompatActivity {
    private Camera mCamera;
    private ShowCamera mShowCamera;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_camera);

        //mCamera = getCameraInstance();

        mShowCamera = new ShowCamera(this, mCamera);
        FrameLayout CameraLayout = (FrameLayout) findViewById(R.id.camera_Fl);
        CameraLayout.addView(mShowCamera);
        }

    public static Camera getCameraInstance(){
        Camera camera = null;
        try{
            camera = Camera.open();
        }catch (Exception e){

        }
        return camera;
    }
}
