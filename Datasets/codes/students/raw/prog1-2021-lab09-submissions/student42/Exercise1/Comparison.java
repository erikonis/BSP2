package lu.uni.programming1.lab9.Exercise1;

import java.util.Comparator;

public class Comparison {
   private Comparator<Item> comparator;
   private String criteria,order;


   Comparison(Comparator<Item> comparator, String criteria,String order)
   {this.comparator= comparator;
this.criteria= criteria;
this.order=order;}

public Comparator<Item> getComparator() {
    return comparator;
}

public String getCriteria() {
    return criteria;
}

public String getOrder(){
    return order;
}


    
}
