import java.util.HashSet;
import java.util.Set;

public class TAFilter extends Filter {

    @Override
    public Set<Person> doFilter(Set<Person> persons) {
        Set<Person> result = new HashSet<>();
        for (Person person : persons) {
            if (person.isStudies() && person.isTeaches()) {
                result.add(person);
            }

        }
        System.out.println(result.size());
        return result;
    }

}
