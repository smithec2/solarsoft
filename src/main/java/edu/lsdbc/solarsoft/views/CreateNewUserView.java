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
        String userType = null;

        // Here we ask for the new user's desired name, password and type
        System.out.println("Enter New Username:");
        userName = input.next();
        while (loginService.haveUsername(userName)) {
            System.out.println("Name already in use. Enter a different username:");
            userName = input.next();
        }
        System.out.println("Enter Password: ");
        String password = input.next();

        System.out.println("Enter User Type. 1 for Admin, 2 for Contractor, 3 for Normal:");
        int typeChoice = input.nextInt();
        while (typeChoice < 1 || typeChoice > 3) {
            System.out.println("Invalid choice. Try again:");
            typeChoice = input.nextInt();
        }

        // integer choice converted to user type string
        switch (typeChoice) {
            case 1:
                userType = "Admin";
                break;
            case 2:
                userType = "Contractor";
                break;
            case 3:
                userType = "Normal";
                break;
        }

        // Add the User to the database
        userService.addNewUser(userName, password, userType);

        // Go to homepage
        homepageService.goHome(userName);
    }
}
