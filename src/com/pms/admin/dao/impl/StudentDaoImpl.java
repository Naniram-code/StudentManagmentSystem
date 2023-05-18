package com.pms.admin.dao.impl;

import com.pms.admin.dao.StudentDAO;
import com.pms.model.Student;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class StudentDaoImpl implements StudentDAO {
    static Connection connection = null;
    static Statement statement = null;
    static ResultSet resultSet = null;
    static PreparedStatement preparedStatement = null;

    Scanner sc = new Scanner(System.in);
    static List<Student> studentList = new LinkedList<>();
    int row = 0;

    @Override
    public int addStudent(Student student) {
        //int row = 0;
        try {
            connection = ConnectionManager.getConnection();//1
            final String sql = "INSERT INTO Student (sno,sname,saddress) VALUES (?,?,?)";
            preparedStatement = connection.prepareStatement(sql);//2
            preparedStatement.setInt(1, student.getSno());
            preparedStatement.setString(2, student.getSname());
            preparedStatement.setString(3, student.getSaddress());
            row = preparedStatement.executeUpdate();//3
            if (row > 0)
                System.out.println("Student Added Successfully");
            else
                System.out.println("Student Fail to Add ");

            ConnectionManager.closeconnection(connection, preparedStatement);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return row;
    }

    @Override
    public List<Student> viewAllUserInfo() throws SQLException {
        try {
            connection = ConnectionManager.getConnection();//1

            final String readQuery = "SELECT * FROM Student";
            preparedStatement = connection.prepareStatement(readQuery);//2
            resultSet = preparedStatement.executeQuery();//3
            while (resultSet.next()) {
                int sno = resultSet.getInt(1);
                String sname = resultSet.getString(2);
                String sadds = resultSet.getString(3);
                Student stu = new Student(sno, sname, sadds);
                studentList.add(stu);
            }
            ConnectionManager.closeconnection(resultSet, preparedStatement, connection);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return studentList;
    }

    @Override
    public Student viewStudent(int no) throws SQLException {
        String student = null;
        try {
            connection = ConnectionManager.getConnection();//1

            final String readQuery = "select*from Student where sno=?";
            preparedStatement = connection.prepareStatement(readQuery);//2
            preparedStatement.setInt(1, no);//set value to sno
            resultSet = preparedStatement.executeQuery();//3
            if (resultSet.next()) {
                int sno = resultSet.getInt(1);
                String sname = resultSet.getString(2);
                String sadds = resultSet.getString(3);
                System.out.println("ID: " + sno + ", Name: " + sname + ", Address: " +
                        sadds);
                System.out.println("Student find Successfully");}
            else
                System.out.println("Student not EXIT ");
            ConnectionManager.closeconnection(resultSet, preparedStatement, connection);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            ConnectionManager.closeconnection(resultSet, preparedStatement, connection);
        }

        return null;
    }


    @Override
    public int updateStudent(int sn) throws SQLException {

        try {
            connection = ConnectionManager.getConnection();
            final String updateQuery = "UPDATE Student SET sname = ? WHERE sno =?";
            preparedStatement = connection.prepareStatement(updateQuery);
            System.out.println("Enter New name for update=");
            String sna = sc.next();

            preparedStatement.setString(1, sna);
            preparedStatement.setInt(2, sn);
            row = preparedStatement.executeUpdate();//row update count
            if (row > 0)
                System.out.println("Student update Successfully");
            else
                System.out.println("Student Fail to Add ");

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            ConnectionManager.closeconnection(connection, preparedStatement);
        }

        return row;
    }


    @Override
    public int deleteStudent(int sno) throws SQLException {

        try {
            connection = ConnectionManager.getConnection();
            final String deleteQuery = "DELETE FROM Student WHERE sno=?";
            preparedStatement = connection.prepareStatement(deleteQuery);
            preparedStatement.setInt(1, sno);
            row = preparedStatement.executeUpdate();
            if (row > 0)
                System.out.println("Student Delete Successfully");
            else
                System.out.println("Student Fail to Delete ");

        } catch (SQLException e) {
            e.printStackTrace();
        }
         finally {
            ConnectionManager.closeconnection(connection, preparedStatement);
        }
        return 0;
    }

}