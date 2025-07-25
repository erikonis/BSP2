package exercise1;
import java.util.*;
public class Museum {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.println("Enter G for Group or I for Individual Ticket: ");
        String TicketType = console.nextLine();
if (TicketType.equals("G"))
{
	System.out.println("Please enter the number of people in your group:");
        int GroupCnt  = console.nextInt();
	GroupTicket myObj = new GroupTicket(); //INHERITANCE
System.out.println("** Group Ticket **");
	System.out.println("— Welcome to Luxembourg History Museum —");
        System.out.println("TicketID: " + myObj.GetTicketID());
        System.out.println("Date: " + myObj.GetEmissionDate());
        Pavilion pavlstObj = new Pavilion();
        System.out.println("You can visit: " + pavlstObj.GetName());
        System.out.println("Total cost is EUR" + myObj.GetTicketCost(GroupCnt));

}
else if(TicketType.equals("I")) //PRINT
{
        Ticket myObj = new Ticket();
        System.out.println("— Welcome to Luxembourg History Museum —");
        System.out.println("TicketID: " + myObj.GetTicketID());
        System.out.println("Date: " + myObj.GetEmissionDate());
        Pavilion pavlstObj = new Pavilion();
        System.out.println("You can visit: " + pavlstObj.GetName());
        System.out.println("Total cost is EUR" + myObj.GetTicketCost());

}
else
{
System.out.println("Not a valid booking, have a good day. ");

}
   }
}
