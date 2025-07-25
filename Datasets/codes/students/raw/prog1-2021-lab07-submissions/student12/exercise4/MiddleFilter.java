package exercise4;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class MiddleFilter extends Filter {

    private LocalDate date;

    public MiddleFilter() {
        super();
        this.date = LocalDate.now();
    }

    @Override
    public List <Person> execute(List <Person> listofpeople) {
        List<Person> result = new ArrayList<Person>();

        for(Person person:listofpeople){
            long age = ChronoUnit.YEARS.between(person.getBirthDate(), date);
            if(age>=28 && age<55){
                result.add(person);
            }
        }
        return result;

    }
}
