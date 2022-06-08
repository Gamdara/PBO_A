package control;

import dao.DosenDAO;
import java.util.List;
import model.Dosen;
/**
 *
 * @author Gde Rama Vedanta Yudhistira \n 200710735
 */
public class DosenControl {
    private DosenDAO dDao = new DosenDAO();
    
    public void insertDataDosen(Dosen d){
        dDao.insertDosen(d);
    }
    
    public String showDataDosen(){
        List<Dosen> dataDosen = dDao.showDosen();
        
        String dosenString = "";
        for (int i = 0; i < dataDosen.size(); i++) {
            dosenString = dosenString + dataDosen.get(i).showDataDosen()+"\n";
        }
        return dosenString;
    }
    
    public Dosen searchDosen(String noInduk){
        Dosen d = null;
        d = dDao.searchDosen(noInduk);
        return d;
    }
    
    public void updateDataDosen(Dosen d, String noInduk){
        dDao.updateDosen(d, noInduk);
    }
    
    public void deleteDataDosen(String noInduk){
        dDao.deleteDosen(noInduk);
    }
    
    public List<Dosen> showListDosen(){
        List<Dosen> dataDosen = dDao.showDosen();
        return dataDosen;
    }
}
