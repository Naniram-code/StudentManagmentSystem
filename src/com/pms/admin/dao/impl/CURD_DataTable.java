package com.pms.admin.dao.impl;
import java.sql.*;
import java.util.Scanner;

public class CURD_DataTable {
    /*public static void main(String[] args) {
        // Database connection parameters
        final String url = "jdbc:mysql://localhost:3306/StudentManagmentSystem";
        final String username = "root";
        final String password = "Bex987174@";
        Connection connection = null;//(I)
        Scanner sc=new Scanner(System.in);

        try {// 1: Establish the connection//DriverManager(C)
            connection = DriverManager.getConnection(url, username, password);

            System.out.println("Connected to the database Successfully");

            // Step 2: Create a statement
            Statement statement = connection.createStatement();// Statement(I)
            //Create Table
            statement.execute("CREATE TABLE IF NOT EXISTS Student (" +
                    "sno INT PRIMARY KEY AUTO_INCREMENT," +
                    "sname VARCHAR(50) NOT NULL," +
                    "saddress VARCHAR(100) NOT NULL" +
                    ")");

            System.out.println("Table created successfully.");

            // Step 3: Perform CRUD operations

            // Create operation
            String createQuery = "INSERT INTO Student (sno,sname,saddress) VALUES (105,'John Doe','DC')";
            statement.executeUpdate(createQuery);
            System.out.println("Record created!");

            // Read operation
            String readQuery = "SELECT * FROM Student";
            ResultSet resultSet = statement.executeQuery(readQuery);
            while (resultSet.next()) {
                int sno = resultSet.getInt("sno");
                String sname = resultSet.getString("sname");
                String sadds = resultSet.getString("saddress");
                System.out.println("ID: " + sno + ", Name: " + sname + ", Address: " + sadds);
            }

            // Update operation
            String updateQuery = "UPDATE Student SET saddress = 'DC' WHERE sno = 100";
            statement.executeUpdate(updateQuery);
            System.out.println("Record updated!");

            // Delete operation
            String deleteQuery = "DELETE FROM Student WHERE sno=1";
            //String deleteQuery = "DELETE FROM Users WHERE id IN(16,17,18)";
            statement.executeUpdate(deleteQuery);
            System.out.println("Record deleted!");
            statement.close();
            connection.close();



         } catch (SQLException e) {
        e.printStackTrace();
        }}
        */}
