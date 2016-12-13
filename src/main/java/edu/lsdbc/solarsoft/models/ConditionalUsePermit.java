package edu.lsdbc.solarsoft.models;

/**
 * Created by Arthur on 12/7/2016.
 */
public class ConditionalUsePermit {

    // Attributes
    //PropertyOwner propertyOwner = new PropertyOwner();  //-- need class
    Contractor contractor = new Contractor();
    boolean feePaid;
    boolean sitePlanApproved;
    boolean oneLineDiagram;
    boolean engineerLetter;

    boolean solarPacketForms;
    boolean packetQuestions;
    boolean packetMetering;
    boolean packetLightPower;
    boolean packetBuildingPermit;

    boolean specSheets;
    boolean electricalPhoto;

    //DigitalSignature signOwner1 = new DigitalSignature;  //-- need class
    //DigitalSignature signOwner2 = new DigitalSignature;  //-- need class


    // Constructors
    public ConditionalUsePermit(){}

    // Get and Set
    public Contractor getContractor() {return contractor;}
    public void setContractor(Contractor contractor) {this.contractor = contractor;}
    public boolean isFeePaid() {return feePaid;}
    public void setFeePaid(boolean feePaid) {this.feePaid = feePaid;}
    public boolean isSitePlanApproved() {return sitePlanApproved;}
    public void setSitePlanApproved(boolean sitePlanApproved) {this.sitePlanApproved = sitePlanApproved;}
    public boolean isOneLineDiagram() {return oneLineDiagram;}
    public void setOneLineDiagram(boolean oneLineDiagram) {this.oneLineDiagram = oneLineDiagram;}
    public boolean isEngineerLetter() {return engineerLetter;}
    public void setEngineerLetter(boolean engineerLetter) {this.engineerLetter = engineerLetter;}
    public boolean isSolarPacketForms() {return solarPacketForms;}
    public void setSolarPacketForms(boolean solarPacketForms) {this.solarPacketForms = solarPacketForms;}
    public boolean isPacketQuestions() {return packetQuestions;}
    public void setPacketQuestions(boolean packetQuestions) {this.packetQuestions = packetQuestions;}
    public boolean isPacketMetering() {return packetMetering;}
    public void setPacketMetering(boolean packetMetering) {this.packetMetering = packetMetering;}
    public boolean isPacketLightPower() {return packetLightPower;}
    public void setPacketLightPower(boolean packetLightPower) {this.packetLightPower = packetLightPower;}
    public boolean isPacketBuildingPermit() {return packetBuildingPermit;}
    public void setPacketBuildingPermit(boolean packetBuildingPermit) {this.packetBuildingPermit = packetBuildingPermit;}
    public boolean isSpecSheets() {return specSheets;}
    public void setSpecSheets(boolean specSheets) {this.specSheets = specSheets;}
    public boolean isElectricalPhoto() {return electricalPhoto;}
    public void setElectricalPhoto(boolean electricalPhoto) {this.electricalPhoto = electricalPhoto;}
}
