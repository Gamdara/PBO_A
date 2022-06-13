/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package table;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Pesawat;

/**
 *
 * @author Gde Rama Vedanta Yudhistira \n 200710735
 */
public class TabelPesawat extends AbstractTableModel {
    private List<Pesawat> list;

    public TabelPesawat(List<Pesawat> list) {
        this.list = list;
    }

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return list.get(rowIndex).getNama();
            case 1:
                return list.get(rowIndex).getAsal().getNama();
            case 2:
                return list.get(rowIndex).getTujuan().getNama();
            case 3:
                return list.get(rowIndex).getMaskapai();
            case 4:
                return list.get(rowIndex).getKapasitas();
            case 5:
                return list.get(rowIndex).getKelas();
            case 6:
                return list.get(rowIndex).getHarga();
            case 7:
                return list.get(rowIndex).getId();
            case 8:
                return list.get(rowIndex).getAsal().getId();
            case 9:
                return list.get(rowIndex).getTujuan().getId();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0:
                return "Nama Pesawat";
            case 1:
                return "Asal Bandara";
            case 2:
                return "Tujuan Bandara";
            case 3:
                return "Maskapai";
            case 4:
                return "Kapasitas";
            case 5:
                return "Kelas";
            case 6:
                return "Harga";
            
            default:
                return null;
        }
    }
    
    
}
