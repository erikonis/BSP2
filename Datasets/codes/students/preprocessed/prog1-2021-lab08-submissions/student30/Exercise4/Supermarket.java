import java.time.LocalDate;
import java.util.ArrayList;

public class Supermarket {
    
    private LocalDate now;
    private ArrayList<Double> list;

    public Supermarket(){
        now = LocalDate.now();
        list = new ArrayList<>();

    }

    public void addPointsToList(double price){
        list.add(price);
    }
    
    @Override
    public String toString(){
        String printList = "";
        for(double loyaltyPoints : list){
            printList += loyaltyPoints + " \n\t";
        }
        return "The " + now + " have been \n\t" + printList + "loyalty points redeemed \n";
    }
}
