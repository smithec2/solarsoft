package edu.lsdbc.solarsoft.services;

import edu.lsdbc.solarsoft.models.UserType;
import edu.lsdbc.solarsoft.views.AdminHome;
import edu.lsdbc.solarsoft.views.UserHome;

/**
 * Created by XPS on 12/1/2016.
 */
public class HomepageService {
    public void goHome(String userName) {
        switch (findUserType(userName)){
            case applicant:
                new UserHome().display(userName);
            break;
            case admin:
                new AdminHome().display(userName);
                break;
            case employ:
                //EmployHome
                break;
        }


    }

    private UserType findUserType(String userName) {
        return UserType.applicant;
    }
}
