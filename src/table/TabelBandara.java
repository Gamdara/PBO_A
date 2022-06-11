/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package table;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Bandara;

/**
 *
 * @author Gde Rama Vedanta Yudhistira \n 200710735
 */
public class TabelBandara extends AbstractTableModel {
    private List<Bandara> list;

    public TabelBandara(List<Bandara> list) {
        this.list = list;
    }

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return list.get(rowIndex).getId();
            case 1:
                return list.get(rowIndex).getNama();
            case 2:
                return list.get(rowIndex).getKota();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0:
                return "ID";
            case 1:
                return "Nama Bandara";
            case 2:
                return "Kota";
            default:
                return null;
        }
    }
    
    
}
