/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import model.Bandara;
import model.Menu;

/**
 *
 * @author Gde Rama Vedanta Yudhistira / 200710735 / PBO A
 */
public class Pesawat {
    private int id;
    private String nama;
    private Bandara asal;
    private Bandara tujuan;
    private String maskapai;
    private int kapasitas;
    private String kelas;

    public Pesawat(int id,String nama, Bandara asal, Bandara tujuan, String maskapai, int kapasitas, String kelas) {
        this.id = id;
        this.nama = nama;
        this.asal = asal;
        this.tujuan = tujuan;
        this.maskapai = maskapai;
        this.kapasitas = kapasitas;
        this.kelas = kelas;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }    
    
    
    public void setAsal(Bandara asal) {
        this.asal = asal;
    }

    public Bandara getAsal() {
        return asal;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getKelas() {
        return kelas;
    }

    public void setMaskapai(String maskapai) {
        this.maskapai = maskapai;
    }

    public String getMaskapai() {
        return maskapai;
    }

    public void setTujuan(Bandara tujuan) {
        this.tujuan = tujuan;
    }

    public Bandara getTujuan() {
        return tujuan;
    }
    
    
    
}
