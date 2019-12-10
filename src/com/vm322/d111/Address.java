package com.vm322.d111;

public class Address implements Cloneable {
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

    @Override
    public Address clone(){
        Address address = null;
        try {
            address = (Address)super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return address;
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
