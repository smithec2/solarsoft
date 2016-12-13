package edu.lsdbc.solarsoft.views;

import edu.lsdbc.solarsoft.services.HomepageService;
import edu.lsdbc.solarsoft.services.LoginService;

import java.util.Scanner;

/**
 * Created by Scott on 12/13/2016.
 */
public class EnterCredentialsView {
    LoginService loginService = new LoginService();
    HomepageService homepageService = new HomepageService();
    Scanner inputCred = new Scanner(System.in);
    String userName = null;

    public EnterCredentialsView() {
    }

    public void display() {
        Scanner inputCred = new Scanner(System.in);
        String userName = null;
        String password = null;

        System.out.println("Enter User Name");
        userName = inputCred.next();
        System.out.println("Enter Password");
        password = inputCred.next();
        if (loginService.authenticateUser(userName, password)) {
            // go to the home page
            homepageService.goHome(userName);
        } else {
            new UnableToLoginView().display();
        }
    }
}
