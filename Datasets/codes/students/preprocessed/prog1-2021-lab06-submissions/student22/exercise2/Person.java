public class Person {
    private String name, passeportNumber;

    public Person(String name, String passeportNumber) {
        this.name = name;
        this.passeportNumber = passeportNumber;
    }

    public String getName() {
        return name;
    }

    public String getPasseportNumber() {
        return passeportNumber;
    }

    public void setPasseportNumber(String passeportNumber) {
        this.passeportNumber = passeportNumber;
    }
}
