package com.pms.model;

public class UserList {
    private int id;
    private String uname;
    private String address;
    private long phone;
    private String email;
    private String password;
    public static String status;

    public static int getPolicyID() {
        return policyID;
    }

    public static void setPolicyID(int policyID) {
        UserList.policyID = policyID;
    }

    public static int policyID;
  

    public String getstatus() {
        return status;
    }

    public void setstatus(String status) {
        this.status = status;
    }


    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getaddress() {
        return address;
    }

    public void setaddress(String address) {
        this.address = address;
    }

    public long getphone() {
        return phone;
    }

    public void setphone(long phone) {
        this.phone = phone;
    }

    public String getemail() {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }

    public String getpassword() {
        return password;
    }

    public void setpassword(String password) {
        password = password;
    }


    public UserList(int id, String uname, String address, long phone, String email, String password) {
        this.id = id;
        this.uname = uname;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.password = password;
    }


    @Override
    public String toString() {
        return "statusUserList{" +
                "id=" + id +
                ", PolicyId='" + policyID + '\'' +
                ", uname='" + uname + '\'' +
                ", address='" + address + '\'' +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public UserList(int id,int policyID, String uname, String address, long phone,String email,
                    String status) {
        this.id = id;
        this.policyID = policyID;
        this.uname = uname;
        this.address = address;
        this.phone = phone;
        this.email = email;

        this.status = status;
    }
}





