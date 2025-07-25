import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public class Card {
    private static int IDc=1000;
    private int ID,nr;
    private double points=0;

    public Card() {
        ID=IDc++;
        nr=1;
    }

    public Card(Card card) {
        ID=card.getID();
        nr=card.getNr()+1;
    }


    public int getID() {
        return ID;
    }

    public int getNr() {
        return nr;
    }

    public double getPoints() {
        return points;
    }


    public void buy(double price)
    {points+=price/10;
        System.out.println("The card ID."+ID+"(number "+nr+") bought things pricing $"+price +" , accumulated points:"+points+"\n");
    }

    //for data class

    public boolean redeem(double amount, Data data)
    {if(amount>points||data.contains(this))
        {System.out.print("Operation impossible!");
        if(amount>points)
        System.out.println(" Not enough points to redeem "+amount+ "!\n");
        else System.out.println("Card ID."+ID+" already used today!\n");
        return false; }
    else
    {points-=amount;
    data.addCard(this);
    System.out.println("Operation successful! "+amount+" points redeemed from your card ID." + ID+" !\n");
    return true;
    } 
    }


    //for map
    public boolean redeem(double amount, HashMap<LocalDate,ArrayList<Card>> data)
    {if(amount>points)
        {System.out.print("Operation impossible!");
        System.out.println(" Not enough points to redeem "+amount+ "! ( You have "+points+" remaining points!)\n");
        return false;}
     else
         {ArrayList<Card> cards= data.get(LocalDate.now());
            boolean exists=false;
        for(int i=0;i<cards.size();i++)
        if(cards.get(i).equals(this))
            exists=true;
        if(exists)
        {System.out.print("Operation impossible!");
        System.out.println("Card ID."+ID+" already used today!\n");
        return false;}
        else
        {points-=amount;
        data.get(LocalDate.now()).add(this);
        System.out.println("Operation successful! "+amount+" points redeemed from your card ID." + ID+" !\n");
        return true;
        } 
    }
    }



    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ID;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Card other = (Card) obj;
        if (ID != other.ID)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Card [ID=" + ID +", number " +nr+"]";
    }


    
    
}
