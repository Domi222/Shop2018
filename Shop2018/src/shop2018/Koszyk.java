/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shop2018;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class Koszyk {
    private List<Produkt> lista = new ArrayList();
    
    public void dodaj(Produkt p)
    {
        lista.add(p);
    }
    
    public BigDecimal doZaplaty()
    {
        BigDecimal sum = BigDecimal.ZERO;
        for(Produkt p : lista)
        {
            sum = sum.add(p.getCena());
        }
        return sum;
    }
    public String toString()
    {
      return lista.toString() + " "+doZaplaty();
 }
}
