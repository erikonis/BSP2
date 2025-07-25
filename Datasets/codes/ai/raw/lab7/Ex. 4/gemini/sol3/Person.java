// Person.java
public record Person(String name, int age, boolean isLecturer, boolean isStudent) {
    public boolean isTA() {
        return isStudent && isLecturer;
    }
}