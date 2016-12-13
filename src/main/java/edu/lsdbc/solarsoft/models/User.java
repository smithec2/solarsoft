package edu.lsdbc.solarsoft.models;

/**
 * Created by Arthur on 12/13/2016.
 */
public class User {
    String username;
    String password;
    String userType;

    // Constructor
    public User(){}

    // Getter and Setter
    public String getUsername() {return username;}
    public void setUsername(String username) {this.username = username;}
    public String getPassword() {return password;}
    public void setPassword(String password) {this.password = password;}
    public String getUserType() {return userType;}
    public void setUserType(String userType) {this.userType = userType;}
}
