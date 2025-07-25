package lu.uni.programming1.lab8.exercise4;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {

        Supermarket Cactus = new Supermarket();
    
        // Schrader Family
        LoyaltyCard SchraderFatherCard = new LoyaltyCard(756890, 0);
        LoyaltyCard SchraderMotherCard = new LoyaltyCard(756890, 0);
    
        // Make Purchase - 1st Day
        Cactus.paid(SchraderMotherCard, 200, LocalDate.of(2021, 11, 22));
        Cactus.paid(SchraderFatherCard, 150, LocalDate.of(2021, 11, 22));
        System.out.println("\n1st day --- Order for purchase : 1)Mother 2)Father"
        + "\nFather :" + SchraderFatherCard + "\tMother :" + SchraderMotherCard);
       

        // Make Purchase - 2nd Day
        Cactus.paid(SchraderMotherCard, 200, LocalDate.of(2021, 11, 23));
        Cactus.paid(SchraderFatherCard, 150, LocalDate.of(2021, 11, 23));
        System.out.println("\n2nd day --- Order for purchase : 1)Mother 2)Father"
        + "\nFather :" + SchraderFatherCard + "\tMother :" + SchraderMotherCard);

        //Make Purchase - 3rd Day
        Cactus.paid(SchraderFatherCard, 300, LocalDate.of(2021, 11, 24));
        Cactus.paid(SchraderMotherCard, 10, LocalDate.of(2021, 11, 24));
        System.out.println("\n3rd day --- Order for purchase : 1)Father 2)Mother"
        + "\nFather :" + SchraderFatherCard + "\tMother :" + SchraderMotherCard +"\n");

    }
    
}
