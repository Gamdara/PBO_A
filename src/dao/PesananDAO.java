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
import model.Pesawat;
import model.Menu;
import model.Bandara;
import model.Pesanan;

/**
 *
 * @author Gde Rama Vedanta Yudhistira \n 200710735
 */
public class PesananDAO {
    private DbConnection dbCon = DbConnection.getInstance();
    private Connection con;
    
    public void insertPesanan(Pesanan d){
        con = dbCon.makeConnection();
        String menu = "";
        if(d.getMenu() == null) menu = "null";
        else menu = d.getMenu().getId().toString();
        String sql = "insert into pesanan(id_pesawat,id_menu,nama_pemesan,jumlah_penumpang,total,tanggal,no_tiket,bagasi) "
                + "values ("
                + ""+d.getPesawat().getId()+","
                + ""+menu+","
                + "'"+d.getNama_pemesan()+"',"
                + ""+d.getJumlah_penumpang()+","
                + ""+d.getTotal()+","
                + "'"+d.getTanggal()+"',"
                + "'"+d.getNo_tiket()+"',"
                + ""+d.getBagasi()+""
                 +")";
        System.out.println("Adding pesanan.. "+sql);
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Add "+result+" Pesanan");
            statement.close();
        }
        catch(Exception e){
            System.out.println("Error adding Pesanan..");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
    
    public List<Pesanan> showPesanan(){
        con = dbCon.makeConnection();
        String sql = "select * from pesanan as psn "
                + "join pesawat as pst on psn.id_pesawat = pst.id "
                + "join bandara as asal on pst.id_bandara_asal = asal.id "
                + "join bandara as tujuan on pst.id_bandara_tujuan = tujuan.id "
                + "left join menu as menu on psn.id_menu = menu.id  "
                ;
        System.out.println("");
        System.out.println("Mengambil data pesanan... "+sql);
        
        List<Pesanan> list = new ArrayList();
        
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
                    
                    Menu menu = new Menu(
                        rs.getInt("menu.id"),
                        rs.getString("menu.nama")
                    );
                    
                    Pesawat p = new Pesawat(
                        rs.getInt("pst.id"),
                        rs.getString("pst.nama"),
                        asal,
                        tujuan,
                        rs.getString("pst.maskapai"),
                        rs.getInt("pst.kapasitas"),
                        rs.getString("pst.kelas"),
                        rs.getInt("pst.harga")
                    );
                    
                    Pesanan d = new Pesanan(
                        rs.getInt("psn.id"),
                        p,
                        menu,
                        rs.getString("psn.nama_pemesan"),
                        rs.getInt("psn.jumlah_penumpang"),
                        rs.getInt("psn.total"),
                        rs.getString("psn.tanggal"),
                        rs.getString("psn.no_tiket"),
                        rs.getInt("psn.bagasi")
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
    
    public List<Pesanan> showPesanan(String key){
        con = dbCon.makeConnection();
        String sql = "select * from pesanan as psn "
                + "join pesawat as pst on psn.id_pesawat = pst.id "
                + "join bandara as asal on pst.id_bandara_asal = asal.id "
                + "join bandara as tujuan on pst.id_bandara_tujuan = tujuan.id "
                + "left join menu as menu on psn.id_menu = menu.id "
                + "where psn.nama_pemesan like '%"+key+"%' "
                + "or pst.nama like '%"+key+"%'"
                + "or asal.nama like '%"+key+"%'"
                + "or tujuan.nama like '%"+key+"%'"
                + "or psn.no_tiket like '%"+key+"%'"
                + "or psn.tanggal like '%"+key+"%'"
                + "or psn.total = '"+key+"'"
                + "or psn.jumlah_penumpang = '"+key+"'"
                ;
        System.out.println("");
        System.out.println("Mengambil data pesanan... "+sql);
        
        List<Pesanan> list = new ArrayList();
        
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
                    
                    Menu menu = new Menu(
                        rs.getInt("menu.id"),
                        rs.getString("menu.nama")
                    );
                    
                    Pesawat p = new Pesawat(
                        rs.getInt("pst.id"),
                        rs.getString("pst.nama"),
                        asal,
                        tujuan,
                        rs.getString("pst.maskapai"),
                        rs.getInt("pst.kapasitas"),
                        rs.getString("pst.kelas"),
                        rs.getInt("pst.harga")
                    );
                    
                    Pesanan d = new Pesanan(
                        rs.getInt("psn.id"),
                        p,
                        menu,
                        rs.getString("psn.nama_pemesan"),
                        rs.getInt("psn.jumlah_penumpang"),
                        rs.getInt("psn.total"),
                        rs.getString("psn.tanggal"),
                        rs.getString("psn.no_tiket"),
                        rs.getInt("psn.bagasi")
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
    
    public Pesanan searchPesanan (int id){
        con= dbCon.makeConnection();
            
        String sql = "select * from pesanan as psn "
                + "join pesawat as pst on psn.id_pesawat = pst.id "
                + "join bandara as asal on pst.id_bandara_asal = asal.id "
                + "join bandara as tujuan on pst.id_bandara_tujuan = tujuan.id "
                + "left join menu as menu on psn.id_menu = menu.id  "
                + "where psn.id = "+id
                ;
        System.out.println ("searching Pesanan. . . ");
        Pesanan d = null;
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
                    
                    Menu menu = new Menu(
                        rs.getInt("menu.id"),
                        rs.getString("menu.nama")
                    );
                    
                    Pesawat p = new Pesawat(
                        rs.getInt("pst.id"),
                        rs.getString("pst.nama"),
                        asal,
                        tujuan,
                        rs.getString("pst.maskapai"),
                        rs.getInt("pst.kapasitas"),
                        rs.getString("pst.kelas"),
                        rs.getInt("pst.harga")
                    );
                    
                    d = new Pesanan(
                        rs.getInt("psn.id"),
                        p,
                        menu,
                        rs.getString("psn.nama_pemesan"),
                        rs.getInt("psn.jumlah_penumpang"),
                        rs.getInt("psn.total"),
                        rs.getString("psn.tanggal"),
                        rs.getString("psn.no_tiket"),
                        rs.getInt("psn.bagasi")
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
    
    public void updatePesanan (Pesanan d, int id){
        con= dbCon.makeConnection();
        
        String menu = "";
        
        String sql = "UPDATE pesanan SET "
                +"id_pesawat="+ d.getPesawat().getId()+ ","
                +"id_menu="+ d.getMenu().getId()+ ","
                +"nama_pesanan='"+ d.getNama_pemesan()+ "',"
                +"jumlah_penumpang="+ d.getJumlah_penumpang()+ ","
                +"total="+ d.getTotal()+ ","
                +"tanggal='"+ d.getTanggal()+ "',"
                +"no_tiket='"+ d.getNo_tiket()+ "',"
                +"bagasi = "+ d.getBagasi()+ " "
                +"WHERE id = " +id + "";
        System.out.println ("Editing Pesanan. . . ");
        
        try{
            Statement statement = con.createStatement();
            int result =  statement.executeUpdate(sql);
            System.out.println("Edited "+result+" Pesanan");
            statement.close();
        }
        catch (Exception e){
            System. out. println ("Error editing pesanan. .. ");
            System.out.println (e) ;
        }
        dbCon.closeConnection();
    }
    
    public void deletePesanan (int id){
        con= dbCon.makeConnection();
            
        String sql = "DELETE FROM pesanan WHERE id ="+ id+ "";
        System.out.println("Deleting Pesanan . . . ");
        
        try{
            Statement statement = con.createStatement();
            int result =  statement.executeUpdate(sql);
            System.out.println("Delete "+result+" Pesanan");
            statement.close();
        }
        catch (Exception e){
            System. out. println ("Error deleting pesanan. .. ");
            System.out.println (e) ;
        }
        dbCon.closeConnection();
    }
    
}
