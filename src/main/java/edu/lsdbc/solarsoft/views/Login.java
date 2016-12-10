package edu.lsdbc.solarsoft.views;

import edu.lsdbc.solarsoft.services.HomepageService;
import edu.lsdbc.solarsoft.services.LoginService;

import java.util.Scanner;

/**
 * Created by XPS on 12/1/2016.
 */
public class Login implements BaseView {
    LoginService loginService = new LoginService();
    HomepageService homepageService = new HomepageService();
    Scanner input = new Scanner(System.in);
    String userName = null;
    public Login(){}
    public void display() {
        Scanner input = new Scanner(System.in);
        String userName = null;
        String password = null;

        while (!loginService.checkPassword(password)) {
            while (!loginService.haveUsername(userName)) {
                System.out.println("Enter User Name");
                userName = input.next();
            }
            System.out.println("Enter Password");
            password = input.next();

        }
        // go to the home page
        homepageService.goHome(userName);
    }
}
