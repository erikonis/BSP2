package Exercise4;

public class SeniorFilterAdvanced extends FilterAdvanced {
    
    @Override
    public boolean condition(Person person) {
        
        return (55 <= person.getAge());
    }
}
