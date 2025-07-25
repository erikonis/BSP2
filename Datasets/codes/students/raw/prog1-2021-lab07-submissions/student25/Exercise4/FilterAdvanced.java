package Exercise4;

import java.util.HashSet;
import java.util.Set;

public abstract class FilterAdvanced {

    public Set<Person> doFilter(Set<Person> persons) {
        Set<Person> result = new HashSet<>();
        for (Person person : persons) {
            if (this.condition(person)) {
                result.add(person);
            }
        }
        System.out.println(result.size());
        return result;
    }

    // this is the body of the method.
    public abstract boolean condition(Person person);
    // here, there is no body and the class that extends filterAdvanced will be
    // forced to use this method
}

// I do this method for have not to repeat all the time the body of my method
// doFilter
// It is simpler and the extender classes just need to put the conditions of their filter 
