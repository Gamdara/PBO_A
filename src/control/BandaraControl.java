/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.BandaraDAO;
import java.util.List;
import model.Bandara;

/**
 *
 * @author Gde Rama Vedanta Yudhistira \n 200710735
 */
public class BandaraControl {
    private BandaraDAO dDao = new BandaraDAO();
    
    public void insertDataBandara(Bandara d){
        dDao.insertBandara(d);
    }
    
    public Bandara searchBandara(int noInduk){
        Bandara d = null;
        d = dDao.searchBandara(noInduk);
        return d;
    }
    
    public void updateDataBandara(Bandara d, int noInduk){
        dDao.updateBandara(d, noInduk);
    }
    
    public void deleteDataBandara(int noInduk){
        dDao.deleteBandara(noInduk);
    }
    
    public List<Bandara> showListBandara(){
        List<Bandara> dataBandara = dDao.showBandara();
        return dataBandara;
    }
    
    public List<Bandara> showListBandara(String key){
        List<Bandara> dataBandara = dDao.showBandara(key);
        return dataBandara;
    }
}
