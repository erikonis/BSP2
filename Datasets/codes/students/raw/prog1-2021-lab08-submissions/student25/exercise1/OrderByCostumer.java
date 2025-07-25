package exercise1;

import java.util.Scanner;

public class OrderByCostumer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What should we call you? (Mr or Mrs)");
        String mrOrMrs = scanner.next();
        System.out.println("What is your last name?");
        String costumerName = scanner.next();

        System.out.println("In what country do you live?");
        String country = scanner.next();
        if (country.equals("GERMANY") || country.equals("FRANCE") || country.equals("BELGIUM") || country.equals("LUXEMBOURG")){
            System.out.println("In what city do you live?");
            String city = scanner.next();
            System.out.println("In what street do you live?");
            String street = scanner.next();
            System.out.println("What is your house number?");
            int houseNumber = scanner.nextInt();
            System.out.println("What is your zip code?");
            int zipCode = scanner.nextInt();

            System.out.println("What did you order?");
            String order = scanner.next();
            System.out.println("What delivery type do you want to use? (EXPRESS, PRIORITY, CLASSIC or NORUSH)");
            String shippingMethode = scanner.next();

            Country countryClass = new Country(country);
            DeliveryType deliveryType = new DeliveryType(shippingMethode);

            deliveryType.getShippingFee();
            deliveryType.getShippingTime();

            System.out.println("Shipping for " + mrOrMrs + ". " + costumerName + ", (" + street + " "+ houseNumber + ", "
                    + zipCode + ", " + city + ", " + country + "),\n" + "\tItem: " + order + ", \n"
                    + "\t" + deliveryType.toString() + "\tTotal cost: "
                    + (countryClass.getBaseFee() + deliveryType.getShippingFee()) + " EUR");
        }else {
            System.out.println("Delivery not possible.");
            scanner.close();
        }

        scanner.close();
    }
}
