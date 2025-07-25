package lu.uni.programming1.lab7.exercise4;

public class Main {
  public static void main(String[] args) {
    Person p1 = new Person("Cierra", "No", "Yes", 34);
    Person p2 = new Person("Alden", "Yes", "Yes", 23);
    Person p3 = new Person("Thomas", "No", "Yes", 56);
    Person p4 = new Person("Miranda", "No", "Yes", 47);
    Person p5 = new Person("Brandy", "Yes", "No", 22);
    Person p6 = new Person("Alvaro", "No", "Yes", 58);
    Person p7 = new Person("Maggie", "Yes", "No", 20);
    //Person p8 = new Person(name, studies, teaches, age)

    Person[] People = {p1,p2,p3,p4,p5,p6,p7};

    AgeFilter junior = new AgeFilter(18, 27);
    AgeFilter middle = new AgeFilter(28, 54);
    AgeFilter senior = new AgeFilter(55, 123);

    System.out.println("\nJunior: "+junior);
    Person[] juniorfilter = junior.myFilter(People);
    for (int i = 0; i < juniorfilter.length; i++) {
      System.out.println(juniorfilter[i].toString());
    }

    System.out.println("\nMiddle: "+middle);
    Person[] middlefilter = middle.myFilter(People);
    for (int i = 0; i < middlefilter.length; i++) {
      System.out.println(middlefilter[i].toString());
    }
    System.out.println("\nSenior: "+senior);
    Person[] seniorfilter = senior.myFilter(People);
    for (int i = 0; i < seniorfilter.length; i++) {
      System.out.println(seniorfilter[i].toString());
    }

  }
}
