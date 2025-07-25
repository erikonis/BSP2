
public class TAFilter implements RoleFilter {
    @Override
    public boolean shouldExclude(Person person) {
        return person.isTA();
    }
}