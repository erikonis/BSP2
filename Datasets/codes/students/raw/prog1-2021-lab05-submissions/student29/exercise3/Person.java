package lu.uni.programming1.lab5.exercise3;

public class Person {
    
    private int id;

    private String name;

    Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
