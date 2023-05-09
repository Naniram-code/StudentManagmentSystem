package com.pms.admin.dao;

public interface UserDAO {
    public  boolean AuthenticationUserandPassword(String username,String password);
    String getPassword(String Username);

}
