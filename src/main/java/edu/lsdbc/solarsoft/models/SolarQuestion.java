package edu.lsdbc.solarsoft.models;
import java.util.Scanner;
/**
 * Created by g47 on 12/13/16.
 */
public class SolarQuestion {
    private double arrayDimensions= 0.0;
    private double totalNumberOfPanel = 0.0;
    private double ratingOfPhotovoltaic= 0.0;
    private String roofOrWall = " ";
    private String roofPitch= " ";
    private String roofMaterial = " ";
    private String roofConstruction =" ";
    private boolean connectionToRoof= false;
    private boolean existRoofStructure= false;
    private boolean upliftResistance= false;
    Scanner input = new Scanner(System.in);

    public double getArrayDimensions(){
        System.out.println("array dimensions");
        arrayDimensions = input.nextDouble();
        return arrayDimensions;
    }

    public double getTotalNumberOfPanel(){
        System.out.println("total number of panel");
        totalNumberOfPanel= input.nextDouble();
        return totalNumberOfPanel;
    }

    public double getRatingOfPhotovoltaic(){
        System.out.println("rating of photovoltaic");
        ratingOfPhotovoltaic = input.nextDouble();
        return ratingOfPhotovoltaic;
    }

    public String getRoofOrWall(){
        System.out.println(" roof / wall / others");
        roofOrWall = input.next();
        return roofOrWall;
    }

    public String getRoofPitch(){
        System.out.println("roof pitch (rise / run  e.g.  5/12 )");
        roofPitch= input.next();
        return roofPitch;
    }

    public String getRoofMaterial(){
        System.out.println("Roof Material\nAsphalt Shingle/Tile/Steel/Other\nAge & Condition of Shingles");
        roofMaterial= input.next();
        return roofMaterial;
    }

    public String getRoofConstruction(){
        System.out.println("roof construction\nRafter/Truss/Joist");
        roofConstruction= input.next();
        return roofConstruction;
    }

    public boolean getConnectionToRoof(){
        System.out.println("connection to roof");
        connectionToRoof= input.nextBoolean();
        return connectionToRoof;
    }

    public boolean getExistRoofStructure(){
        System.out.println("analysis of existing roof structire\n with added Solar Equipment");
        existRoofStructure = input.nextBoolean();
        return existRoofStructure;
    }

    public boolean getUpliftResistance(){
        System.out.println("Adequate uplift resistance\n120 mph Exp B ASCE 7-05\n 155 mph Exp B ASCE 7-10");
        upliftResistance = input.nextBoolean();
        return upliftResistance;
    }

}
