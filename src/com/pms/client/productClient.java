package com.pms.client;

import java.util.Scanner;

public class productClient {


        public static void main(String[] args) {


            Scanner sc=new Scanner(System.in);
            while(true) {
                System.out.println("======================================================  ");
                System.out.println("                1)Admin                                 ");
                System.out.println("                2)Customer                              ");
                System.out.println("                3)CustomerClient                        ");
                System.out.println("                4)Back                                  ");
                System.out.println("========================================================");
                System.out.print("Enter the choice=");

                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.print("Enter Admin email=");
                        String mail=sc.next();
                        System.out.print("Enter Admin password=");
                        String psw=sc.next();
                        AdminDetails.AuthenticationAdmin(mail,psw);
                        break;
                    case 2:
                        Customer.CustomerDashBoard();
                    case 3:
                        CustomerClient.CustomerClientmenu();
                    case 4:
                        System.out.println("*******************Thanks For Using Apps****************");
                        System.exit(0);

                    default:
                        System.out.println("Enter 1 to 2 ");

                }}
        }}


