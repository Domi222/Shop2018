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
       Product chleb = new Product ("chleb",new BigDecimal("2.2"));
       Product maslo = new Product ("maslo",new BigDecimal("6.15"));
       Product mleko = new Product ("mleko",new BigDecimal("2.00"));
       Product ser = new Product ("ser",new BigDecimal("7.50"));
       
       Cart koszyk = new Cart();
       koszyk.add(chleb);
       koszyk.add(maslo);
       koszyk.add(maslo);
       koszyk.add(ser);
       koszyk.add(mleko);
       koszyk.add(mleko);
       koszyk.add(mleko);
       
       
       
       
       System.out.println(koszyk.toPay());
       System.out.println(koszyk);
       
       
       
    
       
    }
    
}
