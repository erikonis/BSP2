import java.time.LocalDate;
import java.time.Period;

public class Person {
    private String name;
    private LocalDate birthDay;
    private LocalDate currentDate;
    private boolean studies, teaches;

    public Person(String name, int year, int month, int day, boolean studies, boolean teaches) {
        this.name = name;
        this.birthDay = LocalDate.of(year, month, day);
        this.currentDate = LocalDate.now();
        this.studies = studies;
        this.teaches = teaches;
    }

    public String getName() {
        return this.name;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public boolean isStudies() {
        return this.studies;
    }

    public boolean isTeaches() {
        return this.teaches;
    }

    public int getAge() {
        return Period.between(birthDay, currentDate).getYears();
    }

    public String toString() {
        return  "\nName: " + getName() + "\n" +
                "Birth Day: " + getBirthDay() + "\n" +
                "Studies: " + isStudies() + "\n" +
                "Teaches: " + isTeaches();
    }
}
