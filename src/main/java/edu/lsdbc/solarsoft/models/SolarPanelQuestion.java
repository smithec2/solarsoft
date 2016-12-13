package edu.lsdbc.solarsoft.models;

/**
 * Created by g47 on 12/7/16.
 */
public class SolarPanelQuestion {
        private double arrayDimensions;
        private double totalNumberOfPanel;
        private double ratingOfPhotovoltaic;
        private String roofOrWall;
        private String roofPitch;
        private String roofMaterial;
        private String roofConstruction;
        private boolean connectionToRoof;
        private boolean existRoofStructure;
        private boolean upliftResistance;

        public SolarPanelQuestion(double arrayDimensions,double totalNumberOfPanel ,double ratingOfPhotovoltaic, String roofOrWall, String roofPitch, String roofMaterial, String roofConstruction, boolean connectionToRoof, boolean existRoofStructure, boolean upliftResistance) {
            this.arrayDimensions = arrayDimensions;
            this.totalNumberOfPanel= totalNumberOfPanel;
            this.ratingOfPhotovoltaic = ratingOfPhotovoltaic;
            this.roofOrWall = roofOrWall;
            this.roofPitch = roofPitch;
            this.roofMaterial = roofMaterial;
            this.roofConstruction = roofConstruction;
            this.connectionToRoof = connectionToRoof;
            this.existRoofStructure = existRoofStructure;
            this.upliftResistance = upliftResistance;
        }
        public SolarPanelQuestion(){

        }

        public double getTotalNumberOfPanel() {
            return totalNumberOfPanel;
        }

        public void setTotalNumberOfPanel(double totalNumberOfPanel) {
            this.totalNumberOfPanel = totalNumberOfPanel;
        }

        public double getRatingOfPhotovoltaic() {
            return ratingOfPhotovoltaic;
        }

        public void setRatingOfPhotovoltaic(double ratingOfPhotovoltaic) {
            this.ratingOfPhotovoltaic = ratingOfPhotovoltaic;
        }

        public double getArrayDimensions() {
            return arrayDimensions;
        }

        public void setArrayDimensions(double arrayDimensions) {
            this.arrayDimensions = arrayDimensions;
        }

        public String getRoofOrWall() {
            return roofOrWall;
        }

        public void setRoofOrWall(String roofOrWall) {
            this.roofOrWall = roofOrWall;
        }

        public String getRoofPitch() {
            return roofPitch;
        }

        public void setRoofPitch(String roofPitch){
            this.roofPitch= roofPitch;
        }

        public String getRoofMaterial() {
            return roofMaterial;
        }

        public void setRoofMaterial(String roofMaterial) {
            this.roofMaterial = roofMaterial;
        }

        public String getRoofConstruction() {
            return roofConstruction;
        }

        public void setRoofConstruction(String roofConstruction) {
            this.roofConstruction = roofConstruction;
        }

        public boolean getConnectionToRoof() {
            return connectionToRoof;
        }

        public void setConnectionToRoof(boolean connectionToRoof) {
            this.connectionToRoof = connectionToRoof;
        }

        public boolean getExistRoofStructure() {
            return existRoofStructure;
        }

        public void setExistRoofStructure(boolean existRoofStructure) {
            this.existRoofStructure = existRoofStructure;
        }

        public boolean getUpliftResistance() {
            return upliftResistance;
        }

        public void setUpliftResistance(boolean upliftResistance) {
            this.upliftResistance = upliftResistance;
        }
    }
