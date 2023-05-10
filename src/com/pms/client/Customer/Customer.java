package com.pms.client.Customer;


import com.pms.admin.dao.Impl.CustomerDAOImpl;
import com.pms.admin.dao.Impl.PolicyDAOImpl;
import com.pms.client.PolicyClient;
import com.pms.model.UserList;

import java.util.Scanner;

public class Customer {
    static PolicyDAOImpl policyDAOc=new PolicyDAOImpl();
    static  CustomerDAOImpl pCustomerDAO=new CustomerDAOImpl();

    public static void CustomerDashBoard(){
            Scanner sc=new Scanner(System.in);
            while(true)
            {
                System.out.println("====================================================");
                System.out.println("                1)View Category                     ");
                System.out.println("                2)View SubCategory                  ");
                System.out.println("                3)view Policy                       ");
                System.out.println("                4)Buy Policy                       ");
                System.out.println("                5)Policy Hold                       ");
                System.out.println("                6)Back                              ");
                System.out.println("=====================================================");
                System.out.print("Enter the choice=");
                int choice=sc.nextInt();
                switch(choice)
                {
                    case 1:
                        policyDAOc.viewCategory();
                         System.out.println(policyDAOc.viewCategory());
                         System.out.println("");
                        break;

                    case 2:
                        System.out.println(policyDAOc.viewSubCategory());
                        break;

                    case 3:
                        System.out.println(policyDAOc.viewPolicy());
                        break;

                    case 4:

                        System.out.println("Enter user email");
                        String email=sc.next();
                        System.out.println("Enter user password");
                        String psw=sc.next();
                        if(pCustomerDAO.AuthenticationUserandPassword(email,psw)!=false)
                        {
                            System.out.println("Enter Policy Id =");
                             int id=sc.nextInt();
                            policyDAOc.buyPolicy(id);
                            pCustomerDAO.policyHolder(email,id);

                             }
                        else
                            System.out.println("Register First");
                        break;
                        case 5:
                        pCustomerDAO.policyHolderDisplay();// call policy holder list
                        break;
                        case 6:
                        PolicyClient.main(null);
                        break;
                        default:
                        System.out.println("Choose 1 to 6 Between");

                }
            }
        }

    }


