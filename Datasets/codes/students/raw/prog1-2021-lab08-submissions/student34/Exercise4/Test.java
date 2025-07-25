package Exercise4;

import java.util.ArrayList;
import java.util.HashMap;
import java.time.LocalDate;

public class Test {



    public static void main(String[] args) {
        

        ArrayList<Item> items = new ArrayList<>();

        Item bread1kg = new Item(4); 

        Item milk1L = new Item(2.5);

        Item oranges1kg = new Item(5);

        Item water1L = new Item(0.5);

        items.add(bread1kg); items.add(milk1L); items.add(oranges1kg); items.add(water1L);

        double initpoints =10; 

        LoyaltyCard kiki = new LoyaltyCard("8573954DZ73ZBXPOI372378", initpoints);

        LoyaltyCard didi = new LoyaltyCard("983483478DGWEG382834JHW", initpoints);

        LoyaltyCard bibi = new LoyaltyCard("983483478DGWEG382834JHW", initpoints);

        ArrayList<LoyaltyCard> cards = new ArrayList<>();

        cards.add(kiki); cards.add(didi); cards.add(bibi); 


        LocalDate dateObj = LocalDate.now();
        
        String dos = dateObj.toString();

        HashMap<String, ArrayList<LoyaltyCard>> dailyRedeemMap = new HashMap<>();

        dailyRedeemMap.put(dos, cards);

        for (String i : dailyRedeemMap.keySet()) {
            System.out.println("key: " + i + " value: " + dailyRedeemMap.get(i) + " \n");


    }


}  }
