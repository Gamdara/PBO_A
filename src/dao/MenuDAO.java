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
import model.Menu;
/**
 *
 * @author Gde Rama Vedanta Yudhistira \n 200710735
 */
public class MenuDAO {
    private DbConnection dbCon = DbConnection.getInstance();
    private Connection con;
    
    public void insertMenu(Menu d){
        con = dbCon.makeConnection();
        String sql = "insert into menu(nama) "
                + "values ('"+d.getNama()+"')";
        System.out.println("Adding menu..");
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Add "+result+" Menu");
            statement.close();
        }
        catch(Exception e){
            System.out.println("Error adding Menu..");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
    
    public List<Menu> showMenu(){
        con = dbCon.makeConnection();
        String sql = "select * from menu";
        System.out.println("");
        System.out.println("Mengambil data menu...");
        
        List<Menu> list = new ArrayList();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            if(rs != null){
                while(rs.next()){
                    Menu d = new Menu(
                        rs.getInt("id"),
                        rs.getString("nama")
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
    
    public List<Menu> showMenu(String key){
        con = dbCon.makeConnection();
        String sql = "select * from menu where nama like '%"+key+"%' or id = '"+key+"'";
        System.out.println("");
        System.out.println("Mengambil data menu...");
        
        List<Menu> list = new ArrayList();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            if(rs != null){
                while(rs.next()){
                    Menu d = new Menu(
                        rs.getInt("id"),
                        rs.getString("nama")
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
    
    public Menu searchMenu (int id){
        con= dbCon.makeConnection();
            
        String sql = "SELECT * FROM menu WHERE id =" + id + "";
        System.out.println ("searching Menu. . . ");
        Menu d = null;
        try{
            Statement statement = con.createStatement();
            ResultSet rs =  statement.executeQuery (sql);
            if (rs != null){
                while(rs.next()){
                    d = new Menu(
                    rs.getInt("id"),
                    rs.getString("nama"));
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
    
    public void updateMenu (Menu d, int id){
        con= dbCon.makeConnection();
            
        String sql = "UPDATE menu SET nama='"+ d.getNama() + "'"
        +"WHERE id = " +id + "";
        System.out.println ("Editing Menu. . . ");
        
        try{
            Statement statement = con.createStatement();
            int result =  statement.executeUpdate(sql);
            System.out.println("Edited "+result+" Menu");
            statement.close();
        }
        catch (Exception e){
            System. out. println ("Error editing menu. .. ");
            System.out.println (e) ;
        }
        dbCon.closeConnection();
    }
    
    public void deleteMenu (int noInduk){
        con= dbCon.makeConnection();
            
        String sql = "DELETE FROM menu WHERE id ="+noInduk + "";
        System.out.println("Deleting Menu . . . ");
        
        try{
            Statement statement = con.createStatement();
            int result =  statement.executeUpdate(sql);
            System.out.println("Delete "+result+" Menu");
            statement.close();
        }
        catch (Exception e){
            System. out. println ("Error deleting menu. .. ");
            System.out.println (e) ;
        }
        dbCon.closeConnection();
    }
}
