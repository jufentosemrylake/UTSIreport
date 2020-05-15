package koneksi;

import com.mysql.jdbc.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.DriverManager;

public class Koneksi {
    private static  Connection koneksimysql;
    public static Connection koneksiDB() throws SQLException{
        if (koneksimysql == null) {
            try{
                String DB = "jdbc:mysql://localhost:3306/oop";
                String user = "root";
                String pass = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksimysql = (Connection)DriverManager.getConnection(DB,user,pass);
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Gagal terkoneksi dengan database");
            }
        }
        return koneksimysql;
    }
    
}
