package com.pms.model;

public class User {
    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getuAddress() {
        return uAddress;
    }

    public void setuAddress(String uAddress) {
        this.uAddress = uAddress;
    }

    public long getuPhone() {
        return uPhone;
    }

    public void setuPhone(long uPhone) {
        this.uPhone = uPhone;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    private    int uId;
    private   String uname;
    private   String uAddress;

    public User(int uId, String uname, String uAddress, long uPhone, String userName, String password) {
        this.uId = uId;
        this.uname = uname;
        this.uAddress = uAddress;
        this.uPhone = uPhone;
        this.userName = userName;
        Password = password;
    }

    private long uPhone;
    private  String userName;
    private  String Password;

    @Override
    public String toString() {
        return "User{" +
                "uId=" + uId +
                ", uname='" + uname + '\'' +
                ", uAddress='" + uAddress + '\'' +
                ", uPhone=" + uPhone +
                ", userName='" + userName + '\'' +
                ", Password='" + Password + '\'' +
                '}';
    }
}
