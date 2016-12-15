package edu.lsdbc.solarsoft.views;


import edu.lsdbc.solarsoft.services.LoginService;
import edu.lsdbc.solarsoft.services.UserService;

import java.util.Scanner;

/**
 * Created by Scott on 12/7/2016.
 *
 * Edited by Scott Muhlestein - SM on 12/14/2016
 */
public class EditUserView_AdminMod extends BaseView {
    UserService userToEdit = new UserService();
    public void display(String userName) {
        Scanner input = new Scanner(System.in);
        LoginService loginService = new LoginService();
        boolean exit = true;
        //String adminUserName = userName;

        while (exit) {
            System.out.println("|-------------------------|");
            System.out.println("|        Edit User        |");
            System.out.println("|-------------------------|");
            System.out.println("| 1: Show All User names  |");
            System.out.println("| 2: Edit Username        |");
            System.out.println("| 3: Edit User Password   |");
            System.out.println("| 4: Edit User type       |");
            System.out.println("| 5: Remove User          |");
            System.out.println("| 6: Exit                 |");
            System.out.println("|-------------------------|");
            System.out.println("");
            System.out.println("Enter Number to select your option:");

            switch (input.next().charAt(0)) {

                // show All user names
                case '1':
                    userToEdit.showAllUserNames();
                    break;

                // edit users names
                case '2':
                    // Checks username with those in database
                    System.out.println("Enter Username to Edit:");
                    String username_Edit = input.next();
                    // if user exists edit else give user not found text
                    if(loginService.haveUsername(username_Edit)){
                        System.out.println("Enter New Username:");
                        String username_New = input.next();
                        userToEdit.editUserName(username_Edit, username_New);
                    }else {
                        System.out.println("");
                        System.out.println(username_Edit + " does Not exist, Check your spelling and try again");
                        System.out.println("");
                    }
                    break;

                // edit users passwords
                case '3':
                    // Checks username with those in database
                    System.out.println("Enter Username to change password for:");
                    String EditPassword_username = input.next();
                    // if user exists edit else give user not found text
                    if(loginService.haveUsername(EditPassword_username)){
                        System.out.println("Enter Password:");
                        String password_New = input.next();
                        userToEdit.changePassword(EditPassword_username, password_New);
                        System.out.println("");
                        System.out.println("password change Successful");
                        System.out.println("");
                    }else {
                        System.out.println("");
                        System.out.println(EditPassword_username + " does Not exist, Check your spelling and try again");
                        System.out.println("");
                    }
                    break;

                // edit users type
                case '4':
                    // Checks username with those in database
                    System.out.println("Enter Username to Edit:");
                    String username_EditAccess = input.next();
                    // if user exists edit else give user not found text
                    if(loginService.haveUsername(username_EditAccess)){
                        System.out.println("Enter UserType:");
                        String userAccess = input.next();
                        userToEdit.userAccessType(username_EditAccess, userAccess);
                    }else {
                        System.out.println("");
                        System.out.println(username_EditAccess + " does Not exist, Check your spelling and try again");
                        System.out.println("");
                    }

                    break;

                // remove a user
                case '5':
                    // Checks username with those in database
                    System.out.println("Enter User Name to be Removed:");
                    String username_EditRemove = input.next();
                    // if user exists edit else give user not found text
                    if(loginService.haveUsername(username_EditRemove)){
                        System.out.println("Are you sure you want to remove " + username_EditRemove);
                        System.out.println("1. YES");
                        System.out.println("2. NO");
                        char remove = input.next().charAt(0);
                        switch (remove){
                            case '1':
                                userToEdit.removeUser(username_EditRemove);
                                if(loginService.haveUsername(username_EditRemove)){
                                    System.out.println("");
                                    System.out.println("User was not Removed");
                                    System.out.println("");
                                }
                                else {
                                    System.out.println("");
                                    System.out.println("User was Removed");
                                    System.out.println("");
                                }
                                break;
                            case '2':
                            default:
                                System.out.println("");
                                System.out.println("No changes were made");
                                System.out.println("");
                                break;
                        }
                    }else {
                        System.out.println("");
                        System.out.println(username_EditRemove + " does Not exist, Check your spelling and try again");
                        System.out.println("");
                    }
                    break;
                case '6':
                    exit = false;
                    break;
                default:
                    break;
            }

        }
    }
}
