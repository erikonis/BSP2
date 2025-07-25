package lu.uni.programming1.lab6.exercise2;

import java.util.Random;

public class Person {
    
    protected String name;
    protected String passportNumber;

    public Person(String name, String passportNumber) {
        this.name = name; 
        Random random = new Random();
        this.passportNumber = String.format("%H", random.nextInt());
    }

    public String getName() {
        return name;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    

    


}
