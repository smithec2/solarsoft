package edu.lsdbc.solarsoft.views;

import edu.lsdbc.solarsoft.services.UserService;

import java.util.Scanner;

/**
 * Created by Scott on 12/6/2016.
 */
public class AdminHome implements BaseView {

    public void display() {
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
                    input.close();
                    UserService userObject = new UserService();
                    //userObject.addNewUser();
                    break;
                case 2:
                    input.close();
                    EditUserView_AdminMod editUsers = new EditUserView_AdminMod();
                    editUsers.display();
                    break;
                case 3:
                    input.close();
                    exit = false;
                    break;
            }

        }
    }
}
