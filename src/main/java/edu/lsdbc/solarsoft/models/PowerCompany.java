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

    public PowerCompany(String companyName, Integer phoneNum, String contactPerson, String address, String apt, String city, String state, Integer zipCode) {
        this.companyName = companyName;
        this.phoneNum = phoneNum;
        this.contactPerson = contactPerson;
        this.address.setAddress(address);
        this.address.setApt(apt);
        this.address.setCity(city);
        this.address.setState(state);
        this.address.setZipCode(zipCode);
    }

    public PowerCompany(String companyName, Integer phoneNum, String contactPerson,String address, String city, String state, Integer zipCode) {
        this.companyName = companyName;
        this.phoneNum = phoneNum;
        this.contactPerson = contactPerson;
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    // Methods
    

}
