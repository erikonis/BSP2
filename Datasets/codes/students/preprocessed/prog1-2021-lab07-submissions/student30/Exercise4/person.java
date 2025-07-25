import java.time.Year;

enum filter {
    Lecturer, Student, TA, Junior, Middle, Senior;
}

public class person {
    private int year, month, date;
    private boolean studies, teaches;
    private String name;

    public person(String name, int year, int month, int date, boolean studies, boolean teaches) {
        this.name = name;
        this.year = year;
        this.month = month;
        this.date = date;
        this.studies = studies;
        this.teaches = teaches;
    }

    public boolean matchFilter(filter appliedFilter) {
        switch (appliedFilter) {
        case Lecturer:
            return teaches == true && studies == false; // This is the filter applied for lecturer
        case Student:
            return teaches == false && studies == true;// This is the filter applied for Students
        case TA:
            return teaches == true && studies == true;// This is the filter applied for TAs
        case Junior:
            return 18 <= getAge() && getAge() < 28;// This is the filter applied for Juniors
        case Middle:
            return 28 <= getAge() && getAge() < 55;// This is the filter applied for Middle
        case Senior:
            return 55 <= getAge();// This is the filter applied for Seniors
        default:
            return true;
        }
    }

    public int getAge() {
        return Year.now().getValue() - year;
    }

    public void display() {
        System.out.printf("%s %d %d %d %s %s\n ", name, year, month, date, studies ? "yes" : "no",
                teaches ? "yes" : "no");
    }
}