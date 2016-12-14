package edu.lsdbc.solarsoft.models;

import edu.lsdbc.solarsoft.services.ApplicationIDSingleton;
import edu.lsdbc.solarsoft.services.LoginService;
import edu.lsdbc.solarsoft.views.EnterCredentialsView;

/**
 * Created by Glen Turnbow on 12/10/2016.
 */
public class SolarApplication {
    //Data fields referencing ConditionalUsePermit (aka Attachment1) and Attachment2
    //  http://www.bountifulutah.gov/file/702a12ef-98da-41d1-bd1b-6578f8035cfd
    private String userName;
    // LoginService findUserName = new LoginService();
    private ApplicationIDSingleton applicationIDSingleton = new ApplicationIDSingleton();
    private ConditionalUsePermit conditionalUsePermit = new ConditionalUsePermit();
    private Attachment2 attachment2 = new Attachment2();

    //Constructors

    //default constructor.. all you really need. you don't use constructors a whole lot in the real world
    public SolarApplication() {

    }

    //Getters and Setters
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ApplicationIDSingleton getApplicationIDSingleton() {
        return applicationIDSingleton;
    }

    public void setApplicationIDSingleton(ApplicationIDSingleton applicationIDSingleton) {
        this.applicationIDSingleton = applicationIDSingleton;
    }

    public ConditionalUsePermit getConditionalUsePermit() {
        return conditionalUsePermit;
    }

    public void setConditionalUsePermit(ConditionalUsePermit conditionalUsePermit) {
        this.conditionalUsePermit = conditionalUsePermit;
    }

    public Attachment2 getAttachment2() {
        return attachment2;
    }

    public void setAttachment2(Attachment2 attachment2) {
        this.attachment2 = attachment2;
    }
}