package com.pms.client;

import com.pms.admin.dao.Impl.UserDAOImpl;

import java.util.Scanner;

import static com.pms.client.Customer.customerDetails;

public class CustomerClient {

        public static void CustomerClientmenu() {

            UserDAOImpl userDAO=new UserDAOImpl();
            Scanner sc=new Scanner(System.in);
            while(true) {
                System.out.println("======================================================  ");
                System.out.println("                1)Register                              ");
                System.out.println("                2)VerificationUserNameAndPassword       ");
                System.out.println("                3)forgotPassword                                  ");
                System.out.println("                4)Exit                                  ");
                System.out.println("========================================================");
                System.out.print("Enter the choice=");

                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        customerDetails.addCustomer();
                        break;
                    case 2:
                        System.out.print("Enter UserName=");
                        String us=sc.next();
                        System.out.print("Enter User password=");
                        String psw=sc.next();
                        if(userDAO.AuthenticationUserandPassword(us,psw)!=false)
                            System.out.println("user verified ");
                            //System.out.println(userDAO.AuthenticationUserandPassword(us,psw));
                            break;
                    case 3:

                            System.out.println("Enter  UserName for password recovery=");
                            String un=sc.next();
                            if(userDAO.getPassword(un)!=null)

                                System.out.println("Your Password="+userDAO.getPassword(un));
                            break;

                        case 4:
                            productClient.main(null);
                            break;

                    default:
                        System.out.println("Enter 1 to 4 ");

                }}
        }}




