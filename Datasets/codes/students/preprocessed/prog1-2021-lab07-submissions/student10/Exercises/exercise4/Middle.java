public class Middle extends Person {
    Middle(Boolean studies, Boolean teaches, String name, int year, int month, int day)
    {
        super(studies, teaches, name, year, month, day);
    }
    public Boolean getStudies() {
        return super.getStudies();
    }

    public Boolean getTeaches() {
        return super.getStudies();
    }
}
