package edu.lsdbc.solarsoft.views;
import java.util.Scanner;
/**
 * Created by Arthur on 12/6/2016.
 */
public class UserHomeView {
    //public void display(); Use?

    // This will be what Users will interface with
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        boolean exit = true;

        while (exit) {
            System.out.println("|-------------------------|");
            System.out.println("|  This is the Home Menu  |");
            System.out.println("|-------------------------|");
            System.out.println("| 1: Edit Users           |");
            System.out.println("| 2: Edit Applications    |");
            System.out.println("| 3: Logout               |");
            System.out.println("|-------------------------|");
            System.out.println("");
            System.out.println("Enter Number to select your option:");

            switch (input.nextInt()) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    exit = false;
                    break;
            }
        }
    }
}
