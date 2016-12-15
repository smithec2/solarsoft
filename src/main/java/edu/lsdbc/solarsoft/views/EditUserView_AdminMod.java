package edu.lsdbc.solarsoft.views;


import edu.lsdbc.solarsoft.services.LoginService;
import edu.lsdbc.solarsoft.services.UserService;

import java.util.Scanner;

/**
 * Created by Scott on 12/7/2016.
 */
public class EditUserView_AdminMod extends BaseView {
    UserService userToEdit = new UserService();
    public void display(String userName) {
        Scanner input = new Scanner(System.in);
        LoginService loginService = new LoginService();
        boolean exit = true;
        String adminUserName = userName;

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

            switch (input.nextInt()) {
                case 1:
                    break;
                case 2:
                    System.out.println("Enter User Name to Edit:");
                    String username_Edit = input.next();
                    if(loginService.haveUsername(username_Edit)){
                        userToEdit.editUserName(username_Edit);
                    }else {
                        System.out.println("");
                        System.out.println(username_Edit + " does Not exist, Check your spelling and try again");
                        System.out.println("");
                    }
                    break;
                case 3:
                    System.out.println("Enter Username to change password for:");
                    String username_EditPassword = input.next();
                    if(loginService.haveUsername(username_EditPassword)){
                        System.out.println("Enter Password:");
                        String password_New = input.next();
                        userToEdit.changePassword(username_EditPassword, password_New);
                    }else {
                        System.out.println("");
                        System.out.println(username_EditPassword + " does Not exist, Check your spelling and try again");
                        System.out.println("");
                    }
                    break;
                case 4:
                    System.out.println("Enter User access type");
                    String userAccess = input.next();
                    userToEdit.userAccessType(userAccess);
                    break;
                case 5:
                    System.out.println("Enter User Name to be Remove");
                    String userName_Remove = input.next();
                    UserService userToRemove = new UserService();
                    userToRemove.removeUser(userName_Remove);
                    break;
                case 6:
                    exit = false;
                    break;
            }

        }
    }
}
