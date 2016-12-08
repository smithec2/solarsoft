package edu.lsdbc.solarsoft.models;

import java.util.Scanner;

public class PropertyOwner {

    private String firstName = "";
    private String lastName = "";
    private String address = "";
    private String apartment = "";
    private String city = "";
    private String state = "";
    private Integer zipcode = 0;
    private String phoneNumber = "";
    private String email = "";

    public PropertyOwner(){}

    public String getFirstName(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your First Name: ");
        firstName = scan.next();
        return firstName;
    }

    public String getLastName(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your Last Name: ");
        lastName = scan.next();
        return lastName;
    }

    public void getPersonalInfo(){
        firstName = getFirstName();
        lastName = getLastName();
        PersonalInfo obj = new PersonalInfo();
        address = obj.getAddress();
        apartment = obj.getAppartment();
        city = obj.getCity();
        state = obj.getState();
        zipcode = obj.getZipCode();
        phoneNumber = obj.getPhoneNumber();
        email = obj.getEmail();
    }
}
