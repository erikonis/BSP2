public class Person {
    private final String name;
    private final int age;
    private final boolean teaches;
    private final boolean studies;
    
    public Person(String name, int age, boolean teaches, boolean studies) {
        this.name = name;
        this.age = age;
        this.teaches = teaches;
        this.studies = studies;
    }
    
    public String getName() { return name; }
    public int getAge() { return age; }
    public boolean teaches() { return teaches; }
    public boolean studies() { return studies; }
    
    @Override
    public String toString() {
        return String.format("%s (%d) %s%s", name, age,
            teaches ? "Teacher" : "",
            studies ? "Student" : "");
    }
}