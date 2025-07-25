

import java.time.LocalDate;
import java.time.Period;
public abstract class AgeFilter extends Filter {

    private int minAge, maxAge;

    public AgeFilter(int minAge, int maxAge, String name){
        super(name);
        this.minAge = minAge;
        this.maxAge = maxAge;
    }
    
    public boolean matchesFilter(Person person){
        LocalDate currentDate = LocalDate.now();
        int age = Period.between(person.getDate(), currentDate).getYears(); //source : https://stackoverflow.com/questions/1116123/how-do-i-calculate-someones-age-in-java
        System.out.println(age);
        if(age<maxAge && age >= minAge){
            return true;
        }
        return false;
    }
}
