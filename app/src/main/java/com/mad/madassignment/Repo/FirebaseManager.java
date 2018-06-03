package com.mad.madassignment.Repo;

import android.support.annotation.NonNull;
import android.util.Log;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.mad.madassignment.Model.Flower;
import com.mad.madassignment.displayInformation.DisplayInformationPresenter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Andy on 28/05/2018.
 */

public class FirebaseManager {

    private static final String TAG = "FLOWER";
    private DatabaseReference mDatabase;
    private Map<String, Object> mUploadMap = new HashMap<>();
    private DisplayInformationPresenter mPresenter;
    private String mFamilyKey;
    private String mTestcase;
    private String mGetFamily;
    private boolean mNullFlowerFound;

    public FirebaseManager(DisplayInformationPresenter presenter) {
        this.mDatabase = mDatabase;
        mDatabase = FirebaseDatabase.getInstance().getReference().child("species");
        this.mPresenter = presenter;
    }

    public void writeFireBase() {
        mNullFlowerFound = false;
        com.google.firebase.database.Query query = mDatabase.orderByChild("flowerFamily").equalTo(mGetFamily);
        query.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if(!dataSnapshot.exists()) {
                    String key = mDatabase.push().getKey();
                    mDatabase.child(key).setValue(mUploadMap);
                } else {
                    Log.d(TAG, "flower already exists!");
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });
    }


    public void readFirebase() {
        com.google.firebase.database.Query specificFlower = mDatabase.orderByChild("flowerFamily").equalTo(mFamilyKey);
        specificFlower.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                for (DataSnapshot flowers : dataSnapshot.getChildren()) {
                    if (dataSnapshot.exists()) {
                        Flower flower = dataSnapshot.getValue(Flower.class);
                        flower.setName((String) flowers.child("flowerName").getValue());
                        Log.d(TAG, flower.getName());
                        Log.d(TAG, (String) flowers.child("flowerName").getValue());
                        flower.setGrowingCondition((String) flowers.child("flowerCondition").getValue());
                        Log.d(TAG, flower.getGrowingCondition());
                        Log.d(TAG, (String) flowers.child("flowerCondition").getValue());
                        flower.setFlowerTime((String) flowers.child("flowerTime").getValue());
                        Log.d(TAG, flower.getFlowerTime());
                        Log.d(TAG, (String) flowers.child("flowerTime").getValue());
                        flower.setSunRequirements((String) flowers.child("flowerSun").getValue());
                        Log.d(TAG, flower.getSunRequirements());
                        Log.d(TAG, (String) flowers.child("flowerSun").getValue());
                        flower.setPropagation((String) flowers.child("flowerPropagation").getValue());
                        Log.d(TAG, flower.getPropagation());
                        Log.d(TAG, (String) flowers.child("flowerPropagation").getValue());
                        flower.setPlantingInstructions((String) flowers.child("flowerInstruction").getValue());
                        Log.d(TAG, flower.getPlantingInstructions());
                        Log.d(TAG, (String) flowers.child("flowerInstruction").getValue());
                        flower.setFamily((String) flowers.child("flowerFamily").getValue());
                        Log.d(TAG, flower.getFamily());
                        Log.d(TAG, (String) flowers.child("flowerFamily").getValue());
                        flower.setWildlifeAttractants((String) flowers.child("flowerAttractants").getValue());
                        Log.d(TAG, flower.getWildlifeAttractants());
                        Log.d(TAG, (String) flowers.child("flowerAttractants").getValue());
                        flower.setLifecycle((String) flowers.child("flowerLifeCycle").getValue());
                        Log.d(TAG, flower.getLifecycle());
                        Log.d(TAG, (String) flowers.child("flowerLifeCycle").getValue());
                        flower.setDescription((String) flowers.child("flowerDescription").getValue());
                        Log.d(TAG, flower.getDescription());
                        Log.d(TAG, (String) flowers.child("flowerDescription").getValue());
                        flower.setCountryOfOrigin((String) flowers.child("flowerCountry").getValue());
                        Log.d(TAG, flower.getCountryOfOrigin());
                        Log.d(TAG, (String) flowers.child("flowerCountry").getValue());
                        mPresenter.onGetData(flower);
                    } else {
                        Flower flower = dataSnapshot.getValue(Flower.class);
                        mPresenter.onGetData(flower);


                    }
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }


    public void callFlower(String flowerName, String time, String family, String attractants, String propagation, String country, String condition, String instruction, String sun, String description, String lifecycle) {
        mUploadMap.put("flowerName", flowerName);
        mUploadMap.put("flowerTime", time);
        mUploadMap.put("flowerFamily", family);
        mGetFamily = family.split(" ", 2)[0];
        mUploadMap.put("flowerAttractants", attractants);
        mUploadMap.put("flowerPropagation", propagation);
        mUploadMap.put("flowerCountry", country);
        mUploadMap.put("flowerCondition", condition);
        mUploadMap.put("flowerInstruction", instruction);
        mUploadMap.put("flowerSun", sun);
        mUploadMap.put("flowerDescription", description);
        mUploadMap.put("flowerLifeCycle", lifecycle);
        //mFamilyKey = family;

    }

    public void getRequirement(String requirement) {
        if (requirement.equals("No Flowers Found!")) {
            mTestcase = requirement;
        } else {
            mTestcase = requirement;
            mFamilyKey = mTestcase.split(" ", 2)[0];
        }

    }


}
