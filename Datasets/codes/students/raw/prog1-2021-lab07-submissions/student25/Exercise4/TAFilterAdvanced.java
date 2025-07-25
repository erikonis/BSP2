package Exercise4;

public class TAFilterAdvanced extends FilterAdvanced {
    
    @Override
    public boolean condition(Person person) {
        
        return (person.isStudies() && person.isTeaches());
    }
}
