/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2dpbo2023;

//import
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Zahra F
 */
public class dbConnection {
   // Buat atribut
   private Connection conn = null;
   private Statement stmt = null;
   
   // Membuat koneksi ke db
   public dbConnection(){
        String ConAddress = "jdbc:mysql://localhost/db_wishlist";
        String user = "root";
        String pass = "";
        connect(ConAddress, user, pass);
   }
   
   // Melakukan koneksi ke db dengan Driver Mysql JDBC
   private void connect(String ConAddress, String username, String pass){
       try{
           Class.forName("com.mysql.jdbc.Driver");
           conn = DriverManager.getConnection(ConAddress, username, pass);
           stmt = conn.createStatement();
       } catch(ClassNotFoundException | SQLException ex){
           System.out.println(ex.getMessage());
       }
   }
   
   // Untuk query SELECT
   public ResultSet selectQuery(String sql){
       try{
           stmt.executeQuery(sql);
           return stmt.getResultSet();
       } catch (SQLException ex){
           System.out.println(ex.getMessage());
       }
       return null;
   }
   
   // Untuk query INSERT, UPDATE, DELETE
   public int updateQuery(String sql){
       try{
           return stmt.executeUpdate(sql);
       } catch (SQLException ex){
           System.out.println(ex.getMessage());
       }
       return 0;
   }
   
   // Untuk mendapatkan objek statement
   public Statement getStatement(){
       return stmt;
   }
}
