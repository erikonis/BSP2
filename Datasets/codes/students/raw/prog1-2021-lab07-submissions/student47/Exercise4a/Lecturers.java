package Exercise4a;

public class Lecturers extends List {

    public Lecturers(List l1) {
        super(l1);
    }

    @Override
    public void only() {
        for (int i = 0; i < c; i++)
            if (p[i].getTeaches() == false || p[i].getStudies() == true) {
                for (int j = i; j < c - 1; j++)
                    p[j] = p[j + 1];
                c--;
                i--;
            }
        System.out.print("Only lecturers ");
    }

    @Override
    public String toString() {
        String pers = "";
        for (int i = 0; i < c; i++)
            pers = pers + p[i].toString() + "\n";
        return "list is:\n" + pers;
    }

}
