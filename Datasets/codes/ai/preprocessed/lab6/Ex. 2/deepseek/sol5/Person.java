public abstract class Person {
    private final String name;
    private String passportNumber;

    protected Person(String name, String passportNumber) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        if (passportNumber == null || passportNumber.trim().isEmpty()) {
            throw new IllegalArgumentException("Passport number cannot be null or empty");
        }

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
        if (passportNumber == null || passportNumber.trim().isEmpty()) {
            throw new IllegalArgumentException("Passport number cannot be null or empty");
        }
        this.passportNumber = passportNumber;
    }

    @Override
    public String toString() {
        return name + " (Passport: " + passportNumber + ")";
    }
}