package edu.lsdbc.solarsoft.views;

import com.sun.org.apache.xml.internal.utils.StringToStringTableVector;
import edu.lsdbc.solarsoft.services.LoginService;
import edu.lsdbc.solarsoft.services.UserService;

import java.util.Scanner;

/**
 * Created by Scott on 12/6/2016.
 */
public class AdminHome extends BaseView {

    public void display(String userName) {
        Scanner input = new Scanner(System.in);
        LoginService loginService = new LoginService();
        boolean exit = true;
        String adminUser = userName;

        while (exit) {
            System.out.println("|----------------|");
            System.out.println("|   Admin Home   |");
            System.out.println("|----------------|");
            System.out.println("| 1: Add User    |");
            System.out.println("| 2: Edit Users  |");
            System.out.println("| 3: Exit        |");
            System.out.println("|----------------|");
            System.out.println("");
            System.out.println("Enter Number to select your option:");

            switch (input.nextInt()) {
                case 1:
                    UserService userObject = new UserService();

                    // request username
                    System.out.println("Enter New Username:");
                    userName = input.next();
                    // validates user name doesn't already exist
                    while (loginService.haveUsername(userName)) {
                        System.out.println("");
                        System.out.println("Name already in use. Enter a different username:");
                        System.out.println("");
                        userName = input.next();
                    }
                    // request password
                    System.out.println("Enter Password: ");
                    String password = input.next();
                    System.out.println("Optional user types: admin, employ, applicant");
                    String userType = input.next();
                    userObject.admin_addNewUser(adminUser, userName, password, userType);
                    break;
                case 2:
                    EditUserView_AdminMod editUsers = new EditUserView_AdminMod();

                    userName = input.next();
                    if(loginService.haveUsername(userName)){
                        editUsers.display(userName);
                    }else {
                        System.out.println("");
                        System.out.println(userName + " does Not exist, Check your spelling and try again");
                        System.out.println("");
                    }
                    break;
                case 3:
                    exit = false;
                    break;
            }

        }
    }
}
