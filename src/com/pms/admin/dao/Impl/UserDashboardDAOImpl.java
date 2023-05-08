package com.pms.admin.dao.Impl;


import com.pms.model.Product;
import com.pms.model.User;


public class UserDashboardDAOImpl extends CustomerDAOImpl {


    @Override
    public void addCustomer() {
        System.out.print("Enter User ID =");
        int uid = sc.nextInt();
        System.out.print("Enter User Name=");
        String uname = sc.next();
        System.out.print("Enter User Address=");
        String add = sc.next();
        System.out.print("Enter User Phone=");
        long phone = sc.nextLong();
        System.out.print("Enter UserName=");
        String Username = sc.next();
        System.out.print("Enter Password =");
        String psw = sc.next();
        User user = new User(uid, uname, add, phone, Username, psw);
        CustomerDAOImpl.addUsers.add(user);//add user data to addUser linked-list
        System.out.println(" Registration successful");
       }

       public static boolean AuthenticationUser(String username,String password) {
           int k = 0;
           for (User pro : addUsers) {

               if ((pro.getUserName().equals(username)) && (pro.getPassword().equals(password))) {
                   System.out.println("user verified ");
                   return true;

                   }
               else if
                    ((pro.getUserName().equals(username)) || (pro.getPassword().equals(password)))
                    System.out.println("You Enter wrong User name  or password");
                    k++;
                    return false;

                    }
                   if (k == 0)
                           System.out.println("User not found");
                   return false;

              }
              public static void buyProduct(int pidd,int qty)
                {
                        int k=0;
                         for ( Product bp : ProductDAOImpl.addProducts)
                        {
                            if (bp.getPid()==pidd){
                                  if((bp.getQat()==0)&&(bp.getQat()<qty))
                                   {
                                   System.out.println("Stock is not Enough");
                                    }
                             else {
                                   int totalCost=bp.getPrice()*qty;
                                   System.out.println("Total Bill="+totalCost);
                                   System.out.println("To Pay your bill enter PAY");
                                    sc.next();
                                   System.out.println("thanks For shopping");
                                   int stock= bp.getQat()-qty;
                                   bp.setQat(stock);
                               }
                                k++;
                    }}
                    if(k==0)
                        System.out.println("Product not found");

                    }

    }

