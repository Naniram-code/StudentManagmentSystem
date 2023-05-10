package com.pms.client.admin;
import com.pms.client.PolicyClient;

import java.util.Scanner;

public class BuyerPolicyRequest {

    public static void ProductDetails(){
            Scanner sc=new Scanner(System.in);
            while(true)
            {
                System.out.println("======================================================  ");
                System.out.println("                1)View                                  ");
                System.out.println("                2)Activate                               ");
                System.out.println("                4)Cancle                                 ");
                System.out.println("                5)Back                                  ");
                System.out.println("======================================================== ");
                System.out.print("Enter the choice=");
                int choice=sc.nextInt();
                switch(choice)
                {

                    case 6:
                        //customerDAO.addCustomer();
                        break;
                    case 7:
                        //System.out.println(customerDAO.viewAllUserInfo());
                        System.out.println("");
                        break;

                    case 8:
                        System.out.print("Enter ID to View User =");
                        int sid=sc.nextInt();
                        //System.out.println(customerDAO.viewUserInfo(sid));
                        break;
                    case 9:
                        System.out.print("Enter User ID to update =");
                        int suid=sc.nextInt();
                        //customerDAO.updateUser(suid);

                        break;
                    case 10:
                        System.out.print("Enter User ID to Delete=");
                        int sdid=sc.nextInt();
                        //customerDAO.deleteUser(sdid);
                        break;
                    case 11:
                        PolicyClient.main(null);
                        break;
                    default:
                        System.out.println("Choose 1 to 11 Between");

                }
            }
        }

    }








