package com.mad.madassignment;

import android.content.Context;
import android.graphics.Camera;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/**
 * Created by Andy on 7/05/2018.
 */

public class ShowCamera extends SurfaceView implements SurfaceHolder.Callback{
    Camera camera;

    public ShowCamera(Context context) {
        super(context);
    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {

    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {

    }
}
