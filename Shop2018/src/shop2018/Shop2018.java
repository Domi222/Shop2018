/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shop2018;

import java.math.BigDecimal;

/**
 *
 * @author Student
 */
public class Shop2018 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Produkt chleb = new Produkt ("chleb",new BigDecimal("2.2"));
       Produkt maslo = new Produkt ("maslo",new BigDecimal("6.15"));
       Produkt mleko = new Produkt ("mleko",new BigDecimal("2.00"));
       Produkt ser = new Produkt ("ser",new BigDecimal("7.50"));
       
       Koszyk koszyk = new Koszyk();
       koszyk.dodaj(chleb);
       koszyk.dodaj(maslo);
       koszyk.dodaj(maslo);
       koszyk.dodaj(ser);
       koszyk.dodaj(mleko);
       koszyk.dodaj(mleko);
       koszyk.dodaj(mleko);
       
       
       
       
       System.out.println(koszyk.doZaplaty());
       System.out.println(koszyk);
       
       
       
    
       
    }
    
}
