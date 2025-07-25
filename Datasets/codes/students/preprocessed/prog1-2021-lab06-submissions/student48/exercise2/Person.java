public class Person {
    private String name, passportNumber;

    public Person(String name, String passportNumber) {
        this.name = name;
        this.passportNumber = passportNumber;
    }

    public String getName() {
        return this.name;
    }

    public String getPassportNumber() {
        return this.passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    @Override
    public String toString() {
        return "\n\tPassportnumber: " + getPassportNumber() + 
               "\n\tName: " + getName();
    }
}
