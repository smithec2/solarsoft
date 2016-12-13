package edu.lsdbc.solarsoft.views;

import com.sun.org.apache.xml.internal.utils.StringToStringTableVector;
import edu.lsdbc.solarsoft.services.UserService;

import java.util.Scanner;

/**
 * Created by Scott on 12/6/2016.
 */
public class AdminHome extends BaseView {

    public void display(String userName) {
        Scanner input = new Scanner(System.in);
        boolean exit = true;

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
                    userName = input.next();
                    String password = input.next();
                    System.out.println("Optional user types: admin, employ, applicant");
                    String userType = input.next();
                    userObject.addNewUser(userName, password, userType);
                    break;
                case 2:
                    EditUserView_AdminMod editUsers = new EditUserView_AdminMod();
                    userName = input.next();
                    editUsers.display(userName);
                    break;
                case 3:
                    exit = false;
                    break;
            }

        }
    }
}
