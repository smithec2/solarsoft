package edu.lsdbc.solarsoft.models;

import java.util.Scanner;

/**
 * Created by g47 on 12/13/16.
 */
public class Attachment2 extends SolarQuestion {

    @Override
    public double getArrayDimensions() {
        return super.getArrayDimensions();
    }

    @Override
    public double getTotalNumberOfPanel() {
        return super.getTotalNumberOfPanel();
    }

    @Override
    public double getRatingOfPhotovoltaic() {
        return super.getRatingOfPhotovoltaic();
    }

    @Override
    public String getRoofOrWall() {
        return super.getRoofOrWall();
    }

    @Override
    public String getRoofPitch() {
        return super.getRoofPitch();
    }

    @Override
    public String getRoofMaterial() {
        return super.getRoofMaterial();
    }

    @Override
    public String getRoofConstruction() {
        return super.getRoofConstruction();
    }

    @Override
    public boolean getConnectionToRoof() {
        return super.getConnectionToRoof();
    }

    @Override
    public boolean getExistRoofStructure() {
        return super.getExistRoofStructure();
    }

    @Override
    public boolean getUpliftResistance() {
        return super.getUpliftResistance();
    }

    public void agreement() {
        System.out.println("It is understood and agreed that net metering for a photovoltaic power System for:        ");
        System.out.println("(customer name)\nat        \nwith a total rating of:     KW");
        Scanner input = new Scanner(System.in);
        String customerName = input.next();
        String customerAddress = input.next();
        double rating = input.nextDouble();
    }
    public void ownOrLease() {
        boolean checkMark = false;
        System.out.println("owned by the customer(ture/false).");
        checkMark = input.nextBoolean();
        if (!checkMark) {
            System.out.println("leased(true/false)");
            checkMark = input.nextBoolean();
            if (checkMark) {
                System.out.println("leased from:     company");
                String company = input.next();
            } else {
                System.out.println("power purchased from:       company");
                String company = input.next();
            }

        }
        System.out.println(" will bw connected to the Bountiful City Light & Power (BCLP) system under the following conditions:\n...");
        System.out.print("Date          ");
        String date = input.next();
        System.out.println("Permittee(customer signature):       ");
        String permittee = input.next();
    }
    public void signature(){
        System.out.print("I will follow the diagram outlined below(yes/no)");
        String mark = "no";
        mark = input.next();
        if (mark.equals("yes")) {
            System.out.print(" Signature of Property Owner or Contractor        ");
            String signatureOwner = input.next();
        }

    }

}
