package com.example.finalyearprojectdriver.ambulance;

public class FirebaseLocationModel {
    String ambulance_key;
    String city;
    String driver_name;
    String is_available;
    String phone_number;

    public FirebaseLocationModel() {
    }

    public FirebaseLocationModel(String ambulance_key,
                                 String city, String driver_name,
                                 String is_available, String phone_number
                                ) {
        this.ambulance_key = ambulance_key;
        this.city = city;
        this.driver_name = driver_name;
        this.is_available = is_available;
        this.phone_number = phone_number;
    }

    public String getAmbulance_key() {
        return ambulance_key;
    }

    public void setAmbulance_key(String ambulance_key) {
        this.ambulance_key = ambulance_key;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDriver_name() {
        return driver_name;
    }

    public void setDriver_name(String driver_name) {
        this.driver_name = driver_name;
    }

    public String getIs_available() {
        return is_available;
    }

    public void setIs_available(String is_available) {
        this.is_available = is_available;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

}
