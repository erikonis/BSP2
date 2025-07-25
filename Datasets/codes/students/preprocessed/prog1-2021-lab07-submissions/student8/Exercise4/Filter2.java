public abstract class Filter2 {
    Person[] list;
    String filterApplied="Everyone";

    public Filter2(Person[] list, String filterApplied) {
        this.list = list;
        if(filterApplied==null)
            filterApplied="Everyone";
        else
        this.filterApplied = filterApplied;
    }

    public Person[] getList() {
        return list;
    }
    public String getFilterApplied() {
        return filterApplied;
    }
    
    public void printOut() {
        
        for(int i=0;i<list.length;i++){
            if(list[i]!=null)
            System.out.println("Name: "+list[i].name+"\tYear: "+list[i].birthYear+"\tMonth: "+list[i].birthMonth+"\tDay: "+list[i].birthDay+"\t\tStudent: "+list[i].student+"\tTeacher: "+list[i].teacher);
        }
        System.out.println("");
    }

    abstract void sort();

    public static void main(String[] args) {
        Person p1 = new Person("Kiki", 1980, 6, 12, true, true);
        Person p2 = new Person("Koko", 1982, 6, 12, false, true);
        Person p3 = new Person("Tommy", 1999, 7, 4, true, false);
        Person p4 = new Person("Robert", 1950, 7, 9, false, true);
        Person p5 = new Person("Josef", 1997, 7, 4, true, false);
        Person p6 = new Person("Ricky", 1980, 7, 4, true, false);
        Person p7 = new Person("Pucky", 2000, 7, 4, true, false);
        Person p8 = new Person("Juan", 1954, 7, 4, true, false);

        Person[] list = new Person[15];
        list[0]=p1;
        list[1]=p2;
        list[2]=p3;
        list[3]=p4;
        list[4]=p5;
        list[5]=p6;
        list[6]=p7;
        list[7]=p8;

        TeacherFilter tf = new TeacherFilter(list,null);
        tf.printOut();
        tf.sort();
        MiddleFilter mf = new MiddleFilter(tf.getList(),tf.getFilterApplied());
        mf.sort();
        MiddleFilter mf2 = new MiddleFilter(list,null);
        mf2.printOut();
        mf2.sort();

        StudenFilter sf = new StudenFilter(list,null);
        sf.printOut();
        sf.sort();

        JuniorFilter jf = new JuniorFilter(sf.getList(),sf.getFilterApplied());
        MiddleFilter mf3 = new MiddleFilter(sf.getList(),sf.getFilterApplied());
        SeniorFilter snf = new SeniorFilter(sf.getList(),sf.getFilterApplied());

        jf.sort();
        mf3.sort();
        snf.sort();
    }
}
