import java.util.*;
public class GroupTicket {
    private Date emissionDate;
	private UUID TicketID;
	private int groupcount = 0;

   public GroupTicket() {
	emissionDate = new Date();
	TicketID = UUID.randomUUID();
   }
   public Date GetEmissionDate() {
        return emissionDate ;
   }
   public UUID GetTicketID() {
        return TicketID ;
   }
   public int GetGroupCount() {
        return groupcount ;
   }
   public void SetGroupCount(int gcnt) {
        groupcount = gcnt ;
   }
   public double GetTicketCost(int gcnt) {
 	Pavilion pavObj = new Pavilion();
        ArrayList<Double> price = new ArrayList<Double>(5);
   	ArrayList<String> name = new ArrayList<String>(5);
	
	   int grpcnt = 0;
 	double discount = 0;
	GroupTicket grpObj = new GroupTicket();
        grpObj.SetGroupCount(gcnt);
        grpcnt = grpObj.GetGroupCount();
   	
	price = pavObj.GetPrice();
   	name =  pavObj.GetName();
	double cost=0;
	for(int j=0; j < price.size(); j++)
 	{
	if (grpcnt >= 6 && grpcnt <= 12)
		{discount = price.get(j) * 0.70;}
	else if (grpcnt >= 12)
		{discount = price.get(j) * 0.60;}
	else 
		{discount = price.get(j);}
	cost +=  discount ;
 	}
	double roundedcost = Math.round(cost);
	return roundedcost;
   	}
   public static void main(String[] args){
        GroupTicket myObj = new GroupTicket();
        System.out.println(" ** Group Ticket **");	
	System.out.println("— Welcome to Luxembourg History Museum —");
 	System.out.println("TicketID: " + myObj.GetTicketID()); 
     	System.out.println("Date: " + myObj.GetEmissionDate());
      	Pavilion pavlstObj = new Pavilion();
	System.out.println("You can visit: " + pavlstObj.GetName());
      	System.out.println("Total Cost is EUR" + myObj.GetTicketCost(1));
   }
}
 

