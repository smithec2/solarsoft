package edu.lsdbc.solarsoft.models;


import java.util.List;
import java.util.ArrayList;

/**
 * Created by Arthur on 12/13/2016.
 */
public class Users {
    String userGroupName;
    List<Object> usersInGroup = new ArrayList<Object>();

    // Constructor
    public Users(){}

    // Getter and Setter
    public String getUserGroupName() {return userGroupName;}
    public void setUserGroupName(String userGroupName) {this.userGroupName = userGroupName;}

    // Add
    public void addUser(SystemUser addedUser) {
        usersInGroup.add(addedUser);
    }
}
