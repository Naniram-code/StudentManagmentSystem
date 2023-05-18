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
    public int addStudent(Student student) throws SQLException {

        try {
            connection = ConnectionManager.getConnection();//1
            final String sql = "INSERT INTO Student (sno,sname,saddress) VALUES (?,?,?)";
            preparedStatement = connection.prepareStatement(sql);//2
            preparedStatement.setInt(1, student.getSno());
            preparedStatement.setString(2, student.getSname());
            preparedStatement.setString(3, student.getSaddress());
            row = preparedStatement.executeUpdate();//3

            if (row > 0) {
                throw new ExceptionSMS("Student Added Successfully");
            } else {
                throw new ExceptionSMS("Student Failed to Add");
            }
        } catch (ExceptionSMS e) {
            System.out.println(e.getMessage());
        } finally {
            ConnectionManager.closeconnection(connection, preparedStatement);
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
                row++;
            }
            if (row != 0) {
                throw new ExceptionSMS("View All Student Successfully");
            } else {
                throw new ExceptionSMS("Student  are not exit");
            }
        } catch (ExceptionSMS e) {
            System.out.println(e.getMessage());

        } finally {
            ConnectionManager.closeconnection(resultSet, preparedStatement, connection);
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
                throw new ExceptionSMS("Student View Successfully");
            } else {
                throw new ExceptionSMS("Student not exit");
            }
        } catch (ExceptionSMS e) {
            System.out.println(e.getMessage());
        } finally {
            ConnectionManager.closeconnection(resultSet, preparedStatement, connection);
        }

        return null;
    }


    @Override
    public int updateStudent(int sn) throws SQLException {

        try {
            connection = ConnectionManager.getConnection();//1
            final String updateQuerysname = "UPDATE Student SET sname = ? WHERE sno =?";
            final String updateQuerysaddress = "UPDATE Student SET   saddress = ? WHERE sno =?";
            System.out.println("Enter 1 for  for update sname 2 for address=");
            int ch = sc.nextInt();
            if (ch == 1) {
                preparedStatement = connection.prepareStatement(updateQuerysname);//2
                System.out.println("Enter New Student name for update=");
                String sna = sc.next();
                preparedStatement.setString(1, sna);
                preparedStatement.setInt(2, sn);
            } else {
                preparedStatement = connection.prepareStatement(updateQuerysaddress);//2
                System.out.println("Enter New Student Address for update=");
                String address = sc.next();
                preparedStatement.setString(1, address);
                preparedStatement.setInt(2, sn);
            }

            row = preparedStatement.executeUpdate();//row update count//3
            if (row > 0) {
                throw new ExceptionSMS("Student info update Successfully");
            } else {
                throw new ExceptionSMS("Student info Failed to update");
            }
        } catch (ExceptionSMS e) {
            System.out.println(e.getMessage());
        } finally {
            ConnectionManager.closeconnection(connection, preparedStatement);
        }

        return row;
    }


    @Override
    public int deleteStudent(int sno) throws SQLException {
        try {
            connection = ConnectionManager.getConnection();//1
            final String deleteQuery = "DELETE FROM Student WHERE sno=?";
            preparedStatement = connection.prepareStatement(deleteQuery);//2
            preparedStatement.setInt(1, sno);
            row = preparedStatement.executeUpdate();//3
            if (row > 0) {
                throw new ExceptionSMS("Student Delete Successfully");
            } else {
                throw new ExceptionSMS("Student Failed to Delete");
            }
        } catch (ExceptionSMS e) {
            System.out.println(e.getMessage());
        } finally {
            ConnectionManager.closeconnection(connection, preparedStatement);
        }
        return 0;
    }

}

