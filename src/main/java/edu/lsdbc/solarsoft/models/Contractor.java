package edu.lsdbc.solarsoft.models;


/**
 * Created by turng on 11/29/2016.
 */
public class Contractor extends Address{
private String companyName;
private Integer phoneNum;
private String contactPerson;
private String email;
private String inputAddress;
private String inputApt;
private String inputCity;
private String inputState;
private Integer inputZipCode;
    /*immutable object... cannot be changed. It has to have all of the variables and they have to be unchangeable */
public Contractor(String companyName, Integer phoneNum, String contactPerson, String email, String inputAddress, String inputApt, String inputCity, String inputState, Integer inputZipCode) {
        super();
        //String address, String apt, String city, String state, Integer zipCode
        this.companyName = companyName;
        this.phoneNum = phoneNum;
        this.contactPerson = contactPerson;
        this.email = email;
        this.setAddress(inputAddress);
        this.setApt(inputApt);
        this.setCity(inputCity);
        this.setState(inputState);
        this.setZipCode(inputZipCode);
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

public String contractorToString() {
        return "Contractor{" +
        "companyName='" + companyName + '\'' +
        ", phoneNum=" + phoneNum +
        ", contactPerson='" + contactPerson + '\'' +
        ", email='" + email + '\'' +
        ", inputAddress='" + inputAddress + '\'' +
        ", inputApt='" + inputApt + '\'' +
        ", inputCity='" + inputCity + '\'' +
        ", inputState='" + inputState + '\'' +
        ", inputZipCode=" + inputZipCode +
        '}';
        }
        }
