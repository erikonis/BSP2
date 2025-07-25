package Exercise1;

import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want to buy?");
        String item = scanner.next();
        System.out.println("Please enter your shipping method: (Express, Priority, Classic, Norush");
        String shipping = scanner.next().toUpperCase();
        System.out.println("How are you? (only Lastname)" );
        String Name = scanner.next();
        System.out.println("Male or Female?");
        String sexe = scanner.next();
        System.out.println("Please enter your housenumber: ");
        int houseNumber = scanner.nextInt();
        System.out.println("Please enter your Street (with - between words pls) and zip: ");
        String street = scanner.next();
        int zip = scanner.nextInt();
        System.out.println("Please enter your city and country: ");
        String city = scanner.next();
        String country = scanner.next();
        scanner.close();

        
        Adress a = new Adress(Name, sexe, street, houseNumber, zip, city, country.toUpperCase());

        Country c = Country.Nothing;
        switch(country){
            case "Luxembourg" -> c = Country.Luxembourg;
            case "France" -> c = Country.France;
            case "Belgium" -> c = Country.Belgium;
            case "Germany" -> c = Country.Germany;
            default -> System.out.println("Sorry we do not ship to " + country);
        };
        Shipping s = Shipping.Nothing;
        switch(shipping){
            case "EXPRESS" -> s =Shipping.EXPRESS;
            case "PRIORITY" -> s =Shipping.PRIORITY;
            case "CLASSIC" ->s =Shipping.CLASSIC;
            case "NORUSH" ->s =Shipping.NORUSH;
            default -> System.out.println("Sorry we do not use that shipping methode");
        };

        int total =s.getFee() + c.getBasePrice();
        
        System.out.println("Shipping for " + a +"\n\t Item: " + item + "\n\t Shipping method: " + shipping 
        + "["+s.getFee()+" EUR]" + ". Handling in " + s.getDay() + " day(s),\n\t TOTAL cost: " + total + " EUR");
        
    }
}
