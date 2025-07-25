import java.time.LocalDate;
import java.time.Period;

public class Person {
    int age,birthYear,birthMonth,birthDay;
    boolean student,teacher;
    String name;

    public Person(String name, int birthYear, int birthMonth, int birthDay, boolean student, boolean teacher) {
        this.name = name;
        this.student = student;
        this.teacher = teacher;
        this.birthYear = birthYear;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;

        LocalDate today = LocalDate.now();
        LocalDate birthDate = LocalDate.of(birthYear,birthMonth,birthDay);

        age = Period.between(birthDate, today).getYears();
    }
}
