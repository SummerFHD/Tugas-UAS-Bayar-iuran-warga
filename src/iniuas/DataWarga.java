package iniuas;
import java.sql.*;
import javax.swing.JOptionPane;

public class DataWarga extends Koneksi {
    
    public ResultSet hasil;
    public Statement statement;
    
    public DataWarga() {
        
        try {
            
            String query = "SELECT data_warga.*, data_iuran.status " + "FROM data_warga " + " LEFT JOIN data_iuran ON data_warga.nomor_rumah = data_iuran.nomor_rumah";

            statement =  getKoneksi().createStatement();
            hasil = statement.executeQuery(query);
            
        }
        
        catch(SQLException ex) { }
        
    }
    
    public void refresh() {
        
        try {
            
            String query = "SELECT data_warga.*, data_iuran.status " + "FROM data_warga " + " LEFT JOIN data_iuran ON data_warga.nomor_rumah = data_iuran.nomor_rumah";

            statement =  getKoneksi().createStatement();
            hasil = statement.executeQuery(query);
            
        }
        
        catch(SQLException ex) { }
        
    }
    
    public void cek (String cekNomorRumah) {
        
        String query = "SELECT * FROM data_warga WHERE nomor_rumah = '" + cekNomorRumah + "'";
        
        try {hasil = statement.executeQuery(query);}
        catch(SQLException ex) { }
    }
    
    public void tambah (String cekNomorRumah, String cekNamaKepalaKeluarga, String cekNomorTelepon, String cekAlamat){
        
        try {
            
            String query = "INSERT INTO data_warga (nomor_rumah, nama_kepala_keluarga, nomor_telepon, alamat) VALUES ('" + cekNomorRumah + "', '" + cekNamaKepalaKeluarga + "', '" + cekNomorTelepon + "', '" + cekAlamat + "')";
        
            statement.executeUpdate(query);        
            query = "SELECT * FROM data_warga";        
            hasil = statement.executeQuery(query);
        
        }
        
        catch (SQLException ex) { }
        
    }
    
    public void update (String cekNomorRumah, String cekNamaKepalaKeluarga, String cekNomorTelepon, String cekAlamat){
        
        String query = "UPDATE data_warga SET " + "nama_kepala_keluarga = '" + cekNamaKepalaKeluarga + "', " + "nomor_telepon = '" + cekNomorTelepon + "', " + "alamat = '" + cekAlamat + "' " + "WHERE nomor_rumah = '" + cekNomorRumah + "'";
                
        try {
            
            statement.executeUpdate(query);
            query = "SELECT * FROM data_warga";
            hasil = statement.executeQuery(query);
        
        }
        
        catch (SQLException ex) { }
        
    }
    
    public void hapus (String cekNomorRumah) {
        
        String query = "DELETE FROM data_warga WHERE nomor_rumah = '" + cekNomorRumah + "'";
        
        try {
            
            statement.executeUpdate(query);
            query = "SELECT * FROM data_warga";
            hasil = statement.executeQuery(query);
            
        }
        
        catch (SQLException ex) {}
    
    }
}