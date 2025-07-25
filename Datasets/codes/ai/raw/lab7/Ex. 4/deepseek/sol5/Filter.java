public interface Filter {
    Person[] apply(Person[] people);
    
    default Filter then(Filter next) {
        return people -> next.apply(this.apply(people));
    }
}