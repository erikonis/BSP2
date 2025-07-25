package lu.uni.programming1.lab7.exercise4;

public class Launcher {
  public static void main(String[] args) {
    Person[] people = { new Person("Cierra", "No", "Yes", 34),
        new Person("Alden", "No", "Yes", 23),
        new Person("Thomas", "No", "Yes", 56),
        new Person("Miranda", "No", "Yes", 47),
        new Person("Brandy", "No", "Yes", 22),
        new Person("Alvaro", "No", "Yes", 58),
        new Person("Maggie", "No", "Yes", 20) };

    AgeFilter junior = new AgeFilter(18, 28);
    Person[] filtered = junior.myFilter(people);
    for (int i = 0; i < filtered.length; i++) {
      System.out.println(filtered[i]);

    }

  }
}
