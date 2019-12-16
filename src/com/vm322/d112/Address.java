package com.vm322.d112;

import java.io.Serializable;

public class Address implements Serializable {
    private String state;
    private String province;
    private String city;

    public Address(String state, String province, String city) {
        this.state = state;
        this.province = province;
        this.city = city;
    }

    @Override
    public String toString() {
        StringBuilder sbuilder = new StringBuilder();
        sbuilder.append("state: " + state + "\n");
        sbuilder.append("province: " + province + "\n");
        sbuilder.append("city: " + city + "\n");
        return sbuilder.toString();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
