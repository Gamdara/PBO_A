/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author Gde Rama Vedanta Yudhistira \n 200710735
 */
public class BandaraSamaException extends Exception {
    public String message(){
        return "Bandara asal dan tujuan tidak boleh sama";
    }
}
