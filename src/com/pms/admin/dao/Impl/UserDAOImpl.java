package com.pms.admin.dao.Impl;

import com.pms.admin.dao.UserDAO;
import com.pms.model.User;

import static com.pms.admin.dao.Impl.CustomerDAOImpl.addUsers;

public class UserDAOImpl implements UserDAO {
    @Override
    public boolean AuthenticationUserandPassword(String username, String password) {
        int k = 0;
        for (User pro : addUsers) {

            if ((pro.getUserName().equals(username)) && (pro.getPassword().equals(password))) {
                k++;
                return true;
            }
            else if
            ((pro.getUserName().equals(username)) || (pro.getPassword().equals(password)))
                System.out.println("You Enter wrong User name  or password");
            k++;
            return false;

          }
           if (k == 0)
            System.out.println("User not found");
              return false;

    }


    @Override
    public String getPassword(String Username) {
        int k = 0;
        for (User pro : addUsers) {
            if ((pro.getUserName().equals(Username))) {
                String getpsw = pro.getPassword();
                k++;
                return getpsw;
            }

        }
        if (k == 0)
            System.out.println("User not Exit");

        return null;
    }
}
