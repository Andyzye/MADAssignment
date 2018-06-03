package com.mad.madassignment.displayInformation;

import android.util.Log;

import com.mad.madassignment.Model.Flower;
import com.mad.madassignment.Repo.FirebaseManager;

/**
 * Created by Andy on 2/06/2018.
 */

public class DisplayInformationPresenter implements DisplayInformationInterface.presenter {

    private static final String TAG = "FlOWERPRES";
    private FirebaseManager mFirebaseManager = new FirebaseManager(this);

    private DisplayInformationInterface.view mView;


    public DisplayInformationPresenter(DisplayInformationInterface.view mView) {
        this.mView = mView;
    }


    @Override
    public void callResults() {
        mFirebaseManager.readFirebase();
    }


    @Override
    public void passRequirementToFirebase(String requirement) {
        mFirebaseManager.getRequirement(requirement);
    }

    @Override
    public void onGetData(Flower flower) {
        mView.getInformation(flower.getName(),
                flower.getFlowerTime(),
                flower.getFamily(),
                flower.getWildlifeAttractants(),
                flower.getPropagation(),
                flower.getCountryOfOrigin(),
                flower.getGrowingCondition(),
                flower.getPlantingInstructions(),
                flower.getSunRequirements(),
                flower.getDescription(),
                flower.getLifecycle());
        Log.d(TAG, flower.getName());
        Log.d(TAG, flower.getFlowerTime());
        Log.d(TAG, flower.getFamily());
        Log.d(TAG, flower.getWildlifeAttractants());
        Log.d(TAG, flower.getPropagation());
        Log.d(TAG, flower.getCountryOfOrigin());
        Log.d(TAG, flower.getGrowingCondition());
        Log.d(TAG, flower.getPlantingInstructions());
        Log.d(TAG, flower.getDescription());
        Log.d(TAG, flower.getLifecycle());
        Log.d(TAG, flower.getSunRequirements());
    }


}
