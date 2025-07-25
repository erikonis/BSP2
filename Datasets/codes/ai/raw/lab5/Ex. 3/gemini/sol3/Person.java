public class Person {
    private int personId;
    private String personName;

    public Person(int id, String name) {
        this.personId = id;
        this.personName = name;
    }

    public int getId() {
        return personId;
    }

    public String getName() {
        return personName;
    }

     @Override
    public String toString() {
        return "Person{" +
                "id=" + personId +
                ", name='" + personName + '\'' +
                '}';
    }
}