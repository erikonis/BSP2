package Exercise2;

public class Students {

    private String fname[], lname[];
    private int c;

    Students(int c) {
        fname = new String[c];
        lname = new String[c];
        this.c = 0;
    }

    // public String get_fname(int i)
    // {return fname[i];}

    // public String get_lname(int i)
    // {return lname[i];}

    // public int get_c()
    // {return c;}

    public void student_add(String fname, String lname) {
        if (c < (this.fname.length)) {
            this.fname[c] = fname;
            this.lname[c] = lname;
            c++;
        } else
            System.out.println("Full places occupied :(");
    }

    public int student_search(String fname, String lname) {
        System.out.println("");
        for (int i = 0; i < c; i++)
            if (this.fname[i].equals(fname))
                if (this.lname[i].equals(lname)) {
                    System.out.println("<" +fname+" "+lname+ " found at pos " + (i + 1) + ">");
                    return i + 1;
                }
        System.out.println("<" +fname+" "+lname+ " not found!> \n");
        return 0;

    }

    public void student_remove(String fname, String lname) {
        int i = student_search(fname, lname);
        if (i != 0) {
            this.fname[i - 1] = null;
            this.lname[i - 1] = null;
            for (int j = i - 1; j < c - 1; j++) {
                this.fname[j] = this.fname[j + 1];
                this.lname[j] = this.lname[j + 1];
            }
            this.fname[c - 1] = null;
            this.lname[c - 1] = null;
            c--;
            System.out.println("<Student sucessfully removed!> \n");
        }

    }

    public void report_all() {
        if (c > 0) {
            System.out.println("The registered students for this week are:");
            for (int i = 0; i < c; i++)
                System.out.println("#" + (i + 1) + " " + fname[i] + " " + lname[i]);
            System.out.println("");
        } else
            System.out.println("No students registered!");

    }

    public void remove_all() {
        fname = null;
        lname = null;
        c = 0;
    }

    @Override
    public String toString() {
        return fname[c] + " " + lname[c];

    }

}
