package edu.lsdbc.solarsoft.models;

/**
 * Created by Glen Turnbow on 11/29/2016.
 */
public class Contractor {
    private String companyName;
    private Integer phoneNum;
    private String contactPerson;
    private String email;

    private Address address = new Address();

//Constructor for test class

    public Contractor(String companyName, Integer phoneNum, String contactPerson, String email, Address address) {
        this.companyName = companyName;
        this.phoneNum = phoneNum;
        this.contactPerson = contactPerson;
        this.email = email;
        this.address = address;
    }


//Methods

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contractor" +
                "companyName='" + companyName + '\'' +
                ", phoneNum=" + phoneNum +
                ", contactPerson='" + contactPerson + '\'' +
                ", email='" + email + '\'' +
                ", inputAddress='" + address.toString() + '\'';
    }
}
