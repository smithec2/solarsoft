package edu.lsdbc.solarsoft.views;

import edu.lsdbc.solarsoft.services.ApplicationService;

import java.util.Scanner;

public class EditApplicationView extends BaseView{
    public void display() {
        Scanner input = new Scanner(System.in);
        ApplicationService applicationObject = new ApplicationService();
        EnterCredentialsView username = new EnterCredentialsView();
        boolean exit = true;
        int appID = 5;
        while (exit) {
            System.out.println("|----------------------|");
            System.out.println("|   Edit Application   |");
            System.out.println("|----------------------|");
            System.out.println("| 1: Edit              |");
            System.out.println("| 2: Save              |");
            System.out.println("| 3: Submit            |");
            System.out.println("| 4: Delete            |");
            System.out.println("|----------------------|");
            System.out.println("");
            System.out.println("Enter Number to select your option:");

            switch (input.nextInt()) {
                case 1:
                    input.close();
                    applicationObject.editApplication(username.userName,appID);
                    break;
                case 2:
                    input.close();
                    applicationObject.saveApplication(username.userName,appID);
                    break;
                case 3:
                    input.close();
                    applicationObject.submitApplication(username.userName,appID);
                    break;
                case 4:
                    input.close();
                    applicationObject.deleteApplication(username.userName,appID);
                    break;
            }

        }
    }
}
