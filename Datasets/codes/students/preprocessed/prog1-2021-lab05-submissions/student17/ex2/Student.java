//first of all a public class named Student
public class Student {
    //methods
    private String firstName, lastName;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    //returns the firstname of the students
    public String getFirstName() {
        return firstName;
    }
    //set the firstname
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    //returns the last name of the students
    public String getLastName() {
        return lastName;
    }
    //set the lastname
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    //overriding the parent class
    @Override
    public String toString() {
        return "Student [firstName=" + firstName + ", lastName=" + lastName + "]";
    }
}
