import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Orderlist {
    String customername;
    Inventor inventor;
    List<Inventor> mylist = new ArrayList<Inventor>();

    

    public Orderlist(String customername){
        this.customername = customername;
    }

    public String getCustomername() {
        return customername;
    }
    public void addItem(Inventor order){
        mylist.add(order);
    }

    public void order() {
        Set<Inventor> hashlist = new HashSet<Inventor>(mylist);
        int counter = 0;
        double total = 0;
        for (Inventor inventor : hashlist) {
            total += inventor.getAmountprice();
        }
        System.out.println("Order list for " + customername + ". You ordered " + mylist.size() + " different products. Total cost is: " + total + " Euro");
        for (Inventor inventor : hashlist) {
            ++counter;
            System.out.println("\t" + counter + ". Order : " + inventor.getAmount() + " " + inventor.getName() + " x " + inventor.getUnitprice() + " Euro = " + inventor.getAmountprice() + " Euro");
        }
        
    }
}
