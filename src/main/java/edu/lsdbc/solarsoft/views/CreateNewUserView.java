package edu.lsdbc.solarsoft.views;
import edu.lsdbc.solarsoft.services.HomepageService;
import edu.lsdbc.solarsoft.services.LoginService;
import java.util.Scanner;

/**
 * Created by Arthur on 12/8/2016.
 */
public class CreateNewUserView {
    public void display() {
        Scanner input = new Scanner(System.in);
        LoginService loginService = new LoginService();
        HomepageService homepageService = new HomepageService();

        System.out.println("Enter New Username: ");
        String userName = input.next();
        while (loginService.haveUsername(userName)) {
            System.out.println("Name already in use. Enter a different username: ");
            userName = input.next();
        }
        System.out.println("Enter Password: ");
        String password = input.next();

        // Then we need to add the User to the database
        // ---------------------------------------------

        // Go to homepage
        homepageService.goHome(userName);





    }
}
