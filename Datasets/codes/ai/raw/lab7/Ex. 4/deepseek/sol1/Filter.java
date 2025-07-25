package model.filters;

import model.Person;

public interface Filter {
    boolean test(Person person);
}