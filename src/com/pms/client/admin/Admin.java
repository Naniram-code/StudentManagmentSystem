package com.pms.client.admin;

import com.pms.admin.dao.Impl.CustomerDAOImpl;
import com.pms.client.PolicyClient;

import java.util.Scanner;

public class Admin {
    static CustomerDAOImpl pCustomerDAO=new CustomerDAOImpl();
        static String Email="admin";
        static String password="abc@1234";

        public static void AuthenticationAdmin(String Aemail,String Apassword)
        {

            if(Aemail.equals(Email)&&(Apassword.equals(password))){
                PolicyDetails();}
            else if (Aemail.equals(Email)||(Apassword.equals(password))) {
                System.out.println("You Enter wrong Admin email or password");
            }
            else
                System.out.println("You Enter invalid  admin email and password");
        }
        public static void PolicyDetails(){
            Scanner sc=new Scanner(System.in);
            while(true)
            {
                System.out.println("======================================================  ");
                System.out.println("                1)UserList                              ");
                System.out.println("                2)Category                              ");
                System.out.println("                3)SubCategory                           ");
                System.out.println("                4)Policy                                ");
                System.out.println("                5)Buyer's Policy Request                        ");
                System.out.println("                6)Back                                  ");
                System.out.println("========================================================");
                System.out.print("Enter the choice=");
                int choice=sc.nextInt();
                switch(choice)
                {
                    case 1:
                        System.out.println(pCustomerDAO.viewAllUserInfo());
                        break;

                    case 2:

                        Category.categoryDetails();

                        break;

                    case 3:
                      SubCategory.subCategoryDetails();

                        break;

                    case 4:
                        Policy.policyDetails();

                        break;
                    case 5:
                       // System.out.print("Enter Product ID to Delete=");
                        //int did=sc.nextInt();
                       // productDAO.deleteProduct(did);
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


