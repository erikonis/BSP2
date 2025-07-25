package lu.uni.programming1.lab7.exercise4;

class Person {
  String name, studies, teaches;
  int age;

  public Person(String name, String studies, String teaches, int age) {
    this.name = name;
    this.studies = studies;
    this.teaches = teaches;
    this.age = age;
  }
  
  public String getName() {
    return name;
  }

  public String getStudies() {
    return studies;
  }

  public String getTeaches() {
    return teaches;
  }

  public int getAge() {
    return age;
  }

  //@Override
  public String toString() {

    return String.format("\nName: "+name+"\nAge: "+age+"\nStudies: "+studies+"\nTeaches: "+teaches);
  }

}
