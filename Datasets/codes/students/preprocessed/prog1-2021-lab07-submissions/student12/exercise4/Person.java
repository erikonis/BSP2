import java.time.LocalDate;

public class Person{
    private String name;
    private LocalDate birthDate;
    private int birthYear=2000;
    private int birthMonth=5;
    private int birthDay=14;
    private boolean Studies;
    private boolean Teaches;
    
    public Person(String name, int birthYear, int birthMonth, int birthDay, boolean Studies, boolean Teaches) {
        this.setName(name);
        this.setBirthYear(birthYear);
        this.setBirthMonth(birthMonth);
        this.setBirthDay(birthDay);
        this.setBirthDate(LocalDate.of(birthYear,birthMonth,birthDay));
        this.setStudies(Studies);
        this.setTeaches(Teaches);
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public boolean isTeaches() {
        return Teaches;
    }

    public void setTeaches(boolean teaches) {
        this.Teaches = teaches;
    }

    public boolean isStudies() {
        return Studies;
    }

    public void setStudies(boolean studies) {
        this.Studies = studies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}
