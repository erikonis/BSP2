public interface Filter {
    Person[] filter(Person[] people);
    default Filter andThen(Filter next) {
        return people -> next.filter(this.filter(people));
    }
}