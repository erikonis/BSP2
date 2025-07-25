package Exercises.exercise2;

public class Student {
    private String firstName;
    private String lastName;

    public Student(String pFirst, String pLast)
    {
        firstName = pFirst;
        lastName = pLast;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String toArray()
    {
        return firstName + " " + lastName;
    }
}
