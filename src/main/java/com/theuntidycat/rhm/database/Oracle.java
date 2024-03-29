package com.theuntidycat.rhm.database;

import java.sql.*;

import io.github.cdimascio.dotenv.Dotenv;

public class Oracle {
    public Connection getConnection() {
        try {
            Connection conn = null;
            Dotenv dotenv = Dotenv.load();
            String DB_URL = dotenv.get("DB_URL");
            String DB_USERNAME = dotenv.get("DB_USERNAME");
            String DB_PASSWORD = dotenv.get("DB_PASSWORD");
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            return conn;
        } catch (Exception e) {
            System.out.println("Error at Oracle/getConn");
            e.printStackTrace();
            return null;
        }
        
    }
}
