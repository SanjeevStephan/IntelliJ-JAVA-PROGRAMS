package myPrograms.database;


/**
 * Write a description of class SQLiteCRUDExample here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */


import java.sql.*;
import java.util.Scanner;

public class SQLiteCRUDExample {
    private static final String DB_URL = "jdbc:sqlite:mydb.db";
    private static final String CREATE_TABLE_SQL = "CREATE TABLE IF NOT EXISTS employees (id INTEGER PRIMARY KEY, first_name TEXT, last_name TEXT, age INTEGER)";
    private static final String INSERT_SQL = "INSERT INTO employees (first_name, last_name, age) VALUES (?, ?, ?)";
    private static final String SELECT_SQL = "SELECT * FROM employees";
    private static final String UPDATE_SQL = "UPDATE employees SET age = ? WHERE first_name = ? AND last_name = ?";
    private static final String DELETE_SQL = "DELETE FROM employees WHERE first_name = ? AND last_name = ?";

    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        Connection connection = DriverManager.getConnection(DB_URL);

        // Create table if it doesn't exist
        createTable(connection);

        while (true) {
            System.out.println("SQLite CRUD Operations");
            System.out.println("1. Insert");
            System.out.println("2. Select");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (choice) {
                case 1:
                    insertData(connection, scanner);
                    break;
                case 2:
                    selectData(connection);
                    break;
                case 3:
                    updateData(connection, scanner);
                    break;
                case 4:
                    deleteData(connection, scanner);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    connection.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        }
    }

    private static void createTable(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        statement.execute(CREATE_TABLE_SQL);
        statement.close();
    }

    private static void insertData(Connection connection, Scanner scanner) throws SQLException {
        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        PreparedStatement statement = connection.prepareStatement(INSERT_SQL);
        statement.setString(1, firstName);
        statement.setString(2, lastName);
        statement.setInt(3, age);
        statement.executeUpdate();
        statement.close();
        System.out.println("Data inserted successfully.");
    }

    private static void selectData(Connection connection) throws SQLException {
        PreparedStatement statement = connection.prepareStatement(SELECT_SQL);
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String firstName = resultSet.getString("first_name");
            String lastName = resultSet.getString("last_name");
            int age = resultSet.getInt("age");
            System.out.println("ID: " + id + ", Name: " + firstName + " " + lastName + ", Age: " + age);
        }
        resultSet.close();
        statement.close();
    }

    private static void updateData(Connection connection, Scanner scanner) throws SQLException {
        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter new age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        PreparedStatement statement = connection.prepareStatement(UPDATE_SQL);
        statement.setInt(1, age);
        statement.setString(2, firstName);
        statement.setString(3, lastName);
        statement.executeUpdate();
        statement.close();
        System.out.println("Data updated successfully.");
    }

    private static void deleteData(Connection connection, Scanner scanner) throws SQLException {
        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();

        PreparedStatement statement = connection.prepareStatement(DELETE_SQL);
        statement.setString(1, firstName);
        statement.setString(2, lastName);
        statement.executeUpdate();
        statement.close();
        System.out.println("Data deleted successfully.");
    }
}
