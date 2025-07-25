package lu.uni.programming1.lab7.exercise4;

public class PersonList {

    // The number of last person added in the list = i
    int i=0;

    private Person [] personArray;

    public PersonList(int size) {
        personArray = new Person [size];
    }

    public Person[] getPersonList() {
        return personArray;
    }

    public void addPerson (Person person) {
        personArray[i] = person;
        i++;
    }

    // The number of the 'nth' person in the list = j

    public Person getOnePerson (int j){
        return personArray[j];
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < personArray.length; i++) {
            if(personArray[i]!=null){
                s += personArray[i];
            }
        }
        return s;
    }
}
