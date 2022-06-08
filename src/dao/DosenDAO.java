/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import connection.DbConnection;
import java.sql.Connection;
import java.sql. ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Dosen;
/**
 *
 * @author Gde Rama Vedanta Yudhistira \n 200710735
 */
public class DosenDAO {
    private DbConnection dbCon = new DbConnection();
    private Connection con;
    
    public void insertDosen(Dosen d){
        con = dbCon.makeConnection();
        String sql = "insert into dosen(nomor_induk_dosen, nama, email, no_handphone) "
                + "values ('"+d.getNomorIndukDosen()+"','"+d.getNama()+"','"+d.getEmail()+"','"+d.getNoHandphone()+"')";
        System.out.println("Adding dosen..");
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Add "+result+" Dosen");
            statement.close();
        }
        catch(Exception e){
            System.out.println("Error adding Dosen..");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
    
    public List<Dosen> showDosen(){
        con = dbCon.makeConnection();
        String sql = "select * from dosen";
        System.out.println("");
        System.out.println("Mengambil data dosen...");
        
        List<Dosen> list = new ArrayList();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            if(rs != null){
                while(rs.next()){
                    Dosen d = new Dosen(
                        rs.getString("nomor_induk_dosen"),
                        rs.getString("nama"),
                        rs.getString("email"),
                        rs.getString("no_handphone")
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
    
    public Dosen searchDosen (String noInduk){
        con= dbCon.makeConnection();
            
        String sql = "SELECT * FROM dosen WHERE nomor_induk_dosen ='" + noInduk + "'";
        System.out.println ("searching Dosen. . . ");
        Dosen d = null;
        try{
            Statement statement = con.createStatement();
            ResultSet rs =  statement.executeQuery (sql);
            if (rs != null){
                while(rs.next()){
                    d = new Dosen(
                    rs.getString("nomor_induk_dosen"),
                    rs.getString("nama"),
                    rs.getString("email"),
                    rs.getString("no_handphone"));
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
    
    public void updateDosen (Dosen d, String noInduk){
        con= dbCon.makeConnection();
            
        String sql = "UPDATE dosen SET nama='"+ d.getNama() + "',"
        +"email = '"+ d.getEmail() + "', "
        +"no_handphone='" + d.getNoHandphone () +"'"
        +"WHERE nomor_induk_dosen = '" +noInduk + "'";
        System.out.println ("Editing Dosen. . . ");
        
        try{
            Statement statement = con.createStatement();
            int result =  statement.executeUpdate(sql);
            System.out.println("Edited "+result+" Dosen");
            statement.close();
        }
        catch (Exception e){
            System. out. println ("Error editing dosen. .. ");
            System.out.println (e) ;
        }
        dbCon.closeConnection();
    }
    
    public void deleteDosen (String noInduk){
        con= dbCon.makeConnection();
            
        String sql = "DELETE FROM dosen WHERE nomor_induk_dosen ='"+noInduk + "'";
        System.out.println("Deleting Dosen . . . ");
        
        try{
            Statement statement = con.createStatement();
            int result =  statement.executeUpdate(sql);
            System.out.println("Delete "+result+" Dosen");
            statement.close();
        }
        catch (Exception e){
            System. out. println ("Error deleting dosen. .. ");
            System.out.println (e) ;
        }
        dbCon.closeConnection();
    }
}
