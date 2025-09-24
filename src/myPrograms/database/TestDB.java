package myPrograms.database;


/**
 * Write a description of class TestDB here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestDB {
    private static final String DB_URL = "jdbc:sqlite:mydb.db";

    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection(DB_URL);
            System.out.println("Connection established.");
            conn.close();
            System.out.println("Connection closed.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

