package lu.uni.programming1.lab7.exercise4;

import java.util.Arrays;

public abstract class Filter {
    
    protected Person persons[];
    private Person filteredPersons[];
    private int arrayLenght;
    private int nextPerson = 0;

    public Filter(Person persons[]) {
        this.persons = persons;
    }

    public abstract void filter();

    public void createArray(int arrayLenght) {
        filteredPersons = new Person[arrayLenght];
    }

    public void addPerson(Person person) {
        filteredPersons[nextPerson++] = person;
    }

    public int getNrOfPersons() {
        return persons.length;
    }

    public Person[] getAllPersons() {
        return persons;
    }

    public Person[] getFilteredPersons() {
        return filteredPersons;
    }

    public int getArrayLenght() {
        return arrayLenght;
    }

    public void incrementArray() {
        arrayLenght += 1;
    }

    public void showResult() {
        for (Person person : filteredPersons) {
            System.out.println(person.getName());
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(filteredPersons);
    }

}
