
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public class Launcher {
    public static void main(String[] args){
        Card c11 = new Card();
        Card c2 = new Card();
        Card c3= new Card();
        Card c12 = new Card(c11);
        Card c32= new Card(c3);

        ArrayList<Card> cards= new ArrayList<>() ;
        cards.add(c11); cards.add(c2); cards.add(c3); cards.add(c12); cards.add(c32);

        c11.buy(1400);
        c2.buy(370);
        c3.buy(200);
        c12.buy(150);
        c32.buy(500);
 
        
        HashMap<LocalDate,ArrayList<Card>> listv2= new HashMap<>();
        listv2.put(LocalDate.now(), new ArrayList<Card>());

        //Not a big fan of mapping, so I also tried using a new class(Data) instead(both work but I understood it better without mapping :D)

        // ArrayList<Card> list= new ArrayList<>();
        // Data d1 = new Data(list);

        // c11.redeem(13, d1);
        // c2.redeem(23, d1);
        // c2.redeem(13, d1);
        // c12.redeem(13, d1);
        // c3.redeem(50, d1);
        //c32.redeem(40,d1);

        c11.redeem(13, listv2);
        c2.redeem(23, listv2);
        c3.redeem(50, listv2);
        c2.redeem(13, listv2);
        c12.redeem(13, listv2);
        c32.redeem(40,listv2);

        printc(cards);

        System.out.println(listv2);
    
        

    }


    static public void printc(ArrayList<Card> c)
    {for(int i=0;i<c.size();i++)
        System.out.println(c.get(i)+" has "+c.get(i).getPoints()+" points");

    }

  

}
