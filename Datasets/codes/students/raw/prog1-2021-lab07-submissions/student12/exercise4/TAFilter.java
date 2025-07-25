package exercise4;

import java.util.ArrayList;
import java.util.List;

public class TAFilter extends Filter{
    
    public TAFilter() {
        super();
    }

    @Override
    public List<Person> execute(List <Person> listofpeople) {

        List<Person> result = new ArrayList<Person>();
        
        for(Person person:listofpeople){
            if(person.isTeaches()==true && person.isStudies()==true){
                result.add(person);
            }
        }
        return result;

    }
}
