package edu.lsdbc.solarsoft.dao;

/**
 * Created by XPS on 11/28/2016.
 */
public class dao {
    private static dao ourInstance = new dao();

    public static dao getInstance() {
        return ourInstance;
    }

    private dao() {
    }
}
