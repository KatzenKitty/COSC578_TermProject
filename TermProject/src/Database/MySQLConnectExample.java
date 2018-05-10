/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

/**
 *
 * @author Gundaram
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class MySQLConnectExample {
    Connection conn1 = null;
    public MySQLConnectExample() {
        
    }
    
    public Connection getDBConnection() {
        try {
            
            String url = "jdbc:mysql://triton.towson.edu:3360/eleo1db";
            String user = "eleo1";
            String password = "Cosc*ry68";
            
            conn1 = DriverManager.getConnection(url, user, password);
            
            System.out.println("Connected to the database");
                              
        }
        catch (SQLException ex) {
            System.out.println("An error occurred. Maybe user/password is invalid");
            ex.printStackTrace();
        }
        return conn1;
    }
}