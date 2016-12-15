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
            System.out.println("|-----------------------|");
            System.out.println("|       Admin Home      |");
            System.out.println("|-----------------------|");
            System.out.println("| 1: Add User           |");
            System.out.println("| 2: Edit Users         |");
            System.out.println("| 3: Goto UserHome      |");
            System.out.println("| 4: Goto CityWorkHome  |");
            System.out.println("| 5: Exit               |");
            System.out.println("|-----------------------|");
            System.out.println("");
            System.out.println("Enter Number to select your option:");

            switch (input.next().charAt(0)) {
                case '1':
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
                case '2':
                    EditUserView_AdminMod editUsers = new EditUserView_AdminMod();
                    editUsers.display(adminUser);
                    break;
                case '3':
                    new UserHome().display(adminUser);
                    break;
                case '4':
                    new CityWorkHomeView().display(adminUser);
                    break;
                case '5':
                    exit = false;
                    break;
                default:
                    break;
            }

        }
    }
}
