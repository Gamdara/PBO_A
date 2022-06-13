/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.PesananDAO;
import java.util.List;
import model.Pesanan;

/**
 *
 * @author Gde Rama Vedanta Yudhistira \n 200710735
 */
public class PesananControl {
    private PesananDAO dDao = new PesananDAO();
    
    public void insertDataPesanan(Pesanan d){
        dDao.insertPesanan(d);
    }
    
    public Pesanan searchPesanan(int noInduk){
        Pesanan d = null;
        d = dDao.searchPesanan(noInduk);
        return d;
    }
    
    public void updateDataPesanan(Pesanan d, int noInduk){
        dDao.updatePesanan(d, noInduk);
    }
    
    public void deleteDataPesanan(int noInduk){
        dDao.deletePesanan(noInduk);
    }
    
    public List<Pesanan> showListPesanan(){
        List<Pesanan> dataPesanan = dDao.showPesanan();
        return dataPesanan;
    }
    
    public List<Pesanan> showListPesanan(String key){
        List<Pesanan> dataPesanan = dDao.showPesanan(key);
        return dataPesanan;
    }
}
