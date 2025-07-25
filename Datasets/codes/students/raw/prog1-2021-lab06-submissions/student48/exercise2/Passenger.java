package lu.uni.programming1.lab6.exercise2;

import java.util.ArrayList;

public class Passenger extends Person {

    private int loyalityCardNumber;
    private ArrayList<Integer> loyalityNumber = new ArrayList<>();

    public Passenger(String name, String passportNumber) {
        super(name, passportNumber);
        this.loyalityCardNumber = loyalityNumber();
    }

    public int getLoyalityCardNumber() {
        return this.loyalityCardNumber;
    }

    // Generates new LoyalityCard number and checks for duplicate
    public int loyalityNumber(){
        int n;
        do{
            n = (int) (Math.random()*999999999);
        }while(loyalityNumber.contains(n));
        loyalityNumber.add(n);
        return n;
    }

    @Override
    public String toString() {
        return "Passenger:" + 
               super.toString() + 
               "\n\tLoyalitycard Number: " + String.format("%09d",loyalityCardNumber);
    }
}
