package com.pms.client.admin;


import com.pms.admin.dao.Impl.PolicyDAOImpl;
import com.pms.client.PolicyClient;


import java.util.Scanner;
public class Category {

        static PolicyDAOImpl policyDAO=new PolicyDAOImpl();


        public static void categoryDetails(){
            Scanner sc=new Scanner(System.in);
            while(true)
            {
                System.out.println("======================================================   ");
                System.out.println("                1)AddCategory                            ");
                System.out.println("                2)ViewCategory                           ");
                System.out.println("                3)UpdateCategory                         ");
                System.out.println("                4)Delete                                 ");
                System.out.println("                5)Back                                  ");
                System.out.println("======================================================== ");
                System.out.print("Enter the choice=");
                int choice=sc.nextInt();
                switch(choice)
                {

                        case 1:
                        policyDAO.addCategory();
                        break;
                        case 2:
                        System.out.println(policyDAO.viewCategory());
                        break;

                        case 3:
                        System.out.print("Enter Policy Id to update =");
                        int pid=sc.nextInt();
                       policyDAO.updateCategory(pid);
                        break;
                        case 4:
                        System.out.print("Enter Policy Id to delete =");
                        int did=sc.nextInt();
                        policyDAO.deleteCategory(did);
                        break;
                        case 5:
                        PolicyClient.main(null);
                        break;
                    default:
                        System.out.println("Choose 1 to 11 Between");

                }
            }
        }

    }




