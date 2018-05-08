/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 *
 * @author nunya
 */
public class DatabaseConnection {
    public static void main(String[] args) {
		
		// TODO Auto-generated method stub
        
        try{
                Connection conn = DriverManager.getConnection("jdbc:mysql://triton.towson.edu/eleo1db","eleo1","Cosc*ry68");

        //System.out.println("connection success");
        String query="Select*from Plan_table";
        Statement stmt=conn.createStatement();
        ResultSet rs= stmt.executeQuery(query);
            while(rs.next()){
                    System.out.println();

            }
        }catch (Exception e){
                System.err.println(e);
        }
}

    public DatabaseConnection() {
        
    }
    
}
