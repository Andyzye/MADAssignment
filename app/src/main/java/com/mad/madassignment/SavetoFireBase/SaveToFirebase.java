package com.mad.madassignment.SavetoFireBase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.mad.madassignment.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SaveToFirebase extends AppCompatActivity implements SaveToFireBaseInterface.view{
    private SavetoFirebasePresenter mPresenter;


    @BindView(R.id.flower_name) EditText mFlowerName;
    @BindView(R.id.flower_family_Et) EditText mFlowerFamily;
    @BindView(R.id.flower_lifecycle_Et) EditText mFlowerLC;
    @BindView(R.id.flower_time_Et) EditText mFlowerTime;
    @BindView(R.id.flower_country_of_origin_Et) EditText mFlowerCountry;
    @BindView(R.id.flower_growing_condi_Et) EditText mFlowerGrowCond;
    @BindView(R.id.flower_propagation_Et) EditText mFlowerPropagation;
    @BindView(R.id.flower_planting_instructions_Et) EditText mFlowerInstruction;
    @BindView(R.id.flower_description_Et) EditText mFlowerDes;
    @BindView(R.id.flower_sun_requirements_Et) EditText mFlowerSunReq;
    @BindView(R.id.flower_attractants_Et) EditText mFlowerAttractant;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save_to_firebase);
        ButterKnife.bind(this);
        mPresenter = new SavetoFirebasePresenter();

    }

    public void setFlower(){
        mPresenter.createFlower(
                mFlowerName.getText().toString(),
                mFlowerTime.getText().toString(),
                mFlowerFamily.getText().toString(),
                mFlowerAttractant.getText().toString(),
                mFlowerPropagation.getText().toString(),
                mFlowerCountry.getText().toString(),
                mFlowerGrowCond.getText().toString(),
                mFlowerInstruction.getText().toString(),
                mFlowerSunReq.getText().toString(),
                mFlowerDes.getText().toString(),
                mFlowerLC.getText().toString()
        );
    }


    @OnClick(R.id.submit_btn)
    public void save(View view){
        setFlower();
        mPresenter.saveFlower();
    }


}
