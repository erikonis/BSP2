public class Person {
    private String name;
    private boolean studies;
    private boolean teaches;
    private int age;

    public Person(String name, boolean studies, boolean teaches, int age) {
        this.name = name;
        this.studies = studies;
        this.teaches = teaches;
        this.age = age;
    }

    public boolean studies() { return studies; }
    public boolean teaches() { return teaches; }
    public int getAge() { return age; }
    public String getName() { return name; }

    @Override
    public String toString() {
        return name + " (Age: " + age + ", Studies: " + studies + ", Teaches: " + teaches + ")";
    }
}
