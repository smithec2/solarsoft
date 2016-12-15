package edu.lsdbc.solarsoft.services;

import edu.lsdbc.solarsoft.dao.UserDAO;
import edu.lsdbc.solarsoft.models.UserType;
import edu.lsdbc.solarsoft.views.AdminHome;
import edu.lsdbc.solarsoft.views.CityWorkHomeView;
import edu.lsdbc.solarsoft.views.UserHome;

/**
 * Created by XPS on 12/1/2016.
 *
 * Edited by: Scott Muhlestein - SM on 12/14/2016
 */
public class HomepageService {
    public void goHome(String userName) {
        // SM - UserDAO object to access the database
        UserDAO findUserType = new UserDAO();

        // SM - Use UserDAO to find UserType
        switch (findUserType.findUserType(userName)) {
            case applicant:
                new UserHome().display(userName);
                break;
            case admin:
                new AdminHome().display(userName);
                break;
            case employ:
                new CityWorkHomeView().display(userName);
                break;
        }


    }


    /*
    // Commented out By Scott
    private UserType findUserType(String userName) {
        return UserType.applicant;
    }
    */
}
