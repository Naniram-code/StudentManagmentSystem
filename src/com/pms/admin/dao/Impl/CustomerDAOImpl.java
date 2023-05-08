package com.pms.admin.dao.Impl;

import com.pms.admin.dao.CustomerDAO;

import com.pms.model.User;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerDAOImpl implements CustomerDAO {
    static Scanner sc =new Scanner(System.in);
    static List<User> addUsers=new LinkedList<>();
    @Override
    public void addCustomer() {
        int k  = 1;
        while (k==1) {
            System.out.print("Enter User ID =");
            int uid=sc.nextInt();
            System.out.print("Enter User Name=");
            String name=sc.next();
            System.out.print("Enter User Address=");
            String add=sc.next();
            System.out.print("Enter User Phone=");
            long phone=sc.nextLong();
            System.out.print("Enter UserName=");
            String Username=sc.next();
            System.out.print("Enter Password =");
            String psw=sc.next();
            User user=new User(uid,name,add,phone,Username,psw);
            addUsers.add(user);
            System.out.println("Customer add successfully");
            System.out.println("Do you want add more Customer Y for 1/ N for 2=");
            k =sc.nextInt();

        }}


    @Override
    public List<User> viewAllUserInfo() {
        return addUsers;
    }

    @Override
    public User viewUserInfo(int id) {
        for (User pro :addUsers)
        {
            if (pro.getuId()==id)
                return pro;
        }
        return null;
    }


    @Override
    public void deleteUser(int id) {
        int k=0;
        for (User pro :addUsers)
        {
            if (pro.getuId()==id)
                addUsers.remove(pro);
            System.out.println("Customer Deleted successfully");

            k++;
            break;
        }
        if(k==0)
            System.out.println(" Given ID is not exit");

    }

    @Override
    public void updateUser(int id) {
        int k=0;
        for(User pro :addUsers)
        {
            if(pro.getuId()==id){
                System.out.println("Do you want modify 1)Name 2)Address 3) Phone");
                int choice=sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.print("Enter User name=");
                        String pname = sc.next();
                        pro.setUname(pname);
                        System.out.println("User name is Update");
                        break;
                    case 2:
                        System.out.print("Enter Address=");
                        String add = sc.next();
                        pro.setuAddress(add);
                        System.out.println("User Address Update");
                        break;
                    case 3:
                        System.out.print("Enter User Phone=");
                        long ph = sc.nextLong();
                        pro.setuPhone(ph);
                        System.out.println("Phone Number Update");
                        break;
                    default:
                        System.out.println(" please Choose 1 to 3");
                  }
                        ++k;
                }}
        if(k==0)
        { System.out.println(" Given record not exit");}
    }

    }

