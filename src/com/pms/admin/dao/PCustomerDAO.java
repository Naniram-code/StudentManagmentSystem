package com.pms.admin.dao;

import com.pms.model.UserList;

import java.util.List;

public interface PCustomerDAO  {
    public void addCustomer();
    public List<UserList> viewAllUserInfo();
    public UserList viewUserInfo(int id);
    public void deleteUser(int id);
    public void updateUser(int id);
    public  boolean AuthenticationUserandPassword(String username,String password);
    String getPassword(String Username);
    public List<UserList> policyHolder(String email,int policyID);

}
