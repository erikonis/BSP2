package Exercise1;
import java.util.Scanner;


public class Test {



public static void main(String[] args) {
    

Item acq = new Item("Acquarium", 100);
Item VR360 = new Item ("VR-360", 0);

Customer[] customers = new Customer[2];

customers[0] = new Customer("Mr. Rothkugel" , "Heustr. 18, 70174, Stuttgart", "Germany", "EXPRESS");

customers[1]  = new Customer("Mr. Topal" , "64, rue Due Parch, 4321, Differdange", "Luxembourg", "NORUSH");

Scanner sc = new Scanner(System.in);


int whoareyou;

System.out.println("Please log in as: ");
System.out.println("1 for Mr. Rothkugel, 2 for Mr. Topal");

whoareyou = sc.nextInt();



if (whoareyou!=1 && whoareyou!=2) {System.out.println("Exiting... "); sc.close(); System.exit(0);};

whoareyou-=1;

String x  = "1";
String y = "2";
String z = "x";


String userchoice ="n";




while (!userchoice.equals(z)) {




System.out.println("Here's what you can buy: Type ");
System.out.println("1 for " + acq.itemname.toString() + " an 2 for " +  VR360.itemname.toString() + " or x to quit. ");
System.out.println("What would you like? ");

userchoice=sc.nextLine();

if (userchoice.equals(x)) {
    
   customers[whoareyou].basket.add(acq); 




      };

if (userchoice.equals(y)) {            customers[whoareyou].basket.add(VR360);





       }; };
     

int customershippingtax =0;

for (CFEE i : CFEE.values()) { if (customers[whoareyou].country.equals(i)) customershippingtax=i.getCFeec();};



System.out.println("Shipping for " + customers[whoareyou].name + " " + customers[whoareyou].address + " " + customers[whoareyou].country);

for ( Item i : customers[whoareyou].basket) System.out.println(i.itemname + " " + i.price + " ");

int totalcost = 0;

for ( Item i : customers[whoareyou].basket) totalcost+=i.price;

totalcost+=customershippingtax;


System.out.println("Shipping method: " + customers[whoareyou].handlingPreference.toString() + " ");

System.out.println("The total cost is: " + totalcost);
       

sc.close();


}


    
}
