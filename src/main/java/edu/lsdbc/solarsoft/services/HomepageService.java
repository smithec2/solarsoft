package edu.lsdbc.solarsoft.services;

import edu.lsdbc.solarsoft.models.UserType;

/**
 * Created by XPS on 12/1/2016.
 */
public class HomepageService {
    public void goHome(String userName) {
        switch (findUserType(userName)){
            case applicant:
                //new ApplicantHomePage.display();
        }


    }

    private UserType findUserType(String userName) {
        return UserType.applicant;
    }
}
