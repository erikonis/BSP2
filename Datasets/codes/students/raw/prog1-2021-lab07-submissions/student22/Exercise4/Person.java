package Exercise4;

public class Person {
    String name; int age; boolean studies; boolean teaches;

    Person(String name, int age, boolean studies, boolean teaches){
        this.name = name;
        this.age = age;
        this.studies = studies;
        this.teaches = teaches;
    }

    String getName(){
        return name;
    }

    int getAge(){
        return age;
    }

    boolean getIfStudies(){
        return studies;
    }

    boolean getIfTeaches(){
        return teaches;
    }
}
