import java.util.Arrays;

public class ListOfPeople {

    private Person[] person = new Person[10];

    public void add(String name, boolean studies, boolean teaches, int birthyear, int birthmonth, int birthday) {
        for (int i = 0; i < 10; i++) {
            if (person[i].getName().equals("")) {
                person[i] = new Person(name, studies, teaches, birthyear, birthmonth, birthday);
            }
        }
    }

    public Person getPerson(int index) {
        return person[index];
    }

    public void removeByName(String searchedName) {
        int a = -1;
        int lastPersonPosition = -1;
        for (int i = 0; i < 10; i++) {
            if (person[i].getName().equals(searchedName)) {
                a = i;
            }
        }
        if (a == -1) {
            System.out.println("There isn't anyone with that name in the list.");
        } else {
            for (int i = 0; i < 10; i++) {
                if (!person[i].getName().equals("")) {
                    lastPersonPosition = i;
                } else {
                    i = i + 15;
                }
            }
            person[a] = person[lastPersonPosition];
            person[lastPersonPosition] = new Person("", false, false, 0, 0, 0);
        }
    }

    public void clear() {
        for (int i = 0; i < 10; i++) {
            person[i] = new Person("", false, false, 0, 0, 0);
        }
    }

    @Override
    public String toString() {
        return "ListOfPeople [person=" + Arrays.toString(person) + "]";
    }

}
