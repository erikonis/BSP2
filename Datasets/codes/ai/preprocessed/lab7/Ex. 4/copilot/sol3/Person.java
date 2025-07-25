public class Person {
    private String name;
    private int age;
    private boolean isLecturer;
    private boolean isStudent;
    private boolean isTA;

    public Person(String name, int age, boolean isLecturer, boolean isStudent, boolean isTA) {
        this.name = name;
        this.age = age;
        this.isLecturer = isLecturer;
        this.isStudent = isStudent;
        this.isTA = isTA;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isLecturer() {
        return isLecturer;
    }

    public boolean isStudent() {
        return isStudent;
    }

    public boolean isTA() {
        return isTA;
    }
}