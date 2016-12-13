package edu.lsdbc.solarsoft.views;

import edu.lsdbc.solarsoft.services.HomepageService;
import edu.lsdbc.solarsoft.services.LoginService;

import java.util.Scanner;

/**
 * Created by Scott on 12/13/2016.
 */
public class EnterCredentialsView extends BaseView{
    LoginService loginService = new LoginService();
    HomepageService homepageService = new HomepageService();
    String userName = null;

    public String getUserName(){
        return userName;
    }

    public EnterCredentialsView() {
    }

    public void display() {
        Scanner input = new Scanner(System.in);
        String userName = null;
        String password = null;

        System.out.println("Enter User Name");
        userName = input.next();
        System.out.println("Enter Password");
        password = input.next();
        if (loginService.authenticateUser(userName, password)) {
            // go to the home page
            homepageService.goHome(userName);
        } else {
            new UnableToLoginView().display();
        }
    }
}
