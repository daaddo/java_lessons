package it.cascella.JBBC;

import java.sql.*;

public class DbManager {
    private static final String URL = "jdbc:mysql://localhost:3306/sakila";
    private static final String USER = "Java";
    private static final String PASSWORD = "Davide";
    private static Connection conn = null;
    public static Connection connect() {
        System.out.print("connecting... ");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("OK");
        } catch ( SQLException e) {
            System.out.println("FAILED");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return conn;
    }
    public static void disconnect() {
        System.out.print("Disconnecting... ");
        if (conn != null) {
            try {
                conn.close();
                System.out.println("OK");
            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println("FAILED");
            } finally {
                conn = null;
            }
        }
    }
    public static void printFilms(int limit){
        String sql = "select film_id , title, language_id from film limit "+limit;
        try (Statement statement = conn.createStatement()) {
            ResultSet resultSet = statement.executeQuery(sql);
            if (resultSet!= null){
                while(resultSet.next()){
                    System.out.println("id = "+resultSet.getInt("film_id"));
                    System.out.println("title ="+resultSet.getString("title"));
                    System.out.println("language_id ="+resultSet.getInt("language_id"));
                    System.out.println("------------------------------------");

                }
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }

    }
}
