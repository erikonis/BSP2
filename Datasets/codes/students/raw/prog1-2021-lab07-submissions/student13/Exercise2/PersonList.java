package Exercise2;

public class PersonList {
    
    protected int size;
    protected Person[] persons;
    protected int counter;

    public PersonList(int size) {
        this.size = size;
        this.persons = new Person[size];
    }

    public void add(Person p)
    {
        if(counter<size)
        {
            persons[counter] = p;
            counter++;
        }
    }

    public void clear()
    {
        persons= new Person[persons.length];
    }

    public Person get(int i)
    {
        return persons[i];
    }

    public void printAll()
    {
        int i=0;
        while(persons[i]!=null)
        {
            System.out.println(persons[i].toString());
            i++;
        }
    }

    public PersonList filter(Filter filter) {
        Person[] subset= filter.filter(persons);
        PersonList personList = new PersonList(subset.length);
        for(Person person : subset)
        {
            personList.add(person);
        }
        return personList;
    }

}
