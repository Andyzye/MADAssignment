package com.mad.madassignment.SavetoFireBase;

/**
 * Created by Andy on 2/06/2018.
 */

public interface SaveToFireBaseInterface {
    interface view {
        void setFlower();
    }

    interface presenter {
        void createFlower(String flowerName, String time, String family, String attractants,String propagation, String country, String condition, String instruction, String sun, String description, String lifecycle);
        void returnFlower();
        void saveFlower();
    }
}
