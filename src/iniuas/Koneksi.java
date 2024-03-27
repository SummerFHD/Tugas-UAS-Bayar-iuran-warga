package iniuas;
import java.sql.*;
import javax.swing.JOptionPane;

public class Koneksi {
    
    public Connection koneksi;
    
    public Koneksi() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        
        try{
            String url, user, password;
            url = "jdbc:mysql://localhost:3306/uasinifixbanget";
            user = "root";
            password = "";
            koneksi = DriverManager.getConnection(url, user, password);
            System.out.println("Koneksi Sukses");
        }
        
        catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "Koneksi Gagal! " + se);
            System.exit(0);
            closeResources(null);
        }
        
        }
        
        catch (ClassNotFoundException koneksiGagal) {
            // Log the exception details for troubleshooting
            koneksiGagal.printStackTrace();
            JOptionPane.showMessageDialog(null, "Driver Tidak Ditemukan! \n" + koneksiGagal.getMessage());
            System.exit(0);
        }
        
        }
        
    
    public Connection getKoneksi() {
    return koneksi;

    }
       private void closeResources(AutoCloseable resource) {
        if (resource != null) {
            try {
                resource.close();
            } catch (Exception e) {
                // Log the exception details for troubleshooting
                e.printStackTrace();
            }
        }
    }     
}
