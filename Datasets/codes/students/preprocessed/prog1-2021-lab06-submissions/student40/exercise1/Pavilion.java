import java.util.*;
public class Pavilion {
    private ArrayList<Double>price = new ArrayList<Double>(5);
   private ArrayList<String> name = new ArrayList<String>(5);

// constructor   
   public Pavilion() {
name.add("Pav1");
name.add("Pav2");
name.add("Pav3");
name.add("Pav4");
name.add("Pav5");

price.add(10.00);
price.add(45.00);
price.add(23.00);
price.add(56.99);
price.add(14.00);

   }

// getter
public ArrayList<String> GetName() {
    return name;
}

public ArrayList<Double> GetPrice() {
    return price;
}

// display
public static void main(String[] args){
	Pavilion myObj = new Pavilion();
      	System.out.println("Price: " + myObj.GetPrice());
      	System.out.println("Name: " + myObj.GetName());
   }
}


