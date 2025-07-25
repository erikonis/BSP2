public class Person {
    
    private String name;
    private int yearOfBirth, monthOfbirth, dayOfBirth;
    private boolean studies, teaches;

    public Person(String name, int yearOfBirth, int monthOfbirth, int dayOfBirth, boolean studies, boolean teaches) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.monthOfbirth = monthOfbirth;
        this.dayOfBirth = dayOfBirth;
        this.studies = studies;
        this.teaches = teaches;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int getMonthOfbirth() {
        return monthOfbirth;
    }

    public void setMonthOfbirth(int monthOfbirth) {
        this.monthOfbirth = monthOfbirth;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(int dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
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
    public String toString(){
        return "\n" +name + ", " + dayOfBirth + "/" + monthOfbirth + "/" + yearOfBirth 
                + ", student " + studies + ", and/or teacher : " + teaches;
    }
    

}
