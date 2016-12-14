package edu.lsdbc.solarsoft.services;

import edu.lsdbc.solarsoft.dao.UserDAO;
import edu.lsdbc.solarsoft.dao.database.Siberia;
import edu.lsdbc.solarsoft.models.SystemUser;
import edu.lsdbc.solarsoft.models.UserType;

/**
 * Created by Scott on 12/7/2016.
 */
public class UserService {
    UserDAO userDAO = new UserDAO();
    public void addNewUser(String userName, String password, String userType){
        //To add user to siberia
        //users.put(userName, new SystemUser(userName, password, UserType.applicant));
        UserType userType_Object = userDAO.findUserType(userName);
        String userType_String = userType_Object.toString();
         if(userType_String == "admin"){
             userDAO.addUser(new SystemUser(userName, password, UserType.valueOf(userType)));
        }
        /*else if(userType_String == "applicant"){

        }else if(userType_String == "employ"){

        }*/

    }
    public void editUserName(String userName) {

    }
    public void changePassword(String userName, String password){

    }
    public void userAccessType(String userType){

    }
    public void removeUser(String userName){

    }
    public void userChangePassword(String password){

    }
}
