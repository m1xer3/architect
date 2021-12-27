package ru.danilsibgatyllin.system_pattern.orm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionConfig {
    static final String DRIVER = "com.mysql.jdbc.Driver";
    static final String DB = "jdbc:mysql://127.0.0.1:3306/test_db";
    static final String USER = "m1xer";
    static final String PASSWORD = "1qaz!QAZ";

    public static  Connection getConnectDB() throws SQLException, ClassNotFoundException {
        return createConnect();
    }

    private  static Connection createConnect() throws ClassNotFoundException, SQLException {
            Class.forName(DRIVER);
            return DriverManager.getConnection(DB,USER,PASSWORD);

    }
}
