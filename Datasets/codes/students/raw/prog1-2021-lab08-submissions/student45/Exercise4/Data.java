package Exercise4;

import java.time.LocalDate;
import java.util.ArrayList;

public class Data {
    private LocalDate date;
    private ArrayList<Card> list= new ArrayList<>();

    public Data(ArrayList<Card> list) {
        this.list = list;
        date= LocalDate.now();
    }

    public LocalDate getDate() {
        return date;
    }

    public ArrayList<Card> getList() {
        return list;
    }

    public void addCard(Card card)
    {list.add(card);}

    public boolean contains(Card card)
    {for(int i=0;i<list.size();i++)
        if(list.get(i).getID()==card.getID())
        return true;
    return false;
    }

    @Override
    public String toString() {
        return "Data [date=" + date + ", list=" + list + "]";
    }

   

    

    
    
}
