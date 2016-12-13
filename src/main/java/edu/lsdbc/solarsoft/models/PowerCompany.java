package edu.lsdbc.solarsoft.models;

/**
 * Created by Scott on 12/6/2016.
 */
public class PowerCompany {

    // Attributes
    private String companyName;
    private Integer phoneNum;
    Address address;

    // Constructor
    public PowerCompany(){
        this.address = new Address();
    }
    public PowerCompany(String companyName, Integer phoneNum, String address, String city, String state, Integer zipCode) {
        this.companyName = companyName;
        this.phoneNum = phoneNum;
        this.address = new Address();
        this.address.setAddress(address);
        this.address.setCity(city);
        this.address.setState(state);
        this.address.setZipCode(zipCode);
    }



    // Getters and Setters
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Integer getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(Integer phoneNum) {
        this.phoneNum = phoneNum;
    }


    // Methods


}
