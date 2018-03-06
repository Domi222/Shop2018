/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shop2018;

import java.math.BigDecimal;

public class Produkt {
    private String nazwa;
    private BigDecimal cena;

    public Produkt(String nazwa, BigDecimal cena) {
        this.nazwa = nazwa;
        this.cena = cena;
    }

    public String getNazwa() {
        return nazwa;
    }

    public BigDecimal getCena() {
        return cena;
    }
    public String toString()
    {
        return nazwa +"("+cena+"zł)";
  
    }
    
}
