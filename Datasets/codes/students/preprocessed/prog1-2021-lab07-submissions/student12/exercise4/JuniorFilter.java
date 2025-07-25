import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class JuniorFilter extends Filter{

    private LocalDate date;

    public JuniorFilter() {
        super();
        this.date = LocalDate.now();
    }

    @Override
    public List <Person> execute(List <Person> listofpeople) {
        List<Person> result = new ArrayList<Person>();
        for(Person person:listofpeople){
            long age = ChronoUnit.YEARS.between(person.getBirthDate(), date);
            if(age>=18 && age<28){
                result.add(person);
            }
        }
        return result;

    }
    
}
