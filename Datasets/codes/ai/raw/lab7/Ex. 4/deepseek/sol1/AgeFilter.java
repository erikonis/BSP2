package model.filters;

import model.Person;

public abstract class AgeFilter implements Filter {
    protected final int minAge;
    protected final int maxAge;
    
    protected AgeFilter(int minAge, int maxAge) {
        this.minAge = minAge;
        this.maxAge = maxAge;
    }
    
    @Override
    public boolean test(Person person) {
        return person.getAge() >= minAge && person.getAge() <= maxAge;
    }
}