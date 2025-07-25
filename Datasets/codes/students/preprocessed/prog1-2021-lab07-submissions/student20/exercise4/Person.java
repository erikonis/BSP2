public class Person {
    private String name, study, teacher;
    private int birthYear, birthMonth, birthDay;

    public Person(String name, int birthYear, int birthMonth, int birthDay, String study, String teacher) {
        this.name = name;
        this.birthYear = birthYear;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.study = study;
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public String getStudies() {
        return study;
    }

    public String getTeachers() {
        return teacher;
    }

    public int getBirthYears() {
        return birthYear;
    }

    public int getBirthMonths() {
        return birthMonth;
    }

    public int getBirthDays() {
        return birthDay;
    }

}
