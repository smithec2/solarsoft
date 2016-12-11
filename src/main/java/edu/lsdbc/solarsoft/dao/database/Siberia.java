package edu.lsdbc.solarsoft.dao.database;

import edu.lsdbc.solarsoft.models.SolarApplication;
import edu.lsdbc.solarsoft.models.SystemUser;
import edu.lsdbc.solarsoft.models.UserType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by Glen Turnbow on 12/8/2016.
 * Meant to manage the database... I think.
 */
public class Siberia {


    //users
    private Map<String, SystemUser> users = new HashMap<String, SystemUser>();

    //solarApplication
    private List<SolarApplication> applications = new ArrayList<SolarApplication>();

    private static Siberia ourInstance = new Siberia();

    //Constructor
    private Siberia() {
        users.put("app", new SystemUser("app", "p", UserType.applicant));
        users.put("admin", new SystemUser("admin", "p", UserType.admin));
        users.put("emp", new SystemUser("emp", "p", UserType.employ));
    }

    public static Siberia getInstance() {
        return ourInstance;
    }

    public Map<String, SystemUser> getUsers() {
        return users;
    }

    public void setUsers(Map<String, SystemUser> users) {
        this.users = users;
    }

    public List<SolarApplication> getApplications() {
        return applications;
    }

    public void setApplications(List<SolarApplication> applications) {
        this.applications = applications;
    }
}
