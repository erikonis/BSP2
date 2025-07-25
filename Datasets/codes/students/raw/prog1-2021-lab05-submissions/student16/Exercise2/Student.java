package Exercise2;

public class Student {
    
    private String firstname, lastname;

    public Student(String firstname, String lastname)
    {
        this.firstname= firstname;
        this.lastname= lastname;
    }

    @Override
    public String toString() {
        return firstname + " " + lastname;
    } 

}
