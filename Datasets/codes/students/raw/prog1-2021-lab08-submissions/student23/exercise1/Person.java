package lu.uni.programming1.lab8.exercise1;

public class Person {
    private String firstname, lastname;
    private Address address;
    private boolean men;
    
    public Person(String firstname, String lastname, Address address, boolean men) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.men = men;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        if (men) {
            return "Mr. " + lastname;
        } else {
            return "Mrs. " + lastname;
        }
    }

    public String getFirstname() {
        return firstname;
    }
    
}
