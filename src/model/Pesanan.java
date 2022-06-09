/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Gde Rama Vedanta Yudhistira / 200710735 / PBO A
 */
public class Pesanan {
    private int id;
    private Pesawat pesawat;
    private String nama_pemesan;
    private int jumlah_penumpang;
    private int total;
    private String tanggal;
    private String no_tiket;
    private int bagasi;

    public Pesanan(int id, Pesawat pesawat, String nama_pemesan, int jumlah_penumpang, int total, String tanggal, String no_tiket, int bagasi) {
        this.id = id;
        this.pesawat = pesawat;
        this.nama_pemesan = nama_pemesan;
        this.jumlah_penumpang = jumlah_penumpang;
        this.total = total;
        this.tanggal = tanggal;
        this.no_tiket = no_tiket;
        this.bagasi = bagasi;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setJumlah_penumpang(int jumlah_penumpang) {
        this.jumlah_penumpang = jumlah_penumpang;
    }

    public int getJumlah_penumpang() {
        return jumlah_penumpang;
    }

    public void setNama_pemesan(String nama_pemesan) {
        this.nama_pemesan = nama_pemesan;
    }

    public String getNama_pemesan() {
        return nama_pemesan;
    }

    public void setNo_tiket(String no_tiket) {
        this.no_tiket = no_tiket;
    }

    public String getNo_tiket() {
        return no_tiket;
    }

    public void setPesawat(Pesawat pesawat) {
        this.pesawat = pesawat;
    }

    public Pesawat getPesawat() {
        return pesawat;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getTotal() {
        return total;
    }

    public int getBagasi() {
        return bagasi;
    }

    public void setBagasi(int bagasi) {
        this.bagasi = bagasi;
    }
    
    
}
