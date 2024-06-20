package com.automation.classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    public Connection db() throws SQLException {
        String url="jdbc:mysql://localhost:3306/ems";
        String username="root";
        String password="root";

        return DriverManager.getConnection(url, username, password);

    }
}
