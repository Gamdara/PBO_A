/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package table;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Menu;

/**
 *
 * @author Gde Rama Vedanta Yudhistira \n 200710735
 */
public class TabelMenu extends AbstractTableModel {
    private List<Menu> list;

    public TabelMenu(List<Menu> list) {
        this.list = list;
    }

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return list.get(rowIndex).getId();
            case 1:
                return list.get(rowIndex).getNama();
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
                return "Nama Menu";
            default:
                return null;
        }
    }
    
    
}
