import java.time.LocalDate;
import java.time.Period;

public class Individual {

private String name;
private LocalDate age;
private LocalDate today = LocalDate.now();
private boolean studies;
private boolean teaches;
private int years;


public Individual(String name, int year, int month, int day, boolean studies, boolean teaches) {
    this.name=name;
    this.age=LocalDate.of(year, month, day);
    this.studies=studies;
    this.teaches=teaches;
    this.years=Period.between(age, today).getYears();
}

public int getAge() {
    return years;
}

public boolean GetStudies() {
    return studies;
}

public boolean GetTeaches() {
    return teaches;
}

@Override
public String toString() {
    return name + " / " + age + " / " + studies + " / " + teaches;
}

}
