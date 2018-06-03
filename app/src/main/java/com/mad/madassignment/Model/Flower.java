package com.mad.madassignment.Model;
public class Flower {
    private String mName;
    private String mCountryOfOrigin;
    private String mLifecycle;
    private String mFamily;
    private String mFlowerTime;
    private String mSunRequirements;
    private String mPropagation;
    private String mWildlifeAttractants;
    private String mDescription;
    private String mGrowingCondition;
    private String mPlantingInstructions ;

    public Flower() {

    }

    public Flower(String name, String countryOfOrigin, String lifecycle, String family, String flowerTime, String sunRequirements, String propagation, String wildlifeAttractants, String description, String gowingCondition, String plantingInstructions) {
        this.mName = name;
        this.mCountryOfOrigin = countryOfOrigin;
        this.mLifecycle = lifecycle;
        this.mFamily = family;
        this.mFlowerTime = flowerTime;
        this.mSunRequirements = sunRequirements;
        this.mPropagation = propagation;
        this.mWildlifeAttractants = wildlifeAttractants;
        this.mDescription = description;
        this.mGrowingCondition = gowingCondition;
        this.mPlantingInstructions = plantingInstructions;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        this.mName = name;
    }

    public String getCountryOfOrigin() {
        return mCountryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.mCountryOfOrigin = countryOfOrigin;
    }

    public String getLifecycle() {
        return mLifecycle;
    }

    public void setLifecycle(String lifecycle) {
        this.mLifecycle = lifecycle;
    }

    public String getFamily() {
        return mFamily;
    }

    public void setFamily(String family) {
        this.mFamily = family;
    }

    public String getFlowerTime() {
        return mFlowerTime;
    }

    public void setFlowerTime(String flowerTime) {
        this.mFlowerTime = flowerTime;
    }

    public String getSunRequirements() {
        return mSunRequirements;
    }

    public void setSunRequirements(String sunRequirements) {
        this.mSunRequirements = sunRequirements;
    }

    public String getPropagation() {
        return mPropagation;
    }

    public void setPropagation(String propagation) {
        this.mPropagation = propagation;
    }

    public String getWildlifeAttractants() {
        return mWildlifeAttractants;
    }

    public void setWildlifeAttractants(String wildlifeAttractants) {
        this.mWildlifeAttractants = wildlifeAttractants;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        this.mDescription = description;
    }

    public String getGrowingCondition() {
        return mGrowingCondition;
    }

    public void setGrowingCondition(String growingCondition) {
        this.mGrowingCondition = growingCondition;
    }

    public String getPlantingInstructions() {
        return mPlantingInstructions;
    }

    public void setPlantingInstructions(String plantingInstructions) {
        this.mPlantingInstructions = plantingInstructions;
    }
}
