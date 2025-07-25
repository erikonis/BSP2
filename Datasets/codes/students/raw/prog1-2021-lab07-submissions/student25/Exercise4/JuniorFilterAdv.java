package Exercise4;


public class JuniorFilterAdv extends FilterAdvanced{

    @Override
    public boolean condition(Person person) {
        
        return 18 <= person.getAge() && person.getAge() < 28;
    }

}
