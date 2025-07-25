package Exercise4b;

public class OnlyList extends List {

    protected Person p[];
    protected int c;
    public static Date today = new Date(2021, 11, 7);

    public OnlyList(int n) {
        super(n);
    }

    public OnlyList(List l1) {
        super(l1);
        p = new Person[l1.c];
        c = l1.c;
        for (int i = 0; i < c; i++)
            p[i] = l1.p[i];
    }

    public void onlyL() {
        for (int i = 0; i < c; i++)
            if (p[i].getTeaches() == false || p[i].getStudies() == true) {
                for (int j = i; j < c - 1; j++)
                    p[j] = p[j + 1];
                c--;
                i--;
            }
        System.out.print("Only lecturers ");

    }

    public void onlyS() {
        for (int i = 0; i < c; i++)
            if (p[i].getTeaches() == true || p[i].getStudies() == false) {
                for (int j = i; j < c - 1; j++)
                    p[j] = p[j + 1];
                c--;
                i--;
            }
        System.out.print("Only Students ");
    }

    public void junior() {
        for (int i = 0; i < c; i++)
            if (p[i].ageInYears(today) >= 28) {
                for (int j = i; j < c - 1; j++)
                    p[j] = p[j + 1];
                c--;
                i--;
            }
        System.out.print("Juniors ");
    }

    public void middle() {
        for (int i = 0; i < c; i++)
            if (p[i].ageInYears(today) < 28 || p[i].ageInYears(today) >= 55) {
                for (int j = i; j < c - 1; j++)
                    p[j] = p[j + 1];
                c--;
                i--;
            }
        System.out.print("Middles ");
    }

    public void senior() {
        for (int i = 0; i < c; i++)
            if (p[i].ageInYears(today) < 55) {
                for (int j = i; j < c - 1; j++)
                    p[j] = p[j + 1];
                c--;
                i--;
            }
        System.out.print("Seniors ");
    }

    public void bothTA() {
        for (int i = 0; i < c; i++)
            if (p[i].getTeaches() == false || p[i].getStudies() == false) {
                for (int j = i; j < c - 1; j++)
                    p[j] = p[j + 1];
                c--;
                i--;
            }
        System.out.print("TAs ");
    }

    @Override
    public String toString() {
        String pers = "";
        for (int i = 0; i < c; i++)
            pers = pers + p[i].toString() + "\n";
        return "list is:\n" + pers;
    }

}
