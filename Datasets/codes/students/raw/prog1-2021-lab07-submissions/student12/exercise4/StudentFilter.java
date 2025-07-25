package exercise4;

import java.util.ArrayList;
import java.util.List;

public class StudentFilter extends Filter{

    public StudentFilter() {
        super();
    }

    @Override
    public List <Person> execute(List <Person> listofpeople) {
        
        List<Person> result = new ArrayList<Person>();

        for(Person person:listofpeople){
            if(person.isTeaches()==false && person.isStudies()==true){
                result.add(person);
            }
        }
        return result;

    }
}
