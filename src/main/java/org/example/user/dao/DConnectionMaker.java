package org.example.user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DConnectionMaker implements ConnectionMaker{
    public Connection makeConnection() throws ClassNotFoundException, SQLException {
        // D 사의 독자적인 방법으로 Connection을 생성하는 코드
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection c = DriverManager.getConnection(
                "jdbc:mysql://localhost/tody", "root", ""
        );
        return c;
    }
}
