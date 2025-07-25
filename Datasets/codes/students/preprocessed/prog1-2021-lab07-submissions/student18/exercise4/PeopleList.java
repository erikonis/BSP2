import java.time.LocalDate;

public class PeopleList {
    private Person[] arPerson;

    public PeopleList(int numPeople){
        arPerson = new Person[numPeople];
    }

    public void init(){
        add(new Person("Andreas Earline", LocalDate.of(1948, 2, 16), false, true));
        add(new Person("Theodor Szczepan", LocalDate.of(1971, 5, 1), false, true));
        add(new Person("Loretta Gallo", LocalDate.of(1982, 5, 21), false, true));
        add(new Person("Eugenius José", LocalDate.of(1995, 11, 21), true, false));
        add(new Person("Ecrin Winston", LocalDate.of(1997, 6, 20), true, false));
        add(new Person("Thomas Cornette", LocalDate.of(2002, 7, 20), true, false));
        add(new Person("Nigella Omari", LocalDate.of(1993, 8, 16), true, true));
        add(new Person("Sonnie Partha", LocalDate.of(1991, 10, 4), true, true));
    }

    public void add(Person person){
        int i = 0;
        while(i<arPerson.length && arPerson[i]!=null){
            i++;
        }
        if(arPerson[i]==null){
            arPerson[i]=person;
        }
        else{
            System.out.println("The list is already full !");
        }
    }

    public void applyFilter(Filter filter){
        Person[] newArPerson = new Person[arPerson.length];
        int i=0; 
        int newI=0;
        while(i<arPerson.length){
            if(arPerson[i] != null && filter.matchesFilter(arPerson[i])){
                newArPerson[newI]=arPerson[i];
                newI++;
            }
            i++;
        }

        int count = 0;
        while(count < newArPerson.length && newArPerson[count]!=null){
            count++;
        }
        arPerson = new Person[count];
        
        i=0;
        while(newArPerson[i]!=null){
            arPerson[i] = newArPerson[i];
            i++;
        }
        System.out.println("Applied the " + filter.getName() + " filter.");
    }

    public void print(){
        System.out.println("******************************");
        for (Person person : arPerson) {
            if(person!=null){
                System.out.println(person.toString());
            }
            else{
                System.out.println("------------------------------");
            }
        }
        System.out.println("******************************");
    }    
}
