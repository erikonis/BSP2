import java.time.LocalDate;
import java.time.Period;

public class Person {
    private String name;
    private LocalDate birthDate;
    private boolean studies;
    private boolean teaches;

    public Person(String name, LocalDate birthdDate, boolean studies, boolean teaches)
    {
        this.name = name;
        this.birthDate = birthdDate;
        this.studies = studies;
        this.teaches = teaches;
    }

    public int getAge() {return Period.between(birthDate, LocalDate.now()).getYears();}
    public String getName() {return name;}
    public boolean getStudies() {return studies;}
    public boolean getTeaches() {return teaches;}

    public Filters getAgeGroup()
    {   
        if(getAge()<28&&getAge()>=18) return Filters.Junior;
        if(getAge()<55&&getAge()>=28) return Filters.Middle;
        if(getAge()>=55) return Filters.Senior;
        else return null;
    }
}
