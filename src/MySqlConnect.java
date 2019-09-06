
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KriShaivi
 */
public class MySqlConnect {
    
    public static Connection connectDb(){
        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb", "Shaivi", "hello1999");
            //JOptionPane.showMessageDialog(null,"Connection Established Successfully!","Connection",JOptionPane.INFORMATION_MESSAGE);
            return conn;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Something went Wrong (MySqlConnect.java:)"+e.getMessage(),"Connection",JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }        
}