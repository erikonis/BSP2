import java.time.Year;

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

    public boolean matchFilter(String filter) {
        switch (filter) {
        case "Lecturer":
            return teaches == true && studies == false; 
        case "Student":
            return teaches == false && studies == true;
        case "TA":
            return teaches == true && studies == true;
        case "Junior":
            return 18 <= getAge() && getAge() < 28;
        case "Middle":
            return 28 <= getAge() && getAge() < 55;
        case "Senior":
            return 55 <= getAge();
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