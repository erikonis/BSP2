package lu.uni.programming1.lab7.exercise4;

import java.time.LocalDate;
import java.time.Period;

public class Person {

    private String name;
    private boolean studies;
    private boolean teaches;
    private LocalDate birthday;

    public Person(String name, boolean studies, boolean teaches, LocalDate birthday) {
        this.name = name;
        this.studies = studies;
        this.teaches = teaches;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public boolean isStudying() {
        return studies;
    }

    public boolean isTeaching() {
        return teaches;
    }

    public int getAge() {
        return Period.between(birthday, LocalDate.now()).getYears();
    }
    
}
