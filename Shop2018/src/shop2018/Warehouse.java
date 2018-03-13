
package shop2018;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.TreeSet;


public class Warehouse {
    private List<Product> products = new ArrayList();
    public Warehouse(){
       products.add( new Product ("chleb",new BigDecimal("2.2")));
       products.add( new Product ("ser",new BigDecimal("6.15")));
       products.add (new Product ("mleko",new BigDecimal("2.00")));
       products.add (new Product ("olej",new BigDecimal("7.50"))); 
    }
public Collection<Product>productsSortedByName(){
      TreeSet<Product> set = new TreeSet();
      set.addAll(products);
      return set;
}
public TreeSet<Product>productsSortedByPrice(){
    PriceComparator c = new PriceComparator();
    TreeSet<Product> set = new TreeSet(c);
    set.addAll(products);
    return set;
}
public void doOrder(Cart koszyk){
    
    
}

@Override
public String toString(){
    return products.toString();
}
public static void main(String[] args){
    Warehouse w = new Warehouse();
    System.out.println(w);
    System.out.println(w.productsSortedByName());
    System.out.println(w.productsSortedByPrice());
    
}
}


