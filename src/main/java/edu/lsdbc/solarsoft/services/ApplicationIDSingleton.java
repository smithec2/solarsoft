package edu.lsdbc.solarsoft.services;

public class ApplicationIDSingleton {
    public static int appID = 0;

    public int newAppID(){
        appID += 1;
        return appID;
    }
}
