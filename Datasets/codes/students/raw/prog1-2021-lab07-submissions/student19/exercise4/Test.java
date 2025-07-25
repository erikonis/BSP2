package exercise4;

public class Test {
    public static void main(String[] args) {
        PersonArray pArray = new PersonArray();
        Person a = new Person("Cierra", 1987, 3, 4, false, true);
        Person b = new Person("Aiden", 1998, 5, 12, true, true);
        Person c = new Person("Thomas", 1965, 12, 25, false, true);
        Person d = new Person("Miranda", 1974, 11, 29, false, true);
        Person e = new Person("Brandy", 1999, 6, 20, true, false);
        Person f = new Person("Alvaro", 1963, 2, 18, false, true);
        Person g = new Person("Maggie", 2001, 8, 23, true, false);

        pArray.add(a);
        pArray.add(b);
        pArray.add(c);
        pArray.add(d);
        pArray.add(e);
        pArray.add(f);
        pArray.add(g);

        System.out.println(pArray.TA());
    }
}
