package edu.lsdbc.solarsoft.services;

import edu.lsdbc.solarsoft.views.EnterCredentialsView;

/**
 * Created by Scott on 12/8/2016.
 */
public class ApplicationService {
    public void viewAllSubmitedApplications(){

    }
    public void viewUserApplication_CW(String userName, int appID){

    }
    public void viewApps_User(String userName){

    }
    public void newApplication(){
        ApplicationIDSingleton appID = new ApplicationIDSingleton();
        EnterCredentialsView username = new EnterCredentialsView();
        NewApplicationService application = new NewApplicationService(username.getUserName(),appID.newAppID());
    }
    public void editApplication(String userName, int appID) {

    }
    public void deleteApplication(String userName, int appID){

    }
    public void submitApplication(String userName, int appID){

    }
    public void acceptApplication(String userName, int appID){

    }
    public void rejectApplication(String userName, int appID){

    }

    public void saveApplication(String username, int appID){

    }

}
