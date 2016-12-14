package edu.lsdbc.solarsoft.services;

import edu.lsdbc.solarsoft.dao.UserDAO;
import edu.lsdbc.solarsoft.models.SystemUser;

/**
 * Created by XPS on 12/1/2016.
 */
public class LoginService {
    UserDAO userDAO = new UserDAO();

    public boolean authenticateUser(String userName, String password) {
        Boolean result = false;
        SystemUser user = userDAO.findUser(userName);
        if(user != null)
        {
            result = user.getPassword().equals(password);
        }
        return result;
    }

    public boolean haveUsername(String userName) {
        return userDAO.findUser(userName) != null;
    }
}
