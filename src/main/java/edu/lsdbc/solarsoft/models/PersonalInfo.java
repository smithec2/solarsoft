package edu.lsdbc.solarsoft.models;

import java.util.Scanner;

public class PersonalInfo {

    private String address = "";
    private String apartment = "";
    private String city = "";
    private String state = "";
    private Integer zipcode = 0;
    private String phoneNumber = "";
    private String email = "";

    public PersonalInfo(){}

    public String getAddress(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Address:  ");
        address = scan.nextLine();
        return address;
    }

    public String getAppartment(){
        Scanner scan = new Scanner (System.in);
        System.out.print("Enter your apartment: ");
        apartment = scan.next();
        return apartment;
    }

    public String getCity(){
        Scanner scan = new Scanner (System.in);
        System.out.print("Enter the city: ");
        city = scan.nextLine();
        return city;
    }

    public String getState(){
        Scanner scan = new Scanner (System.in);
        System.out.print("Enter the state: ");
        state = scan.next();
        return state;
    }

    public int getZipCode(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the zipcode: ");
        zipcode = scan.nextInt();
        return zipcode;
    }

    public String getPhoneNumber(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Phone Number: ");
        phoneNumber = scan.nextLine();
        String pNS = "";
        for (int i = 0; i < phoneNumber.length(); i++){
            if(Character.isDigit(phoneNumber.charAt(i))){
                pNS = pNS + phoneNumber.charAt(i);
            }
        }
        phoneNumber = pNS;
        return phoneNumber;
    }

    public String getEmail(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Email: ");
        email = scan.nextLine();
        return email;
    }
}
