public class Person {

    String name;
    String passportNumber;

    public Person(String name, String passportNumber) {
        this.name = name;
        this.passportNumber = passportNumber;
    }

    public String getName() {
        return name;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    Person() {
    }

    @Override
    public String toString() {
        return "Name: " + name + "\tPassport ID: " + passportNumber;
    }

}
