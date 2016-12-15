package edu.lsdbc.solarsoft.dao;


import edu.lsdbc.solarsoft.dao.database.Siberia;
import edu.lsdbc.solarsoft.models.SystemUser;
import edu.lsdbc.solarsoft.models.UserType;
import edu.lsdbc.solarsoft.views.UserHome;

/**
 * Created by XPS on 12/10/2016.
 */
public class UserDAO {

    // looks up a user
    public SystemUser findUser(String userName) {
        return Siberia.getInstance().getUsers().get(userName);
    }

    //Method to add user, user name,password and userType
    // individual used to distinguish from user, since user is used everywhere else
    public SystemUser addUser(SystemUser individual) {
        return Siberia.getInstance().getUsers().put(individual.getUserName(), individual);
    }

    //This one might need more work
    public UserType findUserType(String userName) {
        SystemUser temp = Siberia.getInstance().getUsers().get(userName);
        return temp.getUserType();
    }

}
