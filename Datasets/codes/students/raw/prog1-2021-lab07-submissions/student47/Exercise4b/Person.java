package Exercise4b;

public class Person {

    private String name;
    private Date birthday;
    private Boolean studies, teaches;

    public Person(String name, Date birthday, Boolean studies, Boolean teaches) {
        this.name = name;
        this.birthday = birthday;
        this.studies = studies;
        this.teaches = teaches;
    }

    public int ageInYears(Date today) {
        if (today.getM() >= birthday.getM())
            if (today.getD() >= birthday.getD())
                return today.getY() - birthday.getY();
        return today.getY() - birthday.getY() - 1;

    }

    public String getName() {
        return name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public Boolean getStudies() {
        return studies;
    }

    public Boolean getTeaches() {
        return teaches;
    }

    @Override
    public String toString() {
        return "Person " + name + " [birthday=" + birthday + ", studies=" + studies + ", teaches=" + teaches + "]";
    }

}
