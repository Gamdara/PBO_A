/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package table;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Pesanan;

/**
 *
 * @author Gde Rama Vedanta Yudhistira \n 200710735
 */
public class TabelPesanan extends AbstractTableModel {
    private List<Pesanan> list;

    public TabelPesanan(List<Pesanan> list) {
        this.list = list;
    }

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return list.get(rowIndex).getPesawat().getNama();
            case 1:
                return list.get(rowIndex).getNama_pemesan();
            case 2:
                return list.get(rowIndex).getJumlah_penumpang();
            case 3:
                return list.get(rowIndex).getTotal();
            case 4:
                return list.get(rowIndex).getTanggal();
            case 5:
                return list.get(rowIndex).getNo_tiket();
            case 6:
                return list.get(rowIndex).getBagasi();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0:
                return "Pesawat";
            case 1:
                return "Pemesan";
            case 2:
                return "Penumpang";
            case 3:
                return "Total Pesanan";
            case 4:
                return "Tanggal";
            case 5:
                return "No Tiket";
            default:
                return null;
        }
    }
    
    
}
