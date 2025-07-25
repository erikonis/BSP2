public class Students extends List {

    public Students(List l1) {
        super(l1);
    }

    @Override
    public void only() {
        for (int i = 0; i < c; i++)
            if (p[i].getTeaches() == true || p[i].getStudies() == false) {
                for (int j = i; j < c - 1; j++)
                    p[j] = p[j + 1];
                c--;
                i--;
            }
        System.out.print("Only Students ");
    }

    @Override
    public String toString() {
        String pers = "";
        for (int i = 0; i < c; i++)
            pers = pers + p[i].toString() + "\n";
        return "list is:\n" + pers;
    }

}
