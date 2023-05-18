package com.pms.admin.dao.impl;

import com.pms.utility.Properties_Reader;

import java.sql.*;

public class ConnectionManager {

    public static Connection getConnection() throws SQLException, SQLException {
         return DriverManager.getConnection(
                Properties_Reader.readKey("url"),
                Properties_Reader.readKey("username"),
                Properties_Reader.readKey("password"));

    }

    public static void closeconnection(Connection con, PreparedStatement ps) throws SQLException {
        if (ps != null)
            ps.close();
        if (con != null)
            con.close();
    }

    public static void closeconnection(ResultSet rs, PreparedStatement ps, Connection con) throws SQLException {
        if (rs != null)
            rs.close();
        if (ps != null)
            ps.close();
        if (con != null)
            con.close();

    }

}


