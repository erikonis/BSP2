public class Person{
    private String name;
    private int birthYear;
    private int birthMonth;
    private int birthDay;
    private boolean studies;
    private boolean teaches;
    
    public Person(String name, int birthYear, int birthMonth, int birthDay, boolean studies, boolean teaches) {
        this.name = name;
        this.birthYear = birthYear;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.studies = studies;
        this.teaches = teaches;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    public boolean isStudies() {
        return studies;
    }

    public void setStudies(boolean studies) {
        this.studies = studies;
    }

    public boolean isTeaches() {
        return teaches;
    }

    public void setTeaches(boolean teaches) {
        this.teaches = teaches;
    }

    @Override
    public String toString() {
        return "Person [birthDay=" + birthDay + ", birthMonth=" + birthMonth + ", birthYear=" + birthYear + ", name="
                + name + ", studies=" + studies + ", teaches=" + teaches + "]";
    }
}