package com.omega;

import java.sql.*;

public class Main {
    static final String DATABASE_URL = "jdbc:mysql://localhost:3306/omega?useUnicode=true&characterEncoding=utf8&serverTimezone=UTC";
    static final String USER = "root";
    static final String PASSWORD = "1825jvsh";

    public static void main(String[] args) throws SQLException {

                Connection connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
                Statement statement = connection.createStatement();

                statement.execute("INSERT INTO pilots (name, age, isCertified, email) VALUES ('Jonh', '34', '124fg67', 'jonh@inbox.com')");
                ResultSet resultSet = statement.executeQuery("SELECT * FROM pilots");

                while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String name = resultSet.getString("name");
                    int age = resultSet.getInt("age");
                    String isCertified = resultSet.getString("isCertified");
                    String email = resultSet.getString("email");

            System.out.println("id: " + id);
            System.out.println("Name: " + name);
            System.out.println("age: " + age);
            System.out.println("isCertified: " + isCertified);
            System.out.println("email: " + email);
            System.out.println("\n===================\n");
        }
    }
}