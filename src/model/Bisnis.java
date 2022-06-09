/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Gde Rama Vedanta Yudhistira / 200710735 / PBO A
 */
public class Bisnis extends Pesawat {
    private Menu menu;

    public Bisnis(int id, Bandara asal, Bandara tujuan, String maskapai, int kapasitas, String kelas,Menu menu) {
        super(id, asal, tujuan, maskapai, kapasitas, kelas);
        this.menu = menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public Menu getMenu() {
        return menu;
    }
    
    
}
