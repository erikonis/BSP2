package exercise2;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    private String name;
    private LocalDate birthDate;
    private boolean teaches, studies;

    public Person(String name, LocalDate birthDate, boolean teaches, boolean studies) {
        this.name = name;
        this.birthDate = birthDate;
        this.teaches = teaches;
        this.studies = studies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public boolean isTeaches() {
        return teaches;
    }

    public void setTeaches(boolean teaches) {
        this.teaches = teaches;
    }

    public boolean isStudies() {
        return studies;
    }

    public void setStudies(boolean studies) {
        this.studies = studies;
    }

    public int getAge() {
        return Period.between(birthDate,LocalDate.now()).getYears();
    }
}