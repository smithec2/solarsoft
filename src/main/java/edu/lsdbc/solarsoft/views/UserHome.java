package edu.lsdbc.solarsoft.views;
import edu.lsdbc.solarsoft.services.ApplicationService;

import java.util.Scanner;
/**
 * Created by Arthur on 12/6/2016.
 */
public class UserHome {
    // This will be what normal Users will interface with
    public void display (String userName) {
        Scanner input = new Scanner(System.in);
        boolean exit = true;

        while (exit) {
            System.out.println("|------------------------------|");
            System.out.println("|       User Home              |");
            System.out.println("|------------------------------|");
            System.out.println("| 1: Edit User                 |");
            System.out.println("| 2: View Applications Drafts  |");
            System.out.println("| 3: Edit Applications         |");
            System.out.println("| 4: New Application           |");
            System.out.println("| 5: Logout                    |");
            System.out.println("|------------------------------|");
            System.out.println("");
            System.out.println("Enter Number to select your option:");

            switch (input.nextInt()) {
                case 1:
                    EditUserView_User editSelf = new EditUserView_User();
                    editSelf.display(userName);
                    break;
                case 2:
                    // Run ApplicationService viewApps_User
                    ApplicationService applicationService = new ApplicationService();
                    applicationService.viewApps_User(userName);
                    break;
                case 3:
                    // Reference to edit application view -- need class
                    break;
                case 4:
                    // Reference to new application view  -- need class
                    break;
                case 5:
                    exit = false;
                    break;
            }
        }
    }
}
