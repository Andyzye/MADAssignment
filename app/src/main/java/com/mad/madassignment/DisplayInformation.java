package com.mad.madassignment;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DisplayInformation extends AppCompatActivity {

    private DatabaseReference mDatabase;

    @BindView(R.id.flower_name)
    TextView nameTv;
    @BindView(R.id.flower_family_Tv)
    TextView familyTv;
    @BindView(R.id.flower_attractants_Tv)
    TextView attractantsTv;
    @BindView(R.id.flower_country_of_origin_Tv)
    TextView countOfOriginTv;
    @BindView(R.id.flower_description_Tv)
    TextView descriptionTv;
    @BindView(R.id.flower_time_Tv)
    TextView timeTv;
    @BindView(R.id.flower_growing_condi_Tv)
    TextView growingCondTv;
    @BindView(R.id.flower_lifecycle_Tv)
    TextView lifecycleTv;
    @BindView(R.id.flower_planting_instructions_Tv)
    TextView plantingIntrsTv;
    @BindView(R.id.flower_propagation_Tv)
    TextView propagationTv;
    @BindView(R.id.flower_sun_requirements_Tv)
    TextView sunReqTv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_information);
        ButterKnife.bind(this);
        mDatabase = FirebaseDatabase.getInstance().getReference();
        mDatabase.addValueEventListener(new com.google.firebase.database.ValueEventListener() {
            @Override
            public void onDataChange(@NonNull com.google.firebase.database.DataSnapshot dataSnapshot) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });


    }
}
