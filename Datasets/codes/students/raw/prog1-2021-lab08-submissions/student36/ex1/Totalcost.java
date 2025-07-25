package ex1;
import ex1.enumShipping.Country;
import ex1.enumShipping.Shipping;

public class Totalcost {
    static int totalcost;
    
    public static int cost(Country country, Shipping shipping) {
        switch (country) {
            case Luxembourg:
                totalcost += 0;
                break;
            case France:
                totalcost += 30;
                break;
            case Belgium:
                totalcost += 50;
                break;
            case Germany:
                totalcost += 40;
            default:
                break;
        }
        switch (shipping) {
            case Express:
                totalcost += 100;
                break;
            case Priority:
                totalcost +=50;
                break;
            case Classic:
                totalcost += 10;
                break;
            case Norush:
                totalcost += 0;
                break;
            default:
                break;
        }

        return totalcost;
        }

    @Override
    public String toString() {
        return "Totalcost []"+totalcost;
    }
        
   
        
}
