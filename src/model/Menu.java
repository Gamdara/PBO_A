/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Gde Rama Vedanta Yudhistira / 200710735 / PBO A
 */
public class Menu {
    private int id;
    private int nama;

    public Menu(int id, int nama) {
        this.id = id;
        this.nama = nama;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public int getNama() {
        return nama;
    }

    public void setNama(int nama) {
        this.nama = nama;
    }
}
