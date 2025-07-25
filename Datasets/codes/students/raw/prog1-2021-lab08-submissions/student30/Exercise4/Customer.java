package Exercise4;

public class Customer {
    private String firstName;
    private String lastName;

    public Customer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString(){
        return "Customer: " + firstName + " " + lastName; 
    }
}
