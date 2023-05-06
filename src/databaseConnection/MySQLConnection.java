/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package databaseConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Nikola
 */
public class MySQLConnection {
     private static MySQLConnection instance;
     public MySQLConnection() {}
      public static MySQLConnection getInstance() {
        if (instance == null) {
            instance = new MySQLConnection();
        }
        return instance;
    }
       public Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mybaseapp", "root", "root");
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC driver not found.");
        } catch (SQLException e) {
            System.out.println("Error connecting to MySQL server.");
        }
        return conn;
    }
}
    


