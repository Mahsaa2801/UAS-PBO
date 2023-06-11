/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koneksi;

/**
 *
 * @author ASUS.DX
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class db_koneksi {
    private static Connection conn;
    public static Connection getkoneksi(){
        String host= "jdbc:mysql://localhost/obatbatuk",
                user= "root",
                pass= "";
        try{
            conn = (Connection) DriverManager.getConnection(host, user, pass);
        }catch (SQLException err){
            JOptionPane.showMessageDialog(null, err.getMessage());
        }
        return conn;
    }
    
    
}
