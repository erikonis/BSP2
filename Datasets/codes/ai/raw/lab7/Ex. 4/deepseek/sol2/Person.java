public class Person {
    private final String name;
    private final int age;
    private final boolean isTeacher;
    private final boolean isStudent;

    public Person(String name, int age, boolean isTeacher, boolean isStudent) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        this.name = name;
        this.age = age;
        this.isTeacher = isTeacher;
        this.isStudent = isStudent;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public boolean isTeacher() { return isTeacher; }
    public boolean isStudent() { return isStudent; }

    @Override
    public String toString() {
        return String.format("%s (Age: %d, Teacher: %b, Student: %b)", 
            name, age, isTeacher, isStudent);
    }
}