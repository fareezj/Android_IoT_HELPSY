package com.fareez.helpsy.Model;

public class PostMap {

    public String pid;
    public Double latitude, longitude;

    public PostMap()
    {

    }

    public PostMap(String pid, Double latitude, Double longitude) {
        this.pid = pid;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }
}
