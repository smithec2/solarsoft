package edu.lsdbc.solarsoft.services;

import edu.lsdbc.solarsoft.dao.LoginDao;
import edu.lsdbc.solarsoft.models.SystemUser;

/**
 * Created by XPS on 12/1/2016.
 */
public class LoginService {
    LoginDao loginDao = new LoginDao();

    public boolean authenticateUser(String userName, String password) {
        Boolean result = false;
        SystemUser user = loginDao.findUser(userName);
        if(user != null)
        {
            result = user.getPassword().equals(password);
        }
        return result;
    }

    public boolean haveUsername(String userName) {
        return loginDao.findUser(userName) != null;
    }
}
