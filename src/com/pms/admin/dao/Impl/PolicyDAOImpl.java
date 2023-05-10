package com.pms.admin.dao.Impl;
import com.pms.admin.dao.PolicyDetailsDAO;
import com.pms.model.PolicyDetails;
import com.pms.model.UserList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class PolicyDAOImpl implements PolicyDetailsDAO {
    Scanner sc =new Scanner(System.in);
    static List<PolicyDetails> addPolicy=new LinkedList<>();
    static List<PolicyDetails> addCategory=new LinkedList<>();
    static List<PolicyDetails> addSubCategory=new LinkedList<>();
    static List<UserList> activeUser =new LinkedList<>();
    static List<UserList> cancelUser =new LinkedList<>();

    @Override
    public void addPolicy() {
            int k  = 1;
            while (k==1) {
                System.out.println("Enter  Police ID =");
                int pid=sc.nextInt();
                System.out.println(addCategory);
                System.out.println(" choose Category  above list =");
                String cname=sc.next();
                System.out.println(addSubCategory);
                System.out.println("Choose SubCategory from above list =");
                String subC=sc.next();
                System.out.println("Enter Police Name=");
                String pname=sc.next();
                System.out.println("Enter aumAssured =");
                int aa=sc.nextInt();
                System.out.println("Enter premium =");
                int pr=sc.nextInt();
                System.out.println("Enter description =");
                String des=sc.next();
                PolicyDetails policyD=new PolicyDetails(pid,cname,subC,pname,aa,pr,des);
                addPolicy.add(policyD);
                System.out.println("Policy add successfully");
                System.out.println("Do you want add more Product 1 for Yes / 2 for Now=");
                k =sc.nextInt();}

        }


    @Override
    public List<PolicyDetails> viewPolicy() {
        return addPolicy;
    }

    @Override
    public PolicyDetails viewPolicy(int pid) {
        return null;
    }

    @Override
    public void updatePolicy(int pid) {
        int k=0;
        for(PolicyDetails pro :addPolicy)
        {
            if(pro.getPolicyid()==pid){
                System.out.println("Do you want modify 1)Name 2)Address 3) Phone");
                int choice=sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.print("Enter Police Name=");
                        String pname = sc.next();
                        pro.setPolicName(pname);
                        System.out.println("Police Update");
                        break;
                    case 2:
                        System.out.print("Enter Category=");
                        String add = sc.next();
                        pro.setCatagoryname(add);
                        System.out.println("Category Update");
                        break;
                    case 3:
                        System.out.print("Enter Subcategory=");
                        String ph = sc.next();
                        pro.setSubCatagoryname(ph);
                        System.out.println("SubCategory  Update");
                        break;
                    case 4:
                        System.out.print("Enter aumAssured=");
                        int ass = sc.nextInt();
                        pro.setSumAssured(ass);
                        System.out.println("asumAssured Update");
                        break;case 5:
                        System.out.print("Enter Premium=");
                        int pr = sc.nextInt();
                        pro.setPremium(pr);
                        System.out.println("premium Update");
                        break;case 6:
                        System.out.print("Enter Description=");
                        String ss = sc.next();
                        pro.setSubCatagoryname(ss);
                        System.out.println("Description Update");
                        break;
                    default:
                        System.out.println(" please Choose 1 to 3");
                }
                ++k;
            }}
        if(k==0)
        { System.out.println(" Given record not exit");}
    }



    @Override
    public void deletePolicy(int pid) {

            int k=0;
            for (PolicyDetails pro :addPolicy)
            {
                if (pro.getPolicyid()==pid)
                    addPolicy.remove(pro);
                System.out.println("Policy Deleted successfully");

                k++;
                break;
            }
            if(k==0)
                System.out.println(" Given ID is not exit");

    }

    @Override
    public void addCategory() {
        int k  = 1;
        while (k==1) {
            System.out.println("Enter Category ID =");
            int cid=sc.nextInt();
            System.out.println("Enter Category =");
            String cname=sc.next();
            System.out.println("Enter description =");
            String ds=sc.next();
            PolicyDetails cat=new PolicyDetails(cid,cname,ds);
            addCategory.add(cat);
            System.out.println("Category add successfully");
            System.out.println("Do you want add more Category 1 for Yes / 2 for No=");
              int i =sc.nextInt();
             k=i;}
            System.out.println(addCategory);
    }


    @Override
    public List<PolicyDetails> viewCategory() {
        return addCategory;
    }

    @Override
    public void updateCategory(int ccid) {
        int k=0;
        for(PolicyDetails pro :addCategory)
        {
            if(pro.getCatagoryid()==ccid){
                System.out.println("Do you want modify 1)Name 2)Description ");
                int choice=sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.print("Enter Category name=");
                        String pname = sc.next();
                        pro.setCatagoryname(pname);
                        System.out.println("Category is Update");
                        break;
                    case 2:
                        System.out.print("Enter Description=");
                        String add = sc.next();
                        pro.setDescription(add);
                        System.out.println("Description Update");
                        break;
                    default:
                        System.out.println(" please Choose 1 to 2");
                }
                ++k;
            }}
        if(k==0)
        { System.out.println(" Given record not exit");}
    }



    @Override
    public void deleteCategory(int cid) {
        int k=0;
        for (PolicyDetails pro :addCategory)
        {
            if (pro.getCatagoryid()==cid)
                addCategory.remove(pro);
            System.out.println("Category Deleted successfully");

            k++;
            break;
        }
        if(k==0)
            System.out.println(" Given ID is not exit");

    }
    @Override
    public void addSubCategory() {
        int k  = 1;
        while (k==1) {
            System.out.println("Enter SubCategory ID =");
            int sid=sc.nextInt();
            System.out.println(addCategory);
            System.out.println("Choose Category from above list =");
            String cname=sc.next();
            System.out.println("Enter SubCategory =");
            String csname=sc.next();
            System.out.println("Enter description =");
            String ds=sc.next();
            PolicyDetails sub=new PolicyDetails(sid,cname,csname,ds);
            addSubCategory.add(sub);
            System.out.println("SubCategory add successfully");
            System.out.println("Do you want add more Category 1 for Yes / 2 for No=");
            k =sc.nextInt();}
            System.out.println(addPolicy);


    }

    @Override
    public List<PolicyDetails> viewSubCategory() {
        return addSubCategory;
    }

    @Override
    public void updateSubCategory(int sid) {
        int k=0;
        for(PolicyDetails pro :addSubCategory)
        {
            if(pro.getSubcategoryid()==sid){
                System.out.println("Do you want modify 1)Name 2)Description ");
                int choice=sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.print("Enter Category name=");
                        String pname = sc.next();
                        pro.setSubCatagoryname(pname);
                        System.out.println("Category is Update");
                        break;
                    case 2:
                        System.out.print("Enter Description=");
                        String add = sc.next();
                        pro.setDescription(add);
                        System.out.println("Description Update");
                        break;
                    default:
                        System.out.println(" please Choose 1 to 2");
                }
                ++k;
            }}
        if(k==0)
        { System.out.println(" Given record not exit");}
    }

    @Override
    public void deleteSubCategory(int sbid) {
        int k=0;
        for (PolicyDetails pro :addSubCategory)
        {
            if (pro.getCatagoryid()==sbid)
                addSubCategory.remove(pro);
            System.out.println("SubCategory Deleted successfully");

            k++;
            break;
        }
        if(k==0)
            System.out.println(" Given ID is not exit");

    }

    @Override
    public void buyPolicy(int policyId) {
            int k=0;
            for ( PolicyDetails bp : addPolicy)
            {
                if (bp.getPolicyid()==policyId){
                    System.out.println(bp);
                    System.out.println("To buy enter Buy");
                    sc.next();

                    k++;
                }}
            if(k==0)
                System.out.println("policy  not found");
    }
}



