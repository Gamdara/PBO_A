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
import model.Bandara;
import model.Menu;
import model.Pesawat;
/**
 *
 * @author Gde Rama Vedanta Yudhistira \n 200710735
 */
public class PesawatDAO {
    private DbConnection dbCon = DbConnection.getInstance();
    private Connection con;
    
    public void insertPesawat(Pesawat d){
        con = dbCon.makeConnection();
        
        String sql = "insert into pesawat(nama,id_bandara_asal,id_bandara_tujuan, maskapai, kapasitas, kelas,harga) "
                + "values ("
                + "'"+d.getNama()+"',"
                + ""+d.getAsal().getId()+","
                + ""+d.getTujuan().getId()+","
                + "'"+d.getMaskapai()+"',"
                + ""+d.getKapasitas()+","
                + "'"+d.getKelas()+"',"
                + ""+d.getHarga()+""
                 +")";
        System.out.println("Adding pesawat.. "+sql);
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Add "+result+" Pesawat");
            statement.close();
        }
        catch(Exception e){
            System.out.println("Error adding Pesawat..");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
    
    public List<Pesawat> showPesawat(){
        con = dbCon.makeConnection();
        String sql = "select * from pesawat as p "
                + "join bandara as asal on p.id_bandara_asal = asal.id "
                + "join bandara as tujuan on p.id_bandara_tujuan = tujuan.id "
                ;
        System.out.println("");
        System.out.println("Mengambil data pesawat... "+sql);
        
        List<Pesawat> list = new ArrayList();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            if(rs != null){
                while(rs.next()){
                    Bandara asal = new Bandara(
                        rs.getInt("asal.id"),
                        rs.getString("asal.nama"),
                        rs.getString("asal.kota")
                    );
                    
                    Bandara tujuan = new Bandara(
                        rs.getInt("tujuan.id"),
                        rs.getString("tujuan.nama"),
                        rs.getString("tujuan.kota")
                    );
                    
                    Pesawat d = new Pesawat(
                        rs.getInt("p.id"),
                        rs.getString("p.nama"),
                        asal,
                        tujuan,
                        rs.getString("p.maskapai"),
                        rs.getInt("p.kapasitas"),
                        rs.getString("p.kelas"),
                        rs.getInt("p.harga")
                    );
                    list.add(d);
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
    
    public List<Pesawat> showPesawat(String key){
        con = dbCon.makeConnection();
        String sql = "select * from pesawat as p "
                + "join bandara as asal on p.id_bandara_asal = asal.id "
                + "join bandara as tujuan on p.id_bandara_tujuan = tujuan.id "
                + "where p.nama like '%"+key+"%'"
                + "or asal.nama like '%"+key+"%'"
                + "or tujuan.nama like '%"+key+"%'"
                + "or p.maskapai like '%"+key+"%'"
                + "or p.kapasitas = '"+key+"'"
                + "or p.kelas like '%"+key+"%'"
                + "or p.harga = '"+key+"'"
                ;
        System.out.println("");
        System.out.println("Mengambil data pesawat... "+sql);
        
        List<Pesawat> list = new ArrayList();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            if(rs != null){
                while(rs.next()){
                    Bandara asal = new Bandara(
                        rs.getInt("asal.id"),
                        rs.getString("asal.nama"),
                        rs.getString("asal.kota")
                    );
                    
                    Bandara tujuan = new Bandara(
                        rs.getInt("tujuan.id"),
                        rs.getString("tujuan.nama"),
                        rs.getString("tujuan.kota")
                    );
                    
                    Pesawat d = new Pesawat(
                        rs.getInt("p.id"),
                        rs.getString("p.nama"),
                        asal,
                        tujuan,
                        rs.getString("p.maskapai"),
                        rs.getInt("p.kapasitas"),
                        rs.getString("p.kelas"),
                        rs.getInt("p.harga")
                    );
                    list.add(d);
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
    
    public List<Pesawat> showPesawat(String nasal, String ntujuan, String kelas){
        con = dbCon.makeConnection();
        String sql = "select * from pesawat as p "
                + "join bandara as asal on p.id_bandara_asal = asal.id "
                + "join bandara as tujuan on p.id_bandara_tujuan = tujuan.id "
                + "where asal.nama like '%"+nasal+"%'"
                + "and tujuan.nama like '%"+ntujuan+"%'"
                + "and p.kelas like '%"+kelas+"%'"
                ;
        System.out.println("");
        System.out.println("Mengambil data pesawat... "+sql);
        
        List<Pesawat> list = new ArrayList();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            if(rs != null){
                while(rs.next()){
                    Bandara asal = new Bandara(
                        rs.getInt("asal.id"),
                        rs.getString("asal.nama"),
                        rs.getString("asal.kota")
                    );
                    
                    Bandara tujuan = new Bandara(
                        rs.getInt("tujuan.id"),
                        rs.getString("tujuan.nama"),
                        rs.getString("tujuan.kota")
                    );
                    
                    Pesawat d = new Pesawat(
                        rs.getInt("p.id"),
                        rs.getString("p.nama"),
                        asal,
                        tujuan,
                        rs.getString("p.maskapai"),
                        rs.getInt("p.kapasitas"),
                        rs.getString("p.kelas"),
                        rs.getInt("p.harga")
                    );
                    list.add(d);
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
    
    public Pesawat searchPesawat (int id){
        con= dbCon.makeConnection();
            
        String sql = "select * from pesawat as p "
                + "join bandara as asal on p.id_bandara_asal = asal.id "
                + "join bandara as tujuan on p.id_bandara_tujuan = tujuan.id "
                + "where p.id = "+id
                ;
        System.out.println ("searching Pesawat. . . ");
        Pesawat d = null;
        try{
            Statement statement = con.createStatement();
            ResultSet rs =  statement.executeQuery (sql);
            if (rs != null){
                while(rs.next()){
                    Bandara asal = new Bandara(
                        rs.getInt("asal.id"),
                        rs.getString("asal.nama"),
                        rs.getString("asal.kota")
                    );
                    
                    Bandara tujuan = new Bandara(
                        rs.getInt("tujuan.id"),
                        rs.getString("tujuan.nama"),
                        rs.getString("tujuan.kota")
                    );
                    
                    d = new Pesawat(
                        rs.getInt("p.id"),
                        rs.getString("p.nama"),
                        asal,
                        tujuan,
                        rs.getString("p.maskapai"),
                        rs.getInt("p.kapasitas"),
                        rs.getString("p.kelas"),
                        rs.getInt("p.harga")
                    );
                }           
            }
            rs.close();
            statement.close();
        }
        catch (Exception e){
            System. out. println ("Error reading database. .. ");
            System.out.println (e) ;
        }
        dbCon.closeConnection();
        return d;
    }
    
    public void updatePesawat (Pesawat d, int id){
        con= dbCon.makeConnection();
        
        String menu = "";
        String sql = "UPDATE pesawat SET "
                +"nama='"+ d.getNama()+ "',"
                +"id_bandara_asal="+ d.getAsal().getId()+ ","
                +"id_bandara_tujuan="+ d.getTujuan().getId()+ ","
                +"maskapai='"+ d.getMaskapai()+ "',"
                +"kapasitas="+ d.getKapasitas()+ ","
                +"kelas = '"+ d.getKelas()+ "', "
                +"harga="+ d.getHarga()+ " "
                +"WHERE id = " +id + "";
        System.out.println ("Editing Pesawat. . . ");
        
        try{
            Statement statement = con.createStatement();
            int result =  statement.executeUpdate(sql);
            System.out.println("Edited "+result+" Pesawat");
            statement.close();
        }
        catch (Exception e){
            System. out. println ("Error editing pesawat. .. ");
            System.out.println (e) ;
            System.out.println (sql) ;
        }
        dbCon.closeConnection();
    }
    
    public void deletePesawat (int noInduk){
        con= dbCon.makeConnection();
            
        String sql = "DELETE FROM pesawat WHERE id ="+noInduk + "";
        System.out.println("Deleting Pesawat . . . ");
        
        try{
            Statement statement = con.createStatement();
            int result =  statement.executeUpdate(sql);
            System.out.println("Delete "+result+" Pesawat");
            statement.close();
        }
        catch (Exception e){
            System. out. println ("Error deleting pesawat. .. ");
            System.out.println (e) ;
        }
        dbCon.closeConnection();
    }
    
}
