package com.example.mdeyakubsorkar.careforlivingthings.VetInfo;

public class Vet {
    private String vetName;
    private String vetNumber;
    private String vetDistrict;
    private String vetLocation;
    private String vetEmail;
    private String vetPhone;
    private String vetURL;
    private String vetOthers;

    public Vet(String vetName, String vetNumber, String vetDistrict, String vetLocation, String vetEmail, String vetPhone, String vetURL, String vetOthers) {
        this.vetName = vetName;
        this.vetNumber = vetNumber;
        this.vetDistrict = vetDistrict;
        this.vetLocation = vetLocation;
        this.vetEmail = vetEmail;
        this.vetPhone = vetPhone;
        this.vetURL = vetURL;
        this.vetOthers = vetOthers;
    }

    public String getVetOthers() {
        return vetOthers;
    }

    public void setVetOthers(String vetOthers) {
        this.vetOthers = vetOthers;
    }

    public String getVetName() {
        return vetName;
    }

    public void setVetName(String vetName) {
        this.vetName = vetName;
    }

    public String getVetNumber() {
        return vetNumber;
    }

    public void setVetNumber(String vetNumber) {
        this.vetNumber = vetNumber;
    }

    public String getVetDistrict() {
        return vetDistrict;
    }

    public void setVetDistrict(String vetDistrict) {
        this.vetDistrict = vetDistrict;
    }

    public String getVetLocation() {
        return vetLocation;
    }

    public void setVetLocation(String vetLocation) {
        this.vetLocation = vetLocation;
    }

    public String getVetEmail() {
        return vetEmail;
    }

    public void setVetEmail(String vetEmail) {
        this.vetEmail = vetEmail;
    }

    public String getVetPhone() {
        return vetPhone;
    }

    public void setVetPhone(String vetPhone) {
        this.vetPhone = vetPhone;
    }

    public String getVetURL() {
        return vetURL;
    }

    public void setVetURL(String vetURL) {
        this.vetURL = vetURL;
    }



}
