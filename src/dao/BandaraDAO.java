/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connection.DbConnection;
import java.sql.Connection;
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
        System.out.println("Adding dosen..");
        
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
        String sql = "select * from dosen";
        System.out.println("");
        System.out.println("Mengambil data dosen...");
        
        List<Bandara> list = new ArrayList();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            if(rs != null){
                while(rs.next()){
                    Bandara d = new Bandara(
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
    
    public Bandara searchBandara (String noInduk){
        con= dbCon.makeConnection();
            
        String sql = "SELECT * FROM dosen WHERE nomor_induk_dosen ='" + noInduk + "'";
        System.out.println ("searching Bandara. . . ");
        Bandara d = null;
        try{
            Statement statement = con.createStatement();
            ResultSet rs =  statement.executeQuery (sql);
            if (rs != null){
                while(rs.next()){
                    d = new Bandara(
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
    
    public void updateBandara (Bandara d, String noInduk){
        con= dbCon.makeConnection();
            
        String sql = "UPDATE dosen SET nama='"+ d.getNama() + "',"
        +"email = '"+ d.getEmail() + "', "
        +"no_handphone='" + d.getNoHandphone () +"'"
        +"WHERE nomor_induk_dosen = '" +noInduk + "'";
        System.out.println ("Editing Bandara. . . ");
        
        try{
            Statement statement = con.createStatement();
            int result =  statement.executeUpdate(sql);
            System.out.println("Edited "+result+" Bandara");
            statement.close();
        }
        catch (Exception e){
            System. out. println ("Error editing dosen. .. ");
            System.out.println (e) ;
        }
        dbCon.closeConnection();
    }
    
    public void deleteBandara (String noInduk){
        con= dbCon.makeConnection();
            
        String sql = "DELETE FROM dosen WHERE nomor_induk_dosen ='"+noInduk + "'";
        System.out.println("Deleting Bandara . . . ");
        
        try{
            Statement statement = con.createStatement();
            int result =  statement.executeUpdate(sql);
            System.out.println("Delete "+result+" Bandara");
            statement.close();
        }
        catch (Exception e){
            System. out. println ("Error deleting dosen. .. ");
            System.out.println (e) ;
        }
        dbCon.closeConnection();
    }
}
