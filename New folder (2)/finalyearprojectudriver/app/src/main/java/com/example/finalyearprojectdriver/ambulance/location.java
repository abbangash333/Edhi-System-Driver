package com.example.finalyearprojectdriver.ambulance;

public class location {
    String lati;
    String longti;
    String available;

    public location() {
    }

    public location(String lati, String longti, String available) {
        this.lati = lati;
        this.longti = longti;
        this.available = available;
    }

    public String getLati() {
        return lati;
    }

    public void setLati(String lati) {
        this.lati = lati;
    }

    public String getLongti() {
        return longti;
    }

    public void setLongti(String longti) {
        this.longti = longti;
    }

    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }
}
