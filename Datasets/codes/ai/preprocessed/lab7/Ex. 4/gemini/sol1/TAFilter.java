public class TAFilter extends RoleFilter {
    @Override
    protected boolean shouldExclude(Person person) {
        return person.isTA();
    }
}