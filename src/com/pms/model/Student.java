package com.pms.model;

public class Student {
     private int sno;
    private String sname;
    private String saddress;
    public Student() {
    }
    public Student(int sno, String sname, String saddress) {
        this.sno = sno;
        this.sname = sname;
        this.saddress = saddress;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSaddress() {
        return saddress;
    }

    public void setSaddress(String saddress) {
        this.saddress = saddress;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sno=" + sno +
                ", sname='" + sname + '\'' +
                ", saddress='" + saddress + '\'' +
                '}';
    }
}
