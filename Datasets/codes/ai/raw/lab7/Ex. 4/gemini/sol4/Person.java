// Person.java
public class Person {
    private String name;
    private int age;
    private boolean isLecturer;
    private boolean isStudent;

    public Person(String name, int age, boolean isLecturer, boolean isStudent) {
        this.name = name;
        this.age = age;
        this.isLecturer = isLecturer;
        this.isStudent = isStudent;
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
        return isStudent && isLecturer;
    }

    @Override
    public String toString() {
        String roles = "";
        if (isLecturer) roles += "Lecturer";
        if (isStudent) roles += (roles.isEmpty() ? "" : ", ") + "Student";
        if (roles.isEmpty()) roles = "Other";
        return String.format("Name: %s, Age: %d, Role(s): %s", name, age, roles);
    }
}