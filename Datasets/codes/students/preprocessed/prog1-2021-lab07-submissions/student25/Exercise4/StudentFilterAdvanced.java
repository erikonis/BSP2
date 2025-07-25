
public class StudentFilterAdvanced extends FilterAdvanced {

    @Override
    public boolean condition(Person person) {
        
        return person.isStudies();
    }

}
