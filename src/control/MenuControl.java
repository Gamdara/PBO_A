/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.MenuDAO;
import java.util.List;
import model.Menu;

/**
 *
 * @author Gde Rama Vedanta Yudhistira \n 200710735
 */
public class MenuControl {
    private MenuDAO dDao = new MenuDAO();
    
    public void insertDataMenu(Menu d){
        dDao.insertMenu(d);
    }
    
    public Menu searchMenu(int noInduk){
        Menu d = null;
        d = dDao.searchMenu(noInduk);
        return d;
    }
    
    public void updateDataMenu(Menu d, int noInduk){
        dDao.updateMenu(d, noInduk);
    }
    
    public void deleteDataMenu(int noInduk){
        dDao.deleteMenu(noInduk);
    }
    
    public List<Menu> showListMenu(){
        List<Menu> dataMenu = dDao.showMenu();
        return dataMenu;
    }
    
    public List<Menu> showListMenu(String key){
        List<Menu> dataMenu = dDao.showMenu(key);
        return dataMenu;
    }
    
    
}
