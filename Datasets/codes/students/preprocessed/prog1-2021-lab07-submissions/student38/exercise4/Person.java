public class Person {
    private String name;
    private int bYear, bMonth, bDay;
    private boolean studies, teaches;
    
    public Person(String name, int bYear, int bMonth, int bDay, boolean studies, boolean teaches) {
        this.name = name;
        this.bYear = bYear;
        this.bMonth = bMonth;
        this.bDay = bDay;
        this.studies = studies;
        this.teaches = teaches;
    }

    public String getName() {
        return name;
    }

    public int getbDay() {
        return bDay;
    }

    public int getbMonth() {
        return bMonth;
    }
    
    public int getbYear() {
        return bYear;
    }

    public boolean isStudies() {
        return studies;
    }

    public boolean isTeaches() {
        return teaches;
    }
    
    // @Override
    // public String toString() {
    //     return name;
    // }
}
