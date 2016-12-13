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


   /* EnterCredentialsView userNameECV = new EnterCredentialsView();

    public String findUserName()  {
        if (userNameECV.getUserVerified() == true) {
            userName = userNameECV.getUserName();
            return userName;
        } else {
            return userName = null;
        }
    }*/

    private ApplicationIDSingleton applicationIDSingleton;
    private ConditionalUsePermit conditionalUsePermit;
    private Attachment2 attachment2;

    //Constructors
    //constructor for new application
    public SolarApplication(String userName) {
        this.userName = userName;
        this.applicationIDSingleton = applicationIDSingleton;
        this.conditionalUsePermit = conditionalUsePermit;
        this.attachment2 = attachment2;
    }

    //constructor for existing application
}