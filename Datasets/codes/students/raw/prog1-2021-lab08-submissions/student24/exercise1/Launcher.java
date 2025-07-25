package exercise1;

import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Zip code: ");
        int zipCode = scanner.nextInt();

        System.out.print("House number: ");
        int houseNumber = scanner.nextInt();
        scanner.nextLine(); // consumes the \n from nextInt

        System.out.print("City: ");
        String city = scanner.nextLine();

        System.out.print("Street: ");
        String street = scanner.nextLine();

        System.out.println("Country - '1'(Luxembourg/free), '2'(France/30$), '3'(Belgium/50$), '4'(Germany/40$): ");
        int address = Math.min(4, Math.max(1, scanner.nextInt()));
        scanner.nextLine();

        System.out.print("Purchased item: ");
        String product = scanner.nextLine();

        System.out.println("Choose the shipping method '1'(express/100$) '2'(priority/50$) '3'(classic/10$) '4'(norush/free): ");
        int transportMethod = Math.min(4, Math.max(1, scanner.nextInt()));
        scanner.close();

        int countryPrice = 0;
        String country = "";
        switch (address) {
        case 1:
            country = "Luxembourg";
            countryPrice = Countries.LUXEMBOURG.price;
            break;
        case 2:
            country = "France";
            countryPrice = Countries.FRANCE.price;
            break;
        case 3:
            country = "Belgium";
            countryPrice = Countries.BELGIUM.price;
            break;
        case 4:
            country = "Germany";
            countryPrice = Countries.GERMANY.price;
            break;
        }

        String transportMethodString = "";
        int transportPrice = 0, shippingTime = 0;
        switch (transportMethod) {
        case 1:
            transportMethodString = "Express";
            transportPrice = ShippingMethods.EXPRESS.price;
            shippingTime = ShippingMethods.EXPRESS.transportTime;
            break;
        case 2:
            transportMethodString = "Priority";
            transportPrice = ShippingMethods.PRIORITY.price;
            shippingTime = ShippingMethods.PRIORITY.transportTime;
            break;
        case 3:
            transportMethodString = "Classic";
            transportPrice = ShippingMethods.CLASSIC.price;
            shippingTime = ShippingMethods.CLASSIC.transportTime;
            break;
        case 4:
            transportMethodString = "Norush";
            transportPrice = ShippingMethods.NORUSH.price;
            shippingTime = ShippingMethods.NORUSH.transportTime;
            break;
        }

        String fullAddress = String.format("%s, %s, %s, %c-%s, %s",houseNumber,street,city,country.charAt(0),zipCode,country);
        String output = String.format("\nName: %s \nAddress: %s \nProduct: %s", name, fullAddress, product);
        output += String.format("\nShipping Method: %s \nShipping fee: %d", transportMethodString, transportPrice);
        output += String.format("\nShipping time: %d Day(s) \nBase price: %d \nTotal price: %d", shippingTime, countryPrice,
                (countryPrice + transportPrice));

        System.out.println(output);
    }

}
