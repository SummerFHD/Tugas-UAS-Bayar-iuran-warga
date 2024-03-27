package iniuas;
import java.sql.*;

public class DataLogin extends Koneksi{
    
    public ResultSet hasil;
    public Statement statement;
    
    public void cek (String cekUsername, String cekPassword) {
        String query = "SELECT * FROM user WHERE username = '" + cekUsername + "' AND password = '" + cekPassword + "'";
        
        try {
            
            statement = getKoneksi().createStatement();
            hasil = statement.executeQuery(query);
            
        }
        
        catch (SQLException ex) {}
    }
    
}
