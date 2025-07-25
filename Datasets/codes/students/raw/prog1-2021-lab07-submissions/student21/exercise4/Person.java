package exercise4;

public class Person {
    private String name;
    private boolean studies;
    private boolean teaches;
    private int birthyear;
    private int birthmonth;
    private int birthday;

    public Person(String name, boolean studies, boolean teaches, int birthyear, int birthmonth, int birthday) {
        this.name = name;
        this.studies = studies;
        this.teaches = teaches;
        this.birthyear = birthyear;
        this.birthmonth = birthmonth;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getBirthyear() {
        return birthyear;
    }

    public void setBirthyear(int birthyear) {
        this.birthyear = birthyear;
    }

    public int getBirthmonth() {
        return birthmonth;
    }

    public void setBirthmonth(int birthmonth) {
        this.birthmonth = birthmonth;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Person [birthday=" + birthday + ", birthmonth=" + birthmonth + ", birthyear=" + birthyear + ", name="
                + name + ", studies=" + studies + ", teaches=" + teaches + "]";
    }

    
}
