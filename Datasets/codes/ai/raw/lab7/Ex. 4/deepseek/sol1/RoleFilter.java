package model.filters;

import model.Person;

public abstract class RoleFilter implements Filter {
    protected final boolean teaches;
    protected final boolean studies;
    
    protected RoleFilter(boolean teaches, boolean studies) {
        this.teaches = teaches;
        this.studies = studies;
    }
    
    @Override
    public boolean test(Person person) {
        return person.isTeaches() == teaches && person.isStudies() == studies;
    }
}