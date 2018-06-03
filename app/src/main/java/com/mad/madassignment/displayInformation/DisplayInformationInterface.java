package com.mad.madassignment.displayInformation;

import com.mad.madassignment.Model.Flower;

/**
 * Created by Andy on 2/06/2018.
 */

public interface DisplayInformationInterface {
    interface view {
        void passRequirement();
        void getInformation(String flowerName, String time, String family, String attractants, String propagation, String country, String condition, String instruction, String sun, String description, String lifecycle);
        void setValues();

        }

    interface presenter{
        void callResults();
        void passRequirementToFirebase(String requirement);
        void onGetData(Flower flower);
    }
}
