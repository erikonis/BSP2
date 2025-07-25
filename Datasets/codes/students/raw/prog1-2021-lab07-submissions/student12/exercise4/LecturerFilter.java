package exercise4;

import java.util.ArrayList;
import java.util.List;

public class LecturerFilter extends Filter {

    public LecturerFilter() {
        super();
    }

    @Override
    public List <Person> execute(List <Person> listofpeople) {
        List<Person> result = new ArrayList<Person>();
        for(Person person:listofpeople){
            if(person.isTeaches()==true && person.isStudies()==false){
                result.add(person);
            }
        }
        return result;

    }
    
}
