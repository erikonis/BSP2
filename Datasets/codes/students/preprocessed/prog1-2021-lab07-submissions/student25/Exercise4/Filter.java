import java.util.Set;

public abstract class Filter {
    public abstract Set<Person> doFilter(Set<Person> persons);
}
