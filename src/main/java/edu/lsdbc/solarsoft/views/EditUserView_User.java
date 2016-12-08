package edu.lsdbc.solarsoft.views;

import edu.lsdbc.solarsoft.services.UserService;

import java.util.Scanner;

/**
 * Created by Scott on 12/7/2016.
 */
public class EditUserView_User {
    UserService userToEdit = new UserService();
    Scanner input = new Scanner(System.in);
    boolean exit = true;

        while (exit) {
        System.out.println("|-------------------------|");
        System.out.println("|        Edit User        |");
        System.out.println("|-------------------------|");
        System.out.println("| 1: Change Password      |");
        System.out.println("| 2: Exit                 |");
        System.out.println("|-------------------------|");
        System.out.println("");
        System.out.println("Enter Number to select your option:");

        switch (input.nextInt()) {
            case 1:
                System.out.println("Enter new password:");
                String password = input.next();
                input.close();
                userToEdit.userChangePassword(password);
                break;
            case 2:
                exit = false;
                break;
        }

    }
}
}
