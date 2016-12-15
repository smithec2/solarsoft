package edu.lsdbc.solarsoft.models;

/**
 * Created by Arthur on 12/15/2016.
 */
public class DigitalSignature {
    String signName;
    boolean authentic;

    // import and attach a image
    // Jpeg signatureImage = new Jpeg

    // Getter and Setter
    public String getSignName() {return signName;}
    public void setSignName(String signName) {this.signName = signName;}
    public boolean isAuthentic() {return authentic;}
    public void setAuthentic(boolean authentic) {this.authentic = authentic;}
}
