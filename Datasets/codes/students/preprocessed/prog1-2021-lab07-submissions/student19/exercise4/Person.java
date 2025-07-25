public class Person{
    private String name;
    private int year,month,day;
    private boolean studies = false;
    private boolean teacher = false;

    public Person(String name, int year, int month, int day, boolean studies, boolean teacher){
        this.name = name;
        this.year = year;
        this.month = month;
        this.day = day;
        this.studies = studies;
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public boolean isStudies() {
        return studies;
    }

    public void setStudies(boolean studies) {
        this.studies = studies;
    }

    public boolean isteacher() {
        return teacher;
    }

    public void setteacher(boolean teacher) {
        this.teacher = teacher;
    }

}
