package Exercise4b;

public class List {
    protected Person p[];
    protected int c = 0;

    public List(int n) {
        p = new Person[n];
    }

    public List(List n) {
    }

    public void addPerson(Person x) {
        p[c++] = x;
    }

    @Override
    public String toString() {
        String pers = "";
        for (int i = 0; i < c; i++)
            pers = pers + p[i].toString() + "\n";
        return pers;
    }

}
