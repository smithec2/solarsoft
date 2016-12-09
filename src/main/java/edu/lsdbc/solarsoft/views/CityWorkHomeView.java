package edu.lsdbc.solarsoft.views;

import edu.lsdbc.solarsoft.services.ApplicationService;

import java.util.Scanner;

/**
 * Created by Scott on 12/8/2016.
 */
public class CityWorkHomeView extends BaseView {

    public void display() {
        ApplicationService workerObject = new ApplicationService();
        Scanner input = new Scanner(System.in);
        boolean exit = true;
        int appID;
        String userName = null;

        while (exit) {
            System.out.println("|--------------------------------|");
            System.out.println("|         City Work Home         |");
            System.out.println("|--------------------------------|");
            System.out.println("| 1: View Submitted Applications |");
            System.out.println("| 2: View User Application       |");
            System.out.println("| 3: Accept User Application     |");
            System.out.println("| 4: Reject User Application     |");
            System.out.println("| 5: Exit                        |");
            System.out.println("|--------------------------------|");
            System.out.println("");
            System.out.println("Enter Number to select your option:");

            switch (input.nextInt()) {
                case 1:
                    input.close();
                    workerObject.viewAllSubmitedApplications();
                    break;
                case 2:
                    System.out.println("Enter User name");
                    userName = input.next();
                    System.out.println("Enter app ID");
                    appID = input.nextInt();
                    input.close();
                    workerObject.viewUserApplication_CW(userName, appID);
                    break;
                case 3:
                    System.out.println("Enter User name");
                    userName = input.next();
                    System.out.println("Enter app ID");
                    appID = input.nextInt();
                    input.close();
                    workerObject.acceptApplication(userName, appID);
                    break;
                case 4:
                    System.out.println("Enter User name");
                    userName = input.next();
                    System.out.println("Enter app ID");
                    appID = input.nextInt();
                    input.close();
                    workerObject.rejectApplication(userName, appID);
                    break;
                case 5:
                    input.close();
                    exit = false;
                    break;
            }

        }
    }
}