package exercise4;

public class Person {
    private int bday, bmonth, byear;
    private String name;
    private boolean teaching, studying;

    public Person(int bday, int bmonth, int byear, String name, boolean teaching, boolean studying) {
        this.bday = bday;
        this.bmonth = bmonth;
        this.byear = byear;
        this.name = name;
        this.teaching = teaching;
        this.studying = studying;
    }
    public int getBmonth() {
        return bmonth;
    }
    public void setBmonth(int bmonth) {
        this.bmonth = bmonth;
    }
    public int getByear() {
        return byear;
    }
    public void setByear(int byear) {
        this.byear = byear;
    }
    public int getBday() {
        return bday;
    }
    public void setBday(int bday) {
        this.bday = bday;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public boolean isTeaching() {
        return teaching;
    }
    public void setTeaching(boolean teaching) {
        this.teaching = teaching;
    }
    public boolean isStudying() {
        return studying;
    }
    public void setStudying(boolean studying) {
        this.studying = studying;
    }
    public void displaydata(){
        System.out.println(name+" | "+byear+", "+bmonth+", "+bday+" | "+studying+" | "+teaching);
    }
}
