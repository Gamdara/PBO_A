/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connection.DbConnection;
import java.sql.Connection;
import java.sql. ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Bandara;
/**
 *
 * @author Gde Rama Vedanta Yudhistira / 200710735 / PBO A
 */
public class BandaraDAO {
    private DbConnection dbCon = DbConnection.getInstance();
    private Connection con;
    
    public void insertBandara(Bandara d){
        con = dbCon.makeConnection();
        String sql = "insert into bandara(nama, kota) "
                + "values ('"+d.getNama()+"','"+d.getKota()
                 +"')";
        System.out.println("Adding bandara..");
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Add "+result+" Bandara");
            statement.close();
        }
        catch(Exception e){
            System.out.println("Error adding Bandara..");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
    
    public List<Bandara> showBandara(){
        con = dbCon.makeConnection();
        String sql = "select * from bandara";
        System.out.println("");
        System.out.println("Mengambil data bandara...");
        
        List<Bandara> list = new ArrayList();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            if(rs != null){
                while(rs.next()){
                    Bandara d = new Bandara(
                        rs.getInt("id"),
                        rs.getString("nama"),
                        rs.getString("kota")
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
    
    public List<Bandara> showBandara(String key){
        con = dbCon.makeConnection();
        String sql = "select * from bandara where nama like '%"+key+"%' or kota like '%"+key+"%' or id = '"+key+"'";
        System.out.println("");
        System.out.println("Mengambil data bandara...");
        
        List<Bandara> list = new ArrayList();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            if(rs != null){
                while(rs.next()){
                    Bandara d = new Bandara(
                        rs.getInt("id"),
                        rs.getString("nama"),
                        rs.getString("kota")
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
    
    public Bandara searchBandara (int id){
        con= dbCon.makeConnection();
            
        String sql = "SELECT * FROM bandara WHERE id =" + id + "";
        System.out.println ("searching Bandara. . . ");
        Bandara d = null;
        try{
            Statement statement = con.createStatement();
            ResultSet rs =  statement.executeQuery (sql);
            if (rs != null){
                while(rs.next()){
                    d = new Bandara(
                    rs.getInt("id"),
                    rs.getString("nama"),
                    rs.getString("kota"));
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
    
    public void updateBandara (Bandara d, int id){
        con= dbCon.makeConnection();
            
        String sql = "UPDATE bandara SET nama='"+ d.getNama() + "',"
        +"kota = '"+ d.getKota()+ "' "
        +"WHERE id = " +id + "";
        System.out.println ("Editing Bandara. . . ");
        
        try{
            Statement statement = con.createStatement();
            int result =  statement.executeUpdate(sql);
            System.out.println("Edited "+result+" Bandara");
            statement.close();
        }
        catch (Exception e){
            System. out. println ("Error editing bandara. .. ");
            System.out.println (e) ;
        }
        dbCon.closeConnection();
    }
    
    public void deleteBandara (int noInduk){
        con= dbCon.makeConnection();
            
        String sql = "DELETE FROM bandara WHERE id ="+noInduk + "";
        System.out.println("Deleting Bandara . . . ");
        
        try{
            Statement statement = con.createStatement();
            int result =  statement.executeUpdate(sql);
            System.out.println("Delete "+result+" Bandara");
            statement.close();
        }
        catch (Exception e){
            System. out. println ("Error deleting bandara. .. ");
            System.out.println (e) ;
        }
        dbCon.closeConnection();
    }
}
