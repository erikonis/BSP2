package lu.uni.programming1.lab7.Exercise4;

public class Person {
    private String name;
    private int age;
    private boolean studying,teaching;
    
    public Person(String name, int age, boolean studying, boolean teaching) {
        this.name = name;
        this.age = age;
        this.studying = studying;
        this.teaching = teaching;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setBirthYear(int age) {
        this.age = age;
    }

    public boolean isStudying() {
        return studying;
    }

    public void setStudying(boolean studying) {
        this.studying = studying;
    }

    public boolean isTeaching() {
        return teaching;
    }

    public void setTeaching(boolean teaching) {
        this.teaching = teaching;
    }

    @Override
    public String toString() {
        return " "+name; 
    }

 

    

}
