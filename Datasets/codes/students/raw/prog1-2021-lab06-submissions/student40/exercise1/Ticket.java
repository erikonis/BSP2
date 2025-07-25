package exercise1;
import java.util.*;
public class Ticket {
    
    Date emissionDate;
	UUID TicketID;
   public Ticket() {
	emissionDate = new Date();
	TicketID = UUID.randomUUID();
   }
   public Date GetEmissionDate() {
        return emissionDate ;
   }
   public UUID GetTicketID() {
        return TicketID ;
   }
   public double GetTicketCost() {
 	Pavilion pavObj = new Pavilion(); //inheritance
        ArrayList<Double> price = new ArrayList<Double>(5);
   	ArrayList<String> name = new ArrayList<String>(5);
   	price = pavObj.GetPrice();
   	name =  pavObj.GetName();
	double cost=0;
	for(int j=0; j<price.size(); j++)
        {
	if(j < 3) {
		cost += price.get(j);
 	}
	else {
		cost += price.get(j) * 0.7; 
		}
	}
double roundedcost = Math.round(cost); //round decimals
	return roundedcost;
   }
   public static void main(String[] args){
        Ticket myObj = new Ticket();
	System.out.println("— Welcome to Luxembourg History Museum —");
 	System.out.println("TicketID: " + myObj.GetTicketID()); 
  	System.out.println("Date: " + myObj.GetEmissionDate());
      	Pavilion pavlstObj = new Pavilion();
	System.out.println("You can visit: " + pavlstObj.GetName());
      	System.out.println("Total cost is EUR" + myObj.GetTicketCost());

   }
}

