package com.pms.client;
import ArraylistConcept.com.pms.admin.dao.Impl.CustomerDAOImpl;
import ArraylistConcept.com.pms.admin.dao.Impl.ProductDAOImpl;

import java.util.Scanner;

public class AdminDetails {

             static ProductDAOImpl productDAO=new ProductDAOImpl();
             static CustomerDAOImpl customerDAO=new CustomerDAOImpl();
             static String Email="admin";
             static String password="abc@1234";

             public static void AuthenticationAdmin(String Aemail,String Apassword)
             {

                 if(Aemail.equals(Email)&&(Apassword.equals(password))){
                     ProductDetails();}
                  else if (Aemail.equals(Email)||(Apassword.equals(password))) {
                      System.out.println("You Enter wrong Admin email or password");
                  }
                  else
                     System.out.println("You Enter invalid  admin email and password");
             }
            public static void ProductDetails(){
            Scanner sc=new Scanner(System.in);
            while(true)
            {
                System.out.println("======================================================  ");
                System.out.println("                1)AddProduct                            ");
                System.out.println("                2)View AllProduct                      ");
                System.out.println("                3)View Product                          ");
                System.out.println("                4)Update Product                        ");
                System.out.println("                5)Delete Product                        ");
                System.out.println("                6)AddUser                               ");
                System.out.println("                7)View AllUser                          ");
                System.out.println("                8)View User                              ");
                System.out.println("                9)Update User                            ");
                System.out.println("                10)Delete User                           ");
                System.out.println("                11)Back                                  ");
                System.out.println("========================================================");
                System.out.print("Enter the choice=");
                int choice=sc.nextInt();
                switch(choice)
                {
                    case 1:
                        productDAO.addProduct();
                        break;

                    case 2:

                        System.out.println(productDAO.viewProducts());
                        System.out.println("");
                        break;

                    case 3:
                        System.out.print("Enter Product ID to View product =");
                        int id=sc.nextInt();
                        System.out.println(productDAO.viewProduct(id));
                        break;

                    case 4:
                        System.out.print("Enter Product ID to update =");
                        int uid=sc.nextInt();
                        productDAO.updateProduct(uid);

                        break;
                    case 5:
                        System.out.print("Enter Product ID to Delete=");
                        int did=sc.nextInt();
                        productDAO.deleteProduct(did);
                      break;
                    case 6:
                        customerDAO.addCustomer();
                        break;
                    case 7:
                        System.out.println(customerDAO.viewAllUserInfo());
                        System.out.println("");
                        break;

                    case 8:
                        System.out.print("Enter ID to View User =");
                        int sid=sc.nextInt();
                        System.out.println(customerDAO.viewUserInfo(sid));
                        break;
                    case 9:
                        System.out.print("Enter User ID to update =");
                        int suid=sc.nextInt();
                        customerDAO.updateUser(suid);

                        break;
                    case 10:
                        System.out.print("Enter User ID to Delete=");
                        int sdid=sc.nextInt();
                        customerDAO.deleteUser(sdid);
                        break;
                    case 11:
                        productClient.main(null);
                        break;
                    default:
                        System.out.println("Choose 1 to 11 Between");

                }
            }
        }

    }
