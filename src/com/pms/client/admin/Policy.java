package com.pms.client.admin;

import com.pms.admin.dao.Impl.PolicyDAOImpl;
import com.pms.client.PolicyClient;

import java.util.Scanner;

public class Policy {


    static PolicyDAOImpl policyDAOp=new PolicyDAOImpl();
        public static void policyDetails(){
            Scanner sc=new Scanner(System.in);
            while(true)
            {
                System.out.println("====================================================== ");
                System.out.println("                1)AddPolicy                            ");
                System.out.println("                2)ViewPolicy                           ");
                System.out.println("                3)UpdatePolicy                         ");
                System.out.println("                4)Delete                               ");
                System.out.println("                5)Back                                ");
                System.out.println("=======================================================");
                System.out.print("Enter the choice=");
                int choice=sc.nextInt();
                switch(choice)
                {

                    case 1:
                        policyDAOp.addPolicy();
                        break;
                    case 2:
                        System.out.println(policyDAOp.viewPolicy());
                        System.out.println("");
                        break;

                    case 3:
                        System.out.print("Enter police ID to update =");
                        int sid=sc.nextInt();
                        policyDAOp.updatePolicy(sid);
                        break;
                    case 4:

                        System.out.print("Enter SubCategory Id to delete =");
                        int did=sc.nextInt();
                        policyDAOp.deletePolicy(did);
                        break;
                    case 5:
                        PolicyClient.main(null);
                        break;
                    default:
                        System.out.println("Choose 1 to 11 Between");

                }
            }
        }}








