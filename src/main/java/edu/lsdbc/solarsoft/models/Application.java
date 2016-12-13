package edu.lsdbc.solarsoft.models;

/**
 * Created by g47 on 12/13/16.
 */
public class Application {
    private Attachment1 attachment1= new Attachment1();
    private Attachment2 attachment2 = new Attachment2();

    public Application(){

    }

    public Application(Attachment1 attachent1, Attachment2 attachment2){
        this.attachment1 = attachment1;
        this.attachment2 = attachment2;
    }

    public Attachment1 getAttachment1() {
        return attachment1;
    }

    public void setAttachment1(Attachment1 attachment1) {
        this.attachment1 = attachment1;
    }

    public Attachment2 getAttachment2() {
        return attachment2;
    }

    public void setAttachment2(Attachment2 attachment2) {
        this.attachment2 = attachment2;
    }
}
