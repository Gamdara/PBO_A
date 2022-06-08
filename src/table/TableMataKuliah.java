/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package table;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.MataKuliah;

/**
 *
 * @author Gde Rama Vedanta Yudhistira \n 200710735
 */
public class TableMataKuliah extends AbstractTableModel {
    private List<MataKuliah> list;

    public TableMataKuliah(List<MataKuliah> list) {
        this.list = list;
    }

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return list.get(rowIndex).getNama();
            case 1:
                return list.get(rowIndex).getDeskripsi();
            case 2:
                return list.get(rowIndex).getDosen().getNama();
            case 3:
                return list.get(rowIndex).getMetode_pembayaran();
            case 4:
                return list.get(rowIndex).getKelas();
            case 5:
                return list.get(rowIndex).getId();
            case 6:
                return list.get(rowIndex).getDosen().getNomorIndukDosen();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0:
                return "Nama Mata Kuliah";
            case 1:
                return "Deskripsi";
            case 2:
                return "Dosen";
            case 3:
                return "Metode Pembelajaran";
            case 4:
                return "Kelas";
            default:
                return null;
        }
    }
    
    
}
