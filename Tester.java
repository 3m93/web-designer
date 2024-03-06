/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserRegistration;
import java.sql.*;
/**
 *
 * @author Win10pro
 */
public class Tester {
    public static void main(String[] args){
        try{
            
            String url="jbdc:mysql://localhost:3306/Employees Management System";
            Connection conn;
            conn = DriverManager.getConnection(url,"amna","amnaghazi");
            Statement stmt;
            stmt = conn.createStatement();
            ResultSet rs;
            rs = stmt.executeQuery("SELECT * FROM Employees");
            while(rs.next()){
                int id  =rs.getInt("ID");
                System.out.println(id);
                
            }
          rs.close();stmt.close();conn.close();
        }
        catch(SQLException e){
            System.out.println("exception"+e);
        }
    }
    
    }
    

