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
    public void addUser(SystemUser individual) {
        Siberia.getInstance().getUsers().put(individual.getUserName(), individual);
    }

    //This one might need more work
    public UserType findUserType(String userName) {
        SystemUser temp = Siberia.getInstance().getUsers().get(userName);
        return temp.getUserType();
    }

    public void changePassword(SystemUser individual_new){
        Siberia.getInstance().getUsers().remove(individual_new.getUserName());
        Siberia.getInstance().getUsers().put(individual_new.getUserName(),individual_new);
    }

    public void removeUser(SystemUser individual_new){
        Siberia.getInstance().getUsers().remove(individual_new.getUserName());
    }


    public void showAllUsers() {
        Siberia.getInstance().viewAllUsers();
    }

    public void changeUsername(SystemUser individual_old, SystemUser individual_new) {
        Siberia.getInstance().getUsers().remove(individual_old.getUserName());
        Siberia.getInstance().getUsers().put(individual_new.getUserName(),individual_new);
    }

    public void changeUserType(SystemUser individual_new, SystemUser individual_old){
        Siberia.getInstance().getUsers().remove(individual_old.getUserName());
        Siberia.getInstance().getUsers().put(individual_new.getUserName(),individual_new);
    }
}
