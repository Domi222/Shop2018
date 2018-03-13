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


public class Cart {
    //private List<Produkt> lista = new ArrayList();
    private Map<Product,Integer> map=new HashMap();
    public void add(Product p)
    {
        
        if(map.containsKey(p))
        {
            int i = map.get(p);
            map.put(p,i+1);
        }else{
                map.put(p, 1);
    }
    }
    public BigDecimal toPay()
    {
        BigDecimal sum = BigDecimal.ZERO;
        for(Product p : map.keySet())
        {
            int ilosc = map.get(p);
            sum = sum.add(p.getPrice().multiply(new BigDecimal(ilosc)));
        }
        return sum;
    }
    public String toString()
    {
      return map.toString() + " "+toPay();
 }
}
