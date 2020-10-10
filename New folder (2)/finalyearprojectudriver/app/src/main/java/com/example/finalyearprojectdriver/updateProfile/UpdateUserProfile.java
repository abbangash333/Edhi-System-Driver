package com.example.finalyearprojectdriver.updateProfile;

public class UpdateUserProfile {
    String driver_name;
    String city;
    String photo_url;
    String phone_number;

    public UpdateUserProfile() {
    }

    public UpdateUserProfile(String driver_name, String city, String photo_url, String phone_number) {
        this.driver_name = driver_name;
        this.city = city;
        this.photo_url = photo_url;
        this.phone_number = phone_number;
    }

    public String getDriver_name() {
        return driver_name;
    }

    public void setDriver_name(String driver_name) {
        this.driver_name = driver_name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhoto_url() {
        return photo_url;
    }

    public void setPhoto_url(String photo_url) {
        this.photo_url = photo_url;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }
}
