package com.pms.client;

import com.pms.client.Customer.Customer;
import com.pms.client.Customer.Registration;
import com.pms.client.admin.Admin;

import java.util.Scanner;

public class PolicyClient {
    public static void main(String[] args) {


            Scanner sc=new Scanner(System.in);
            while(true) {
                System.out.println("======================================================  ");
                System.out.println("                1)Admin                                 ");
                System.out.println("                2)Customer                              ");
                System.out.println("                3)Registration                          ");
                System.out.println("                4)exit                                  ");
                System.out.println("========================================================");
                System.out.print("Enter the choice=");

                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.print("Enter Admin email=");
                        String mail=sc.next();
                        System.out.print("Enter Admin password=");
                        String psw=sc.next();
                        Admin.AuthenticationAdmin(mail,psw);
                        break;
                    case 2:
                        Customer.CustomerDashBoard();
                        break;
                    case 3:
                        Registration.CustomerClientmenu();
                        break;
                    case 4:
                        System.out.println("*******************Thanks For Using Apps****************");
                        System.exit(0);

                    default:
                        System.out.println("Enter 1 to 4 ");

                }}
        }}




