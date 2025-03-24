package org.example.user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// 관심을 분리해서 이 클래스는 사용 안함

public class SimpleConnectionMaker {
    public Connection makeNewConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection c = DriverManager.getConnection(
                "jdbc:mysql://localhost/tody", "root", ""
        );
        return c;
    }
}
