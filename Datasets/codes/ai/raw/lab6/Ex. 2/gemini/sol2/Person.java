import java.util.Objects;

public class Person {
    private final String name;
    private String passportNumber;

    public Person(String name, String passportNumber) {
        this.name = Objects.requireNonNull(name, "Name cannot be null");
        this.passportNumber = validatePassportNumber(passportNumber);
    }

     private String validatePassportNumber(String passportNumber) {
        if (passportNumber == null || passportNumber.isEmpty()) {
            throw new IllegalArgumentException("Passport number cannot be null or empty.");
        }
        return passportNumber;
    }

    public String getName() {
        return name;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = validatePassportNumber(passportNumber);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(passportNumber, person.passportNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passportNumber);
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", passportNumber='" + passportNumber + '\'' +
                "}";
    }
}
