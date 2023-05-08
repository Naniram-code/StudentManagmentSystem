package com.pms.client;

import com.pms.admin.dao.Impl.ProductDAOImpl;
import com.pms.admin.dao.Impl.UserDashboardDAOImpl;


import java.util.Scanner;

public class Customer {

    static UserDashboardDAOImpl customerDetails=new UserDashboardDAOImpl();
    static  ProductDAOImpl cProductDetails=new ProductDAOImpl();
    public static void CustomerDashBoard(){
            Scanner sc=new Scanner(System.in);
            while(true)
            {
                System.out.println("====================================================== ");
                System.out.println("                1)View AllProduct                      ");
                System.out.println("                2)View Product                         ");
                System.out.println("                3)Buy Product                          ");
                System.out.println("                4)Registration                         ");
                System.out.println("                5)View Customer profile                ");
                System.out.println("                6)Update Customer                       ");
                System.out.println("                7)Delete Customer                       ");
                System.out.println("                8)PayBill                               ");
                System.out.println("                9)Back                                 ");
                System.out.println("=======================================================");
                System.out.print("Enter the choice=");
                int choice=sc.nextInt();
                switch(choice)
                {
                    case 1:
                        cProductDetails.viewProducts();
                        System.out.println(cProductDetails.viewProducts());
                        System.out.println("");
                        break;

                    case 2:
                        System.out.print("Enter product ID to view product=");
                        int id=sc.nextInt();
                        cProductDetails.viewProduct(id);
                        System.out.println(cProductDetails.viewProduct(id));
                        break;

                    case 3:
                        System.out.print("Enter Username=");
                        String uun=sc.next();
                        System.out.print("Enter password=");
                        String uupass=sc.next();
                        if(UserDashboardDAOImpl.AuthenticationUser(uun,uupass)) {
                            System.out.print("Enter product Id=");
                            int pidd=sc.nextInt();
                            System.out.print("Enter Quantity =");
                            int qttt=sc.nextInt();
                            UserDashboardDAOImpl.buyProduct(pidd,qttt);
                        }
                       else
                            System.out.println("Please Register Account to buy");

                        break;

                    case 4:
                        customerDetails.addCustomer();
                        break;
                    case 5:
                        System.out.print("Enter your ID=");
                        int sid= sc.nextInt();
                        System.out.println(customerDetails.viewUserInfo(sid));
                        break;
                    case 6:
                        System.out.print("Enter User ID to update =");
                        int suid=sc.nextInt();
                        System.out.print("Enter Username=");
                        String uunn=sc.next();
                        System.out.print("Enter password=");
                        String uupasss=sc.next();
                        if(UserDashboardDAOImpl.AuthenticationUser(uunn,uupasss))
                        customerDetails.updateUser(suid);
                        else
                            System.out.println("You can't update");
                        break;
                    case 7:
                        System.out.print("Enter User ID to Delete=");
                        int sdid=sc.nextInt();
                        System.out.print("Enter Username=");
                        String uunnn=sc.next();
                        System.out.print("Enter password=");
                        String uupassss=sc.next();
                        if(UserDashboardDAOImpl.AuthenticationUser(uunnn,uupassss))
                        customerDetails.deleteUser(sdid);
                        else
                            System.out.println("Sorry You don't have permission ");
                        break;
                    case 8:
                        UserDashboardDAOImpl.PayBill();
                        break;
                    case 9:
                        productClient.main(null);
                        break;
                    default:
                        System.out.println("Choose 1 to 9 Between");

                }
            }
        }

    }


