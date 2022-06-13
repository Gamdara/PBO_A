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
        return 8;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return list.get(rowIndex).getNo_tiket();
            case 1:
                return list.get(rowIndex).getPesawat().getNama();
            case 2:
                return list.get(rowIndex).getPesawat().getAsal().getNama();
            case 3:
                return list.get(rowIndex).getPesawat().getTujuan().getNama();
            case 4:
                return list.get(rowIndex).getNama_pemesan();
            case 5:
                return list.get(rowIndex).getJumlah_penumpang();
            case 6:
                return list.get(rowIndex).getTotal();
            case 7:
                return list.get(rowIndex).getTanggal();
            case 8:
                return list.get(rowIndex).getBagasi();
            case 9:
                return list.get(rowIndex).getId();
            case 10:
                return list.get(rowIndex).getId();
            
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0:
                return "No Tiket";
            case 1:
                return "Pesawat";
            case 2:
                return "Asal";
            case 3:
                return "Tujuan";
            case 4:
                return "Pemesan";
            case 5:
                return "Penumpang";
            case 6:
                return "Total Pesanan";
            case 7:
                return "Tanggal";
            default:
                return null;
        }
    }
    
    
}
