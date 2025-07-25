import java.util.Scanner;

import Exercises.exercise1.EnumTest.Country;
import Exercises.exercise1.EnumTest.shipmentart;
public class main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
       System.out.println(" Enter the name of the reciepiant: ");
       String name="";
       name+=scanner.nextLine();
       System.out.println("Enter the address of the reciepiant: ");
       String address="";
       address+=scanner.nextLine();
       System.out.println("Enter the item name: ");
       String itemname="";
       itemname+=scanner.nextLine();
       System.out.println("Which country are you sending to (Luxembourg,France,Belgium or Germany) ?: ");
       String countrystring= scanner.next();
       Country country = null;
       if(countrystring.equals("Luxembourg"))
       {
        country= Country.Luxembourg;
       }
       if(countrystring.equals("France"))
       {
           country= Country.France;
       }
       if(countrystring.equals("Belgium"))
       {
           country= Country.Belgium;
       }
       if(countrystring.equals("Germany"))
       {
           country= Country.Germany;
       }
      
       System.out.println("Which shipmentmethod (Express, Priority, Classic or Norush) ?: ");
       String shipmentstring= scanner.next();
       shipmentart shipment= null;
       if(shipmentstring.equals("Express"))
       {
           shipment= shipment.Express;
       }
       if(shipmentstring.equals("Priority"))
       {
           shipment= shipment.Priority;
       }
       if(shipmentstring.equals("Classic"))
       {
           shipment= shipment.Classic;
       }
       if(shipmentstring.equals("Norush"))
       {
           shipment= shipment.Norush;
       }
       
       EnumTest enmu= new EnumTest(country, shipment, name, address, itemname);
       enmu.countryship(country);
       enmu.shipcost(shipment);
       enmu.output();
       
       
       
    }
}
