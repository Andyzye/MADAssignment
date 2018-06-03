package com.mad.madassignment.SavetoFireBase;

import com.mad.madassignment.Repo.FirebaseManager;
import com.mad.madassignment.displayInformation.DisplayInformationPresenter;

/**
 * Created by Andy on 2/06/2018.
 */

public class SavetoFirebasePresenter implements SaveToFireBaseInterface.presenter {

    private DisplayInformationPresenter mDisplayPresenter;


    private String mName, mTime, mFamily, mAttractants, mPropgation, mCountry, mCondition, mInstruction, mSun, mDescription, mLifecyle;

    private FirebaseManager mFirebaseManager = new FirebaseManager(mDisplayPresenter);

    @Override
    public void createFlower(String flowerName, String time, String family, String attractants,String propagation, String country, String condition, String instruction, String sun, String description, String lifecycle) {
        mName = flowerName;
        mTime = time;
        mLifecyle = lifecycle;
        mFamily = family;
        mAttractants = attractants;
        mPropgation = propagation;
        mCountry = country;
        mCondition = condition;
        mInstruction = instruction;
        mDescription = description;
        mSun = sun;
    }

    @Override
    public void returnFlower() {
        mFirebaseManager.callFlower(
                mName,
                mTime,
                mFamily,
                mAttractants,
                mPropgation,
                mCountry,
                mCondition,
                mInstruction,
                mSun,
                mDescription,
                mLifecyle
        );
    }

    @Override
    public void saveFlower() {
        returnFlower();
        mFirebaseManager.writeFireBase();
    }

}
