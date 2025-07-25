package Exercises.Exercise4;

import java.time.LocalDate;
import java.time.Period;

public class Person
{
    private String firstName;
    private LocalDate birth;
    private boolean studies;
    private boolean teaches;

    public Person(String pFN, LocalDate pD, boolean pStudies, boolean pTeaches)
    {
        firstName = pFN;
        birth = pD;
        studies = pStudies;
        teaches = pTeaches;
    }

    public String getFirstName()
    {
        return firstName;
    }
    
    public LocalDate getBirth()
    {
        return birth;
    }

    public boolean getStudies()
    {
        return studies;
    }

    public boolean getTeaches()
    {
        return teaches;
    }

    public int getYears()
    {
        LocalDate today = LocalDate.now();

        Period tmp = Period.between(birth, today);
        return tmp.getYears();
    }

    public String toString()
    {
        String teacher = "No";
        String studied = "No";
        if(teaches)
        {
            teacher = "Yes";
        }
        if(studies)
        {
            studied = "Yes";
        }
        return firstName + ", " + birth.getYear() + "/" + birth.getMonthValue() + "/" + birth.getDayOfMonth()
        + ", " + studied + ", " + teacher;
    }
}