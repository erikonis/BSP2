package scr.lu.uni.programming1.lab5.exercise2;

public class Student {
    private String firstName, lastName;

    public Student(String pFirstName, String pLastName){
        firstName = pFirstName;
        lastName = pLastName;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    @Override
    public String toString(){
        return firstName + " " + lastName;
    }
}
