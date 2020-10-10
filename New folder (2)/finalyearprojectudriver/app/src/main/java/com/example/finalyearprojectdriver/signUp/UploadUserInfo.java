package com.example.finalyearprojectdriver.signUp;

public class UploadUserInfo {
    public String driver_name;
    public String phone_number;
    public String photo_url;
    public String city;
    public String is_available;
    public String ambulance_key;

    public UploadUserInfo(String uName, String uEmail, String cityUpdate, String aTrue, String getId) {
    }

    public UploadUserInfo(String driver_name,
                          String phone_number, String photo_url,
                          String city, String is_available, String ambulance_key) {
        this.driver_name = driver_name;
        this.phone_number = phone_number;
        this.photo_url = photo_url;
        this.city = city;
        this.is_available = is_available;
        this.ambulance_key = ambulance_key;
    }

    public String getDriver_name() {
        return driver_name;
    }

    public void setDriver_name(String driver_name) {
        this.driver_name = driver_name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getPhoto_url() {
        return photo_url;
    }

    public void setPhoto_url(String photo_url) {
        this.photo_url = photo_url;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getIs_available() {
        return is_available;
    }

    public void setIs_available(String is_available) {
        this.is_available = is_available;
    }

    public String getAmbulance_key() {
        return ambulance_key;
    }

    public void setAmbulance_key(String ambulance_key) {
        this.ambulance_key = ambulance_key;
    }
}
