public class Person {
    private String name;
    private int age;
    private boolean teaches;
    private boolean studies;

    public Person(String name, int age, boolean teaches, boolean studies) {
        this.name = name;
        this.age = age;
        this.teaches = teaches;
        this.studies = studies;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeaches() {
        return teaches;
    }

    public boolean isStudies() {
        return studies;
    }
}
