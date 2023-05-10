package com.pms.admin.dao.Impl;


import com.pms.admin.dao.PCustomerDAO;
import com.pms.model.UserList;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerDAOImpl implements PCustomerDAO {
    Scanner sc=new Scanner(System.in);
    static List<UserList> addUser=new LinkedList<>();
    static List<UserList> policyHolder=new LinkedList<>();
    @Override
    public void addCustomer() {
        System.out.print("Enter User ID =");
        int uid = sc.nextInt();
        System.out.print("Enter User Name=");
        String uname = sc.next();
        System.out.print("Enter User Address=");
        String add = sc.next();
        System.out.print("Enter User Phone=");
        long phone = sc.nextLong();
        System.out.print("Enter email=");
        String email = sc.next();
        System.out.print("Enter Password =");
        String psw = sc.next();
        UserList user = new UserList(uid, uname, add, phone,email, psw);
        addUser.add(user);//add user data to addUser linked-list
        System.out.println(" Registration successful");
    }


    @Override
    public List<UserList> viewAllUserInfo() {
        return addUser;
    }

    @Override
    public UserList viewUserInfo(int id) {
        return null;
    }

    @Override
    public void deleteUser(int id) {

    }

    @Override
    public void updateUser(int id) {

    }

    @Override
    public boolean AuthenticationUserandPassword(String username, String password) {
        int k = 0;
        for (UserList pro : addUser) {

            if ((pro.getemail().equals(username)) && (pro.getpassword().equals(password))) {
                k++;
                return true;
            }
            else if
            ((pro.getemail().equals(username)) || (pro.getemail().equals(password)))
                System.out.println("You Enter wrong User name  or password");
            k++;
            return false;

        }
        if (k == 0)
            System.out.println("User not found");
        return false;


    }

    @Override
    public String getPassword(String email) {
        int k = 0;
        for (UserList pro : addUser) {
            if ((pro.getemail().equals(email))) {
                String getpsw = pro.getpassword();
                k++;
                return getpsw;
            }

        }
        if (k == 0)
            System.out.println("User not Exit");

        return null;

    }

    @Override
    public List<UserList> policyHolder(String email,int policyID) {
        int k = 0;
        for (UserList pro : addUser) {
            if (pro.getemail().equals(email)) {
                UserList ActiveUser = new UserList(pro.getid(),policyID,pro.getUname(),pro.getaddress(),
                        pro.getphone(),pro.getemail(), "Active");
                          policyHolder.add(ActiveUser);
                k++;  //this block code create active user list
                return policyHolder;
            }

        }
        if (k == 0)
            System.out.println("User not Exit");
        return null;
    }
    public void policyHolderDisplay(){

        System.out.println(policyHolder);
    }

}
