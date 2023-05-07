package com.pms.model;

public class Product {
    @Override
    public String toString() {
        return "Product{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", qat=" + qat +
                ", price=" + price +
                '}';
    }

    private int pid;
            private String pname;
            private int qat;
            private int price;

        public Product() {

        }

        public int getPid() {
                return pid;
            }
            public void setPid(int pid) {
                this.pid = pid;
            }

            public String getPname() {
                return pname;
            }

            public void setPname(String pname) {
                this.pname = pname;
            }

            public int getQat() {
                return qat;
            }

            public void setQat(int qat) {
                this.qat = qat;
            }

            public int getPrice() {
                return price;
            }

            public void setPrice(int price) {
                this.price = price;
            }


    public Product(int pid, String pname, int qat, int price) {
                this.pid = pid;
                this.pname = pname;
               this.qat = qat;
               this.price = price;
            }
        }

