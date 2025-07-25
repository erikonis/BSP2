import java.time.LocalDate;
import java.util.ArrayList;

public class market {
    ArrayList<card>cards= new ArrayList<>();
    private LocalDate today = LocalDate.now();
    ArrayList<card> redeemcards= new ArrayList<>();

    public void addcards(int number,int points)
    {
        card cardo = new card(points);
        String id="none";
        for(int i=0; i<number;i++)
        {
            if(i==0)
            {
                cards.add(cardo);
                id= cardo.getID();
            }
            else
            {
                card cardd= new card(id);
                cards.add(cardd);
            }
        }
    }

    public void redeemcardsadd()
    {
        
        for(int i=0; i<cards.size();i++)
        {
            if(cards.get(i).getredeemdate().equals(today))
            {
        
                redeemcards.add(cards.get(i));
                
            }
        }

    }

    
}
