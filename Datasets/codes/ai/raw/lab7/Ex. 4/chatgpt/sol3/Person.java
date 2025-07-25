public class Person {
    private final String name;
    private final int age;
    private final boolean studies;
    private final boolean teaches;

    public Person(String name, int age, boolean studies, boolean teaches) {
        this.name = name;
        this.age = age;
        this.studies = studies;
        this.teaches = teaches;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public boolean studies() { return studies; }
    public boolean teaches() { return teaches; }

    @Override
    public String toString() {
        return name + " (age " + age + ", studies=" + studies + ", teaches=" + teaches + ")";
    }
}
