package edu.lsdbc.solarsoft.views;

import edu.lsdbc.solarsoft.services.AddUserService;
import edu.lsdbc.solarsoft.services.EditUserService;
import edu.lsdbc.solarsoft.services.RemoveUserService;

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
                    AddUserService newUser = new AddUserService();
                    newUser.addNewUser();
                    break;
                case 2:
                    input.close();
                    EditUserDisplay editUsers = new EditUserDisplay();
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
