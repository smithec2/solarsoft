package edu.lsdbc.solarsoft.views;

import java.util.Scanner;

/**
 * Created by XPS on 12/1/2016.
 */
public class Login extends BaseView {
    public void display() {
        Scanner input = new Scanner(System.in);
        boolean exit = true;

        while (exit) {
            System.out.println("|----------------|");
            System.out.println("|     Login      |");
            System.out.println("|----------------|");
            System.out.println("| 1: Login       |");
            System.out.println("| 2: New User    |");
            System.out.println("| 3: Exit        |");
            System.out.println("|----------------|");
            System.out.println("");
            System.out.println("Enter Number to select your option:");

            switch (input.nextInt()) {
                case 1:
                    EnterCredentialsView login = new EnterCredentialsView();
                    login.display();
                    break;
                case 2:
                    CreateNewUserView newUser = new CreateNewUserView();
                    newUser.display();
                    break;
                case 3:
                    exit = false;
                    break;
            }

        }
    }
}
