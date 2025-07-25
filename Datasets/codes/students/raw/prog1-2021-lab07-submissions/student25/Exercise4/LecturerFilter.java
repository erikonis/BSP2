package Exercise4;

import java.util.HashSet;
import java.util.Set;

public class LecturerFilter extends Filter {

    @Override
    public Set<Person> doFilter(Set<Person> persons) {
        Set<Person> result = new HashSet<>();
        for (Person person : persons) {
            if (person.isTeaches()) {
                result.add(person);
            }
        }
        return result;
    }

}
