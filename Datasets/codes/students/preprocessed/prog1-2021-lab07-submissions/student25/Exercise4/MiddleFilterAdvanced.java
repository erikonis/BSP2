public class MiddleFilterAdvanced extends FilterAdvanced {
    
    @Override
    public boolean condition(Person person) {
        
        return (28 <= person.getAge() && person.getAge() < 55);
    }
}
