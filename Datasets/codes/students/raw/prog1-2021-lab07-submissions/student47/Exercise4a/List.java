package Exercise4a;

public class List {
    protected Person p[];
    protected int c = 0;

    public List(int n) {
        p = new Person[n];
    }

    public List(List l1) {
        p = new Person[l1.c];
        c = l1.c;
        for (int i = 0; i < c; i++)
            p[i] = l1.p[i];
    }

    public void addPerson(Person x) {
        p[c++] = x;
    }

    public Person[] getPers() {
        return p;
    }

    public void only() {
    }

    public String toString() {
        String pers = "";
        for (int i = 0; i < c; i++)
            pers = pers + p[i].toString() + "\n";
        return "list is:\n" + pers;
    }

}
