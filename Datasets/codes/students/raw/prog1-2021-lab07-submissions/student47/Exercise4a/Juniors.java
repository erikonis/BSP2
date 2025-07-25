package Exercise4a;

public class Juniors extends List {

    public static Date today = new Date(2021, 11, 7);

    public Juniors(List l1) {
        super(l1);
    }

    @Override
    public void only() {
        for (int i = 0; i < c; i++)
            if (p[i].ageInYears(today) >= 28) {
                for (int j = i; j < c - 1; j++)
                    p[j] = p[j + 1];
                c--;
                i--;
            }
        System.out.print("Juniors ");
    }

    @Override
    public String toString() {
        String pers = "";
        for (int i = 0; i < c; i++)
            pers = pers + p[i].toString() + "\n";
        return "list is:\n" + pers;
    }

}
