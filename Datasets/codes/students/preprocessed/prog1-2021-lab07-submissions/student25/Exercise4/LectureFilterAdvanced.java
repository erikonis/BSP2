public class LectureFilterAdvanced extends FilterAdvanced{
    
    @Override
    public boolean condition(Person person) {
        
        return person.isTeaches();
    }
}
