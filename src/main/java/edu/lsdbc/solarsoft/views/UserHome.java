package edu.lsdbc.solarsoft.views;
import java.util.Scanner;
/**
 * Created by Arthur on 12/6/2016.
 */
public class UserHome {
    // This will be what normal Users will interface with
    public void display () {
        Scanner input = new Scanner(System.in);
        boolean exit = true;

        while (exit) {
            System.out.println("|-----------------------|");
            System.out.println("|       User Home       |");
            System.out.println("|-----------------------|");
            System.out.println("| 1: Edit User          |");
            System.out.println("| 2: Edit Applications  |");
            System.out.println("| 3: New Application    |");
            System.out.println("| 4: Logout             |");
            System.out.println("|-----------------------|");
            System.out.println("");
            System.out.println("Enter Number to select your option:");

            switch (input.nextInt()) {
                case 1:
                    EditUserView_User editSelf = new EditUserView_User();
                    editSelf.display();
                    break;
                case 2:
                    // Reference to edit application view -- need class
                    break;
                case 3:
                    // Reference to new application view  -- need class
                    break;
                case 4:
                    exit = false;
                    break;
            }
        }
    }
}
