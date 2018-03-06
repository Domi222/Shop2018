/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shop2018;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Koszyk {
    //private List<Produkt> lista = new ArrayList();
    private Map<Produkt,Integer> map=new HashMap();
    public void dodaj(Produkt p)
    {
        
        if(map.containsKey(p))
        {
            int i = map.get(p);
            map.put(p,i+1);
        }else{
                map.put(p, 1);
    }
    }
    public BigDecimal doZaplaty()
    {
        BigDecimal sum = BigDecimal.ZERO;
        for(Produkt p : map.keySet())
        {
            int ilosc = map.get(p);
            sum = sum.add(p.getCena().multiply(new BigDecimal(ilosc)));
        }
        return sum;
    }
    public String toString()
    {
      return map.toString() + " "+doZaplaty();
 }
}
