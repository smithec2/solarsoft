package edu.lsdbc.solarsoft.models;

/**
 * Created by Glen Turnbow on 11/29/2016.
 */
public class Address {
    private String address;
    private String apt;
    private String city;
    private String state;
    private Integer zipCode;

    /*immutable object... cannot be changed. It has to have all of the variables and they have to be unchangeable */
    public Address(String address, String apt, String city, String state, Integer zipCode) {
        this.address = address;
        this.apt = apt;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public Address() {
        this.city = "Bountiful";
        this.state = "UT";
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getApt() {
        return apt;
    }

    public void setApt(String apt) {
        this.apt = apt;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getZipCode() {
        return zipCode;
    }

    public void setZipCode(Integer zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return address + " " + apt + "\n"+ city + ", "+ state + " "+ zipCode;
    }

}
