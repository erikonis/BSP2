import java.time.LocalDate;

public class Person {
    String name;
    LocalDate birthday;
    boolean studies;
    boolean teaches;

    public Person(String n, LocalDate b, boolean s, boolean t) {
        this.name = n;
        this.birthday = b;
        this.studies = s;
        this.teaches = t;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
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

    public String output() {
        String studies = "";
        String teaches = "";

        if (isStudies()) {
            studies = "Yes";
        } else {
            studies = "No";
        }

        if (isTeaches()) {
            teaches = "Yes";
        } else {
            teaches = "No";
        }
        return getName() + " | " + getBirthday() + " | " + studies + " | " + teaches;
    }
}
