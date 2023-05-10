package com.pms.client.admin;


import com.pms.admin.dao.Impl.PolicyDAOImpl;
import com.pms.client.PolicyClient;


import java.util.Scanner;

public class SubCategory {
    static PolicyDAOImpl policyDAOsub=new PolicyDAOImpl();
        public static void subCategoryDetails(){
            Scanner sc=new Scanner(System.in);
            while(true)
            {
                System.out.println("======================================================  ");
                System.out.println("                1)AddSubCategory                            ");
                System.out.println("                2)ViewSubCategory                             ");
                System.out.println("                3)UpdateSubCategory                          ");
                System.out.println("                4)Delete                               ");
                System.out.println("                5)Back                                  ");
                System.out.println("========================================================");
                System.out.print("Enter the choice=");
                int choice=sc.nextInt();
                switch(choice)
                {
                    case 1:
                       policyDAOsub.addSubCategory();
                        break;
                    case 2:
                        System.out.println(policyDAOsub.viewSubCategory());
                        System.out.println("");
                        break;


                    case 3:
                        System.out.print("Enter Sub Category Id to update =");
                        int pid=sc.nextInt();
                        policyDAOsub.updateSubCategory(pid);
                        break;
                    case 4:
                        System.out.print("Enter SubCategory Id to delete =");
                        int did=sc.nextInt();
                     policyDAOsub.deleteSubCategory(did);
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






