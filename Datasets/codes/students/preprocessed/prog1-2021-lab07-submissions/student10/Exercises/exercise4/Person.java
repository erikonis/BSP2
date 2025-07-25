import java.time.LocalDate;
import java.time.Period;
import java.util.spi.LocaleNameProvider;
import java.util.ArrayList;

public class Person {
    private Boolean Studies, Teaches;
    private String Name;
    private int year, month, day;
    ArrayList<Person> persons = new ArrayList<>();

    public Person(Boolean studies, Boolean teaches, String name, int year, int month, int day) {
        Studies = studies;
        Teaches = teaches;
        Name = name;
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public Person() {

    }

    public void add(Boolean studies, Boolean teaches, String name, int year, int month, int day) {
        LocalDate start = LocalDate.of(year, month, day);
        LocalDate now = LocalDate.now();
        Period p = Period.between(start, now);
        int age = p.getYears();

        if (age >= 18 && age < 28) {
            Junior junior = new Junior(studies, teaches, name, year, month, day);
            persons.add(junior);
        }

        if (age >= 28 && age < 55) {
            Middle middle = new Middle(studies, teaches, name, year, month, day);
            persons.add(middle);
        }

        if (age >= 55) {
            Senior senior = new Senior(studies, teaches, name, year, month, day);
            persons.add(senior);

        }

    }

    public Boolean getStudies() {
        return Studies;
    }

    public Boolean getTeaches() {
        return Teaches;
    }

    public void lecturerFilter() {

        for (int i = persons.size()-1; i >=0; i--) {
            if (persons.get(i).Teaches.equals(true) && persons.get(i).Studies.equals(false)) {
                print(i);
            }
            else
            {
                persons.remove(i);
            }

        }



    }

    public void studentFilter() {
        for (int i = persons.size()-1; i >=0; i--) {
            if (persons.get(i).Teaches.equals(false) && persons.get(i).Studies.equals(true)) {
                print(i);
            }
            else
            {
                persons.remove(i);
            }
        }
    }

    public void taFilter() {
        for (int i = persons.size()-1; i >=0; i--) {
            if (persons.get(i).Teaches.equals(true) && persons.get(i).Studies.equals(true)) {
                print(i);
            }
            else
            {
                persons.remove(i);
            }
        }
    }

    public void JuniorFilter() {
        
        for (int i = persons.size()-1; i >=0; i--) {
            if (persons.get(i).getClass().getName().equals("Exercises.exercise4.Junior")) {
                print(i);
            }
            else
            {
                persons.remove(i);
            }

        }
    }

    public void MiddleFilter() {
        for (int i = persons.size()-1; i >=0; i--) {
            if (persons.get(i).getClass().getName().equals("Exercises.exercise4.Middle")) {
                print(i);
            }
            else
            {
                persons.remove(i);
            }

        }
    }

    public void SeniorFilter() {
        for (int i = persons.size()-1; i >=0; i--) {
            if (persons.get(i).getClass().getName().equals("Exercises.exercise4.Senior")) {
                print(i);
            }
            else
            {
                persons.remove(i);
            }

        }
    }

    public void print(int i) {
        System.out.println(persons.get(i).Name);
    }

}
