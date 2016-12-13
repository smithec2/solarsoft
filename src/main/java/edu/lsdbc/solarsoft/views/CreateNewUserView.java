package edu.lsdbc.solarsoft.views;
import edu.lsdbc.solarsoft.services.HomepageService;
import edu.lsdbc.solarsoft.services.LoginService;
import edu.lsdbc.solarsoft.services.UserService;

import java.util.Scanner;

/**
 * Created by Arthur on 12/8/2016.
 */
public class CreateNewUserView {
    public void display(String userName) {
        // Scanner and services
        Scanner input = new Scanner(System.in);
        LoginService loginService = new LoginService();
        HomepageService homepageService = new HomepageService();
        UserService userService = new UserService();

        // Here we ask for the new user's desired name and password
        System.out.println("Enter New Username:");
        userName = input.next();
        while (loginService.haveUsername(userName)) {
            System.out.println("Name already in use. Enter a different username:");
            userName = input.next();
        }
        System.out.println("Enter Password: ");
        String password = input.next();

        // Default to Normal user
        String userType = "normal";

        // Add the User to the database
        userService.addNewUser(userName, password, userType);

        // Go to homepage
        homepageService.goHome(userName);
    }
}