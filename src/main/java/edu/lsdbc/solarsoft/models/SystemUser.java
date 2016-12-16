package edu.lsdbc.solarsoft.models;

/**
 * Created by Glen Turnbow on 12/10/2016.
 */
public class SystemUser {
    int userId;
    String userName;
    String password;
    UserType userType;

    public SystemUser(String userName, String password, UserType userType) {
        this.userName = userName;
        this.password = password;
        this.userType = userType;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }
}
