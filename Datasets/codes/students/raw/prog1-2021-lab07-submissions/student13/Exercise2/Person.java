package Exercise2;

public class Person {
    
    private String name;
    private int year, month, day;
    private boolean studies, teaches;

    public Person(String name, int year, int month, int day, boolean studies, boolean teaches) {
        this.name = name;
        this.year = year;
        this.month = month;
        this.day = day;
        this.studies = studies;
        this.teaches = teaches;
    }

    public int getAge()
    {
        return 2021-year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public boolean isStudies() {
        return studies;
    }

    public boolean isTeaches() {
        return teaches;
    }

    @Override
    public String toString() {
        return "Person [day=" + day + ", month=" + month + ", name=" + name + ", studies=" + studies + ", teaches="
                + teaches + ", year=" + year + "]";
    }
}
