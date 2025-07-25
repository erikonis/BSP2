public abstract class Person {
    private final String name;
    private String passportNumber;

    protected Person(String name, String passportNumber) {
        validateName(name);
        validatePassport(passportNumber);
        this.name = name;
        this.passportNumber = passportNumber;
    }

    private void validateName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null or blank");
        }
    }

    private void validatePassport(String passportNumber) {
        if (passportNumber == null || passportNumber.isBlank()) {
            throw new IllegalArgumentException("Passport cannot be null or blank");
        }
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

    @Override
    public String toString() {
        return name + " [Passport: " + passportNumber + "]";
    }
}