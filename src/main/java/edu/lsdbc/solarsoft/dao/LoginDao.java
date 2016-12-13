package edu.lsdbc.solarsoft.dao;


import edu.lsdbc.solarsoft.dao.database.Siberia;
import edu.lsdbc.solarsoft.models.SystemUser;
import edu.lsdbc.solarsoft.views.UserHome;

/**
 * Created by XPS on 12/10/2016.
 */
public class LoginDao {

    // looks up an user
    public SystemUser findUser(String userName) {
        return Siberia.getInstance().getUsers().get(userName);
    }
}
