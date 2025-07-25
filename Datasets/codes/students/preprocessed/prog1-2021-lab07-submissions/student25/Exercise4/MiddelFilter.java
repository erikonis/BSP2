import java.util.HashSet;
import java.util.Set;

public class MiddelFilter extends Filter {
    
    public MiddelFilter(){

    }
    
    @Override
    public Set<Person> doFilter(Set<Person> persons) {
        Set<Person> result = new HashSet<>();
        for (Person person : persons) {
            if (28 <= person.getAge() && person.getAge() < 55) {
                result.add(person);
            }
        } 
        return result;
    }
}
