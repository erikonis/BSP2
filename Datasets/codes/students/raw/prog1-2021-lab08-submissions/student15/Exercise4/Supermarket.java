package Exercise4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Supermarket {
    
    private Map<LocalDate, List<LoyaltyCard>> map = new HashMap<LocalDate, List<LoyaltyCard>>();
    private ArrayList<LoyaltyCard> list = new ArrayList<>();

    public void buy(LoyaltyCard card, int amount)
    {
        card.setPoints(card.getPoints() + (int)(amount*0.1));
        list.add(card);
        map.put(LocalDate.now(), list);
    }

    public void redeem(LoyaltyCard card, int amount)
    {
        if(map.containsKey(LocalDate.now()) && map.get(LocalDate.now()).contains(card))
        {
            if(card.getPoints()>=amount)
            {
                card.setPoints(card.getPoints()-amount);
            }
        }        
    }


    
}
