package com.pms.admin.dao;

import com.pms.model.Student;

import java.sql.SQLException;
import java.util.List;

public interface StudentDAO {
    public int addStudent(Student sb);

    public List<Student> viewAllUserInfo() throws SQLException;
    Student viewStudent(int sno) throws SQLException;
    int updateStudent(int sn) throws SQLException;
    int deleteStudent(int sno) throws SQLException;

}
