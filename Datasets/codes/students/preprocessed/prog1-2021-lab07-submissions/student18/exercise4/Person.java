import java.time.LocalDate;

public class Person {
    private String name;
    private LocalDate date;
    private boolean student;
    private boolean teacher;

    public Person(String name, LocalDate date, boolean student, boolean teacher) {
        this.name = name;
        this.date = date;
        this.student = student;
        this.teacher = teacher;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public boolean isStudent() {
        return student;
    }

    public void setStudies(boolean student) {
        this.student = student;
    }

    public boolean isTeacher() {
        return teacher;
    }

    public void setTeaches(boolean teacher) {
        this.teacher = teacher;
    }
    
    public String toString(){
        return name + " - " + date.getYear() + "/" + date.getMonth() + "/" + date.getDayOfMonth() + " - " + "Is a student ? : " + student + " - " + "Is a teacher ? : " + teacher;    }
}
