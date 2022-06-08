/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.MataKuliahDAO;
import java.util.List;
import model.MataKuliah;
import table.TableMataKuliah;

/**
 *
 * @author Gde Rama Vedanta Yudhistira \n 200710735
 */
public class MataKuliahControl {
    private MataKuliahDAO mkDao = new MataKuliahDAO();
    
    public void insertDataMataKuliah(MataKuliah mk){
        mkDao.insertMataKuliah(mk);
    }
    
    public TableMataKuliah showDataMataKuliah(String query){
        List<MataKuliah> dataMataKuliah = mkDao.showMataKuliah(query);
        TableMataKuliah tableMataKuliah = new TableMataKuliah(dataMataKuliah);
        return tableMataKuliah;
    }
    
    
    public void updateDataMataKuliah(MataKuliah mk){
        mkDao.updateMataKuliah(mk);
    }
    
    public void deleteDataMataKuliah(int id){
        mkDao.deleteMataKuliah(id);
    }
}
