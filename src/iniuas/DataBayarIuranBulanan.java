package iniuas;
import java.sql.*;
import javax.swing.JOptionPane;

public class DataBayarIuranBulanan extends Koneksi {
    
    public ResultSet hasil;
    public Statement statement;
    
    public DataBayarIuranBulanan() {
        
        try {
            
            String query = "SELECT data_warga.nomor_rumah, data_warga.nama_kepala_keluarga, data_iuran.nominal_bayar, data_iuran.keterangan, data_iuran.status " + "FROM data_warga " + "INNER JOIN data_iuran ON data_warga.nomor_rumah = data_iuran.nomor_rumah";
            
            statement =  getKoneksi().createStatement();
            hasil = statement.executeQuery(query);
            
        }
        
        catch(SQLException ex) { }
        
    }
    
    public void cek (String cekNomorRumah) {
        
        String query = "SELECT * FROM data_iuran WHERE nomor_rumah = '" + cekNomorRumah + "'";
        
        try {hasil = statement.executeQuery(query);}
        catch(SQLException ex) { }
    }
    
    public void tambah (String cekNomorRumah, String cekNamaKepalaKeluarga, String cekNominalBayar, String cekKeterangan, String cekStatus){
        try {
            
            String query = "INSERT INTO data_iuran (nomor_rumah, nama_kepala_keluarga, nominal_bayar, keterangan, status) VALUES ('" + cekNomorRumah + "', '" + cekNamaKepalaKeluarga + "', '" + cekNominalBayar + "', '" + cekKeterangan + "', '" + cekStatus + "')";
        
            statement.executeUpdate(query);        
            query = "SELECT * FROM data_iuran";        
            hasil = statement.executeQuery(query);
        
        }
        
        catch (SQLException ex) { }
        
    }
    
    public void update (String cekNomorRumah, String cekNominalBayar, String cekKeterangan, String cekStatus){
        
        String query = "UPDATE data_iuran SET " + " nominal_bayar = '" + cekNominalBayar + "', " + " keterangan = '" + cekKeterangan + "', " + " status = '" + cekStatus + "' " + " WHERE nomor_rumah = '" + cekNomorRumah + "'";
                
        try {
            
            statement.executeUpdate(query);
            query = "SELECT * FROM data_iuran";
            hasil = statement.executeQuery(query);
        
        }
        
        catch (SQLException ex) { }
        
    }
    
    public void hapus (String cekNomorRumah) {
        
        String query = "DELETE FROM data_iuran WHERE nomor_rumah = '" + cekNomorRumah + "'";
        
        try {
            
            statement.executeUpdate(query);
            query = "SELECT * FROM data_iuran";
            hasil = statement.executeQuery(query);
            
        }
        
        catch (SQLException ex) {}
    }
    
    public void cari (String cekCari) {
        
        String query = "SELECT * FROM data_iuran WHERE nomor_rumah LIKE '%" + cekCari + "%' OR nama_kepala_keluarga LIKE '%" + cekCari + "%'";
        
        try {hasil = statement.executeQuery(query);}
        
        catch (SQLException ex){ }
    }
    
}
