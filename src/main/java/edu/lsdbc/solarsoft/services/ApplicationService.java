package edu.lsdbc.solarsoft.services;

import edu.lsdbc.solarsoft.dao.SolarApplicationDAO;
import edu.lsdbc.solarsoft.models.AppStatusType;
import edu.lsdbc.solarsoft.models.SolarApplication;
import edu.lsdbc.solarsoft.views.EnterCredentialsView;
import edu.lsdbc.solarsoft.views.ViewSubmitedApps;

import java.util.List;

/**
 * Created by Scott on 12/8/2016.
 */
public class ApplicationService {
    public void viewAllSubmitedApplications(){
        SolarApplicationDAO solarApplicationDAO = new SolarApplicationDAO();
        List<SolarApplication> saList = solarApplicationDAO.findSolarApplicationByStatus(AppStatusType.submitted);
        new ViewSubmitedApps().display(saList);
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
