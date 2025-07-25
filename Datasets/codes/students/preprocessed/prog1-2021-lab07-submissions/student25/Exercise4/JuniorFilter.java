import java.util.HashSet;
import java.util.Set;

public class JuniorFilter extends Filter{
    @Override
    public Set<Person> doFilter(Set<Person> persons) {
        Set<Person> result = new HashSet<>();
        for (Person person : persons) {
            if (18 <= person.getAge() && person.getAge() < 28) {
                result.add(person);
            }
        } 
        System.out.println(result.size());
        return result;   
    }

}
