public abstract class Person {
    private final String name;
    private final int age;
    private final boolean teaches;
    private final boolean studies;

    protected Person(String name, int age, boolean teaches, boolean studies) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        this.name = name;
        this.age = age;
        this.teaches = teaches;
        this.studies = studies;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean teaches() {
        return teaches;
    }

    public boolean studies() {
        return studies;
    }

    @Override
    public String toString() {
        return name + " (Age: " + age + ", Teaches: " + teaches + ", Studies: " + studies + ")";
    }
}