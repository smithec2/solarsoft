package edu.lsdbc.solarsoft.models;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Glen Turnbow on 11/29/2016.
 */
public class ContractorTest {
    @Test
    public void getCompanyName() throws Exception {

    }

    @Test
    public void setCompanyName() throws Exception {
        String companyName1 = "Glen is Awesome";
        System.out.println("Contractor: " + companyName1);
    }

    @Test
    public void getPhoneNum() throws Exception {

    }

    @Test
    public void setPhoneNum() throws Exception {
        Integer phoneNum1 = 2082204570;
        System.out.println("Phone: " + phoneNum1);
    }

    @Test
    public void getContactPerson() throws Exception {
        String contactPerson1 = "Glen Turnbow";
        System.out.println("Project Contact: " + contactPerson1);
    }

    @Test
    public void setContactPerson() throws Exception {

    }

    @Test
    public void getEmail() throws Exception {

    }

    @Test
    public void setEmail() throws Exception {
        String email1 = "glenturnbow@gmail.com";
        System.out.println("E-mail: " + email1);
    }

    @Test
    public void getAddress() throws Exception {

    }

    @Test
    public void setAddress() throws Exception {
        String address1 = "10207 Bannor Hill Rd";
        System.out.println("Address: " + address1);
    }

    @Test
    public void getApt() throws Exception {

    }

    @Test
    public void setApt() throws Exception {
        String apt1 = "";
        if (apt1.length() >0)
            System.out.println("Apt: " + apt1);
    }

    @Test
    public void getCity() throws Exception {

    }

    @Test
    public void setCity() throws Exception {
        String city1 = "Sandy";
        System.out.println("City: " + city1);
    }

    @Test
    public void getState() throws Exception {

    }

    @Test
    public void setState() throws Exception {
        String state1 = "UT";
        System.out.println("State: " + state1);
    }

    @Test
    public void getZipCode() throws Exception {

    }

    @Test
    public void setZipCode() throws Exception {
        String zipCode = "84092";
        System.out.println("Zip Code: " + zipCode);
    }

    @Test
    public void contractorToString() throws Exception {
        Contractor contractor1 = new Contractor("Glen is Awesome", 2082204570, "Glen Turnbow", "glenturnbow@gmail.com", "10207 Bannor Hill Rd", "", "Sandy", "UT", 84092 );
        System.out.println(contractor1.toString());
    }

}