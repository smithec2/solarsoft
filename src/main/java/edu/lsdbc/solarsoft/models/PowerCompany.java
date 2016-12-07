package edu.lsdbc.solarsoft.models;

/**
 * Created by Scott on 12/6/2016.
 */
public class PowerCompany {

    // Attributes
    private String companyName;
    private Integer phoneNum;
    private String contactPerson;
    Address address = new Address();

    // Constructor
    public PowerCompany(String companyName, Integer phoneNum,String address, String city, String state, Integer zipCode) {
        this.companyName = companyName;
        this.phoneNum = phoneNum;
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

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }


    // Methods


}
