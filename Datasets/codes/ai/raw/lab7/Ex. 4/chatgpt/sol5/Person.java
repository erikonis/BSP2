public class Person {
    private String name;
    private int age;
    private boolean isStudent;
    private boolean isLecturer;

    public Person(String name, int age, boolean isStudent, boolean isLecturer) {
        this.name = name;
        this.age = age;
        this.isStudent = isStudent;
        this.isLecturer = isLecturer;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isStudent() {
        return isStudent && !isLecturer;
    }

    public boolean isLecturer() {
        return isLecturer && !isStudent;
    }

    public boolean isTA() {
        return isStudent && isLecturer;
    }

    @Override
    public String toString() {
        return name + " (Age: " + age + ", Student: " + isStudent + ", Lecturer: " + isLecturer + ")";
    }
}