package edu.lsdbc.solarsoft.services;

import edu.lsdbc.solarsoft.dao.UserDAO;
import edu.lsdbc.solarsoft.dao.database.Siberia;
import edu.lsdbc.solarsoft.models.SystemUser;
import edu.lsdbc.solarsoft.models.UserType;

import java.util.Scanner;

 /*
 * To add user to siberia
 * users.put(userName, new SystemUser(userName, password, UserType.applicant));
 *
 */

/**
 * Created by Scott on 12/7/2016.
 */
public class UserService {

    UserDAO userDAO = new UserDAO();

    public void admin_addNewUser(String adminUser, String userName, String password, String userType) {

        UserType userType_Object = userDAO.findUserType(adminUser);
        // converts enum to string for comparison
        String userType_String = userType_Object.toString();

        // admin verification thus only admin users can add users of any type
        if (userType_String == "admin") {
            userDAO.addUser(new SystemUser(userName, password, UserType.valueOf(userType)));
        }

    }

    // SM - Separated out New applicant user creations from the addNewUser due to admin credential verification
    public void createNewUser_FromLogin(String userName, String password, String userType) {
        userDAO.addUser(new SystemUser(userName, password, UserType.valueOf(userType)));
    }

    public void editUserName(String userName) {

    }

    public void changePassword(String userName, String password) {

    }

    public void userAccessType(String userType) {

    }

    public void removeUser(String userName) {

    }

    public void userChangePassword(String password) {

    }
}
