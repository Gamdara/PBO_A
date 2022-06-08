/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import connection.DbConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Dosen;
import model.MataKuliah;

/**
 *
 * @author Gde Rama Vedanta Yudhistira \n 200710735
 */
public class MataKuliahDAO {
    private DbConnection dbCon = new DbConnection();
    private Connection con;
    
    public void insertMataKuliah(MataKuliah mk){
        con = dbCon.makeConnection();
        String sql = "insert into mata_kuliah(nomor_induk_dosen, nama, deskripsi, metode_pembayaran, kelas) "
                + "values ('"+mk.getDosen().getNomorIndukDosen()+"','"+mk.getNama()+"','"+mk.getDeskripsi()+"','"+mk.getMetode_pembayaran()+"','"+mk.getKelas()+"')";
        System.out.println("Adding mata kuliah..");
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Add "+result+" Mata Kuliah");
            statement.close();
        }
        catch(Exception e){
            System.out.println("Error adding Mata Kuliah..");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
    
    public List<MataKuliah> showMataKuliah(String query){
        con = dbCon.makeConnection();
        String sql = "select mk.*, d.* from mata_kuliah as mk join dosen as d on d.nomor_induk_dosen = mk.nomor_induk_dosen where "
                + "mk.nama like '%"+query+"%' "
                + "or mk.deskripsi like '%"+query+"%'"
                + "or mk.metode_pembayaran like '%"+query+"%'"
                + "or mk.kelas like '%"+query+"%'"
                + "or d.nama like '%"+query+"%'";
        System.out.println("");
        System.out.println("Mengambil data mata kuliah...");
        
        List<MataKuliah> list = new ArrayList();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            if(rs != null){
                while(rs.next()){
                    Dosen d = new Dosen(
                        rs.getString("d.nomor_induk_dosen"),
                        rs.getString("d.nama"),
                        rs.getString("d.email"),
                        rs.getString("d.no_handphone")
                    );
                    MataKuliah mk = new MataKuliah(
                        rs.getInt("mk.id"),
                        rs.getString("mk.nama"),
                        rs.getString("mk.deskripsi"),
                        rs.getString("mk.metode_pembayaran"),
                        rs.getString("mk.kelas"),
                        d
                    );
                    list.add(mk);
                }
            }
            rs.close();
            statement.close();
        }
        catch(Exception e){
            System.out.println("Error reading database...");
            System.out.println(e);
        }
        dbCon.closeConnection();
        return list;
    }
    
    public void updateMataKuliah (MataKuliah mk){
        con= dbCon.makeConnection();
            
        String sql = "UPDATE mata_kuliah SET "
                + "nomor_induk_dosen = '"+mk.getDosen().getNomorIndukDosen()+"', "
                + "nama = '"+mk.getNama()+"', "
                + "deskripsi='"+mk.getDeskripsi()+"', "
                + "metode_pembayaran='"+mk.getMetode_pembayaran()+"', "
                + "kelas='"+mk.getKelas()+"' "
                + "where id="+mk.getId()+"";
        System.out.println ("Editing MataKuliah. . . ");
        
        try{
            Statement statement = con.createStatement();
            int result =  statement.executeUpdate(sql);
            System.out.println("Edited "+result+" Mata Kuliah");
            statement.close();
        }
        catch (Exception e){
            System. out. println ("Error editing mata_kuliah. .. ");
            System.out.println (e) ;
        }
        dbCon.closeConnection();
    }
    
    public void deleteMataKuliah (int id){
        con= dbCon.makeConnection();
            
        String sql = "DELETE FROM mata_kuliah WHERE id ="+id + "";
        System.out.println("Deleting MataKuliah . . . ");
        
        try{
            Statement statement = con.createStatement();
            int result =  statement.executeUpdate(sql);
            System.out.println("Delete "+result+" MataKuliah");
            statement.close();
        }
        catch (Exception e){
            System. out. println ("Error deleting mata_kuliah. .. ");
            System.out.println (e) ;
        }
        dbCon.closeConnection();
    }
}
