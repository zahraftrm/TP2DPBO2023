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
import javax.swing.ImageIcon;

/**
 *
 * @author Zahra F
 */
public class dbConnection {
   private Connection conn = null;
   private Statement stmt = null;
   
   public dbConnection(){
        String ConAddress = "jdbc:mysql://localhost/db_wishlist";
        String user = "root";
        String pass = "";
        connect(ConAddress, user, pass);
   }
   
   private void connect(String ConAddress, String username, String pass){
       try{
           Class.forName("com.mysql.jdbc.Driver");
           conn = DriverManager.getConnection(ConAddress, username, pass);
           stmt = conn.createStatement();
       } catch(ClassNotFoundException | SQLException ex){
           System.out.println(ex.getMessage());
       }
   }
   
   public ResultSet selectQuery(String sql){
       try{
           stmt.executeQuery(sql);
           return stmt.getResultSet();
       } catch (SQLException ex){
           System.out.println(ex.getMessage());
       }
       return null;
   }
   
   public int updateQuery(String sql){
       try{
           return stmt.executeUpdate(sql);
       } catch (SQLException ex){
           System.out.println(ex.getMessage());
       }
       return 0;
   }
   
   public ImageIcon getImage(int id) {
    ImageIcon imageIcon = null;
    try {
        String query = "SELECT foto FROM wishlist WHERE id='"+id+"'";
        ResultSet rs = selectQuery(query);
        if (rs.next()) {
            byte[] imageData = rs.getBytes("foto");
            imageIcon = new ImageIcon(imageData);
        }
    } catch (SQLException ex) {
        System.out.println(ex.getMessage());
    }
    return imageIcon;
}
   
   public Statement getStatement(){
       return stmt;
   }
}
