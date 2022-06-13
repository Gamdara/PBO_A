/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.PesawatDAO;
import java.util.List;
import model.Pesawat;

/**
 *
 * @author Gde Rama Vedanta Yudhistira \n 200710735
 */
public class PesawatControl {
    private PesawatDAO dDao = new PesawatDAO();
    
    public void insertDataPesawat(Pesawat d){
        dDao.insertPesawat(d);
    }
    
    public Pesawat searchPesawat(int noInduk){
        Pesawat d = null;
        d = dDao.searchPesawat(noInduk);
        return d;
    }
    
    public void updateDataPesawat(Pesawat d, int noInduk){
        dDao.updatePesawat(d, noInduk);
    }
    
    public void deleteDataPesawat(int noInduk){
        dDao.deletePesawat(noInduk);
    }
    
    public List<Pesawat> showListPesawat(){
        List<Pesawat> dataPesawat = dDao.showPesawat();
        return dataPesawat;
    }
    
    public List<Pesawat> showListPesawat(String key){
        List<Pesawat> dataPesawat = dDao.showPesawat(key);
        return dataPesawat;
    }
    
    public List<Pesawat> showListPesawat(String nasal, String tujuan, String key){
        List<Pesawat> dataPesawat = dDao.showPesawat(nasal, tujuan,key);
        return dataPesawat;
    }
    
    
}
