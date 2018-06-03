package com.mad.madassignment.displayInformation;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.mad.madassignment.R;
import com.mad.madassignment.Repo.FirebaseManager;
import com.mad.madassignment.SavetoFireBase.SaveToFirebase;
import com.mad.madassignment.conformation.ConformationActivity;
import com.mad.madassignment.custom_camera.CustomCameraActivity;


import butterknife.BindView;
import butterknife.ButterKnife;

public class DisplayInformation extends AppCompatActivity implements DisplayInformationInterface.view {


    private static final String TAG1 = "FLOWERVALUE";
    private static final String TAG2 = "FLOWERTEXTVALUE";
    @BindView(R.id.flower_name)
    TextView mNameTv;
    @BindView(R.id.flower_attractants_Tv)
    TextView mAttractantTv;
    @BindView(R.id.flower_sun_requirements_Tv)
    TextView mSunTv;
    @BindView(R.id.flower_description_Tv)
    TextView mDescriptionTv;
    @BindView(R.id.flower_propagation_Tv)
    TextView mPropagationTv;
    @BindView(R.id.flower_country_of_origin_Tv)
    TextView mCountryTv;
    @BindView(R.id.flower_time_Tv)
    TextView mTimeTv;
    @BindView(R.id.flower_lifecycle_Tv)
    TextView mLifecycleTv;
    @BindView(R.id.flower_family_Tv)
    TextView mFamilyTv;
    @BindView(R.id.flower_planting_instructions_Tv)
    TextView mInstructionsTv;
    @BindView(R.id.flower_growing_condi_Tv)
    TextView mGrowTv;
    private DisplayInformationPresenter mPresenter;
    private String mNameVal, mTimeVal, mFamilyVal, mAttractantVal, mPropgationVal, mCountryVal, mConditionVal, mInstructioVal, mSunVal, mDescriptionVal, mLifecyleVal;
    private String mData;
    private String TAG = "flowerTest";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_information);
        ButterKnife.bind(this);
        Intent intent = getIntent();
        mData = getIntent().getStringExtra("VisionResult");
        Toast.makeText(this, mData, Toast.LENGTH_SHORT).show();

        mPresenter = new DisplayInformationPresenter(this);

        passRequirement();
        mPresenter.callResults();

    }

    @Override
    public void setValues() {
            mNameTv.setText(mNameVal);
            Log.d(TAG2, String.valueOf(mNameTv));
            Log.d(TAG1, mNameVal);
            mDescriptionTv.setText(mDescriptionVal);
            Log.d(TAG2, String.valueOf(mDescriptionTv));
            Log.d(TAG1, mTimeVal);
            mAttractantTv.setText(mAttractantVal);
            Log.d(TAG1, mAttractantVal);
            Log.d(TAG2, String.valueOf(mAttractantTv));
            mSunTv.setText(mSunVal);
            Log.d(TAG1, mSunVal);
            Log.d(TAG2, String.valueOf(mSunTv));
            mPropagationTv.setText(mPropgationVal);
            Log.d(TAG1, mPropgationVal);
            Log.d(TAG2, String.valueOf(mPropagationTv));
            mCountryTv.setText(mCountryVal);
            Log.d(TAG1, mCountryVal);
            Log.d(TAG2, String.valueOf(mCountryTv));
            mTimeTv.setText(mTimeVal);
            Log.d(TAG1, mTimeVal);
            Log.d(TAG2, String.valueOf(mTimeTv));
            mLifecycleTv.setText(mLifecyleVal);
            Log.d(TAG1, mLifecyleVal);
            Log.d(TAG2, String.valueOf(mLifecycleTv));
            mFamilyTv.setText(mFamilyVal);
            Log.d(TAG2, String.valueOf(mFamilyTv));
            Log.d(TAG1, mFamilyVal);
            mInstructionsTv.setText(mInstructioVal);
            Log.d(TAG1, mInstructioVal);
            Log.d(TAG2, String.valueOf(mInstructionsTv));
            mGrowTv.setText(mConditionVal);
            Log.d(TAG1, mConditionVal);
            Log.d(TAG2, String.valueOf(mGrowTv));
            mDescriptionTv.setText(mDescriptionVal);
            Log.d(TAG1, mDescriptionVal);
            Log.d(TAG2, String.valueOf(mDescriptionTv));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.add_entry, menu);
        return true;
    }

    /**
     * Method to control the menu items.
     *
     * @param item
     * @return
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        switch (item.getItemId()) {
            case R.id.menu_add:
                Intent intent = new Intent(DisplayInformation.this, SaveToFirebase.class);
                startActivity(intent);
                //mTrainAdapter.notifyDataSetChanged();
                break;
        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    public void passRequirement() {
        mPresenter.passRequirementToFirebase(mData);
    }

    @Override
    public void getInformation(String flowerName, String time, String family, String attractants, String propagation, String country, String condition, String instruction, String sun, String description, String lifecycle) {
        mNameVal = flowerName;
        mTimeVal = time;
        mFamilyVal = family;
        mAttractantVal = attractants;
        mPropgationVal = propagation;
        mCountryVal = country;
        mConditionVal = condition;
        mSunVal = sun;
        mInstructioVal = instruction;
        mLifecyleVal = lifecycle;
        mDescriptionVal = description;
        Log.d(TAG, mNameVal);
        Log.d(TAG, mTimeVal);
        Log.d(TAG, mFamilyVal);
        Log.d(TAG, mAttractantVal);
        Log.d(TAG, mPropgationVal);
        Log.d(TAG, mCountryVal);
        Log.d(TAG, mConditionVal);
        Log.d(TAG, mSunVal);
        Log.d(TAG, mInstructioVal);
        Log.d(TAG, mLifecyleVal);
        Log.d(TAG, mDescriptionVal);
        setValues();
    }


}
