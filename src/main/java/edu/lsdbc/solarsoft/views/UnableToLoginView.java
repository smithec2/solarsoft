package edu.lsdbc.solarsoft.views;

/**
 * Created by XPS on 12/10/2016.
 */
public class UnableToLoginView extends BaseView {

    public void display(String userName) {
        clearDisplay();
        System.out.println("Sorry User Name and Password do not match");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        userName = null;
        new Login().display(userName);
    }
}
