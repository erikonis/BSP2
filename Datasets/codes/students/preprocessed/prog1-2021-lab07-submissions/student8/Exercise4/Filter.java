public class Filter {

    Person[] list;

    public Filter(Person[] list) {
        this.list = list;
    }

    public void setList(Person[] list) {
        this.list = list;
    }

    public Person[] Lecturer() {
        System.out.println("Filter: Lecturer");
        int counter=0;
        Person[] temp = new Person[list.length];
        for(int i=0; i<list.length;i++){
            if(list[i]!=null && list[i].student==false && list[i].teacher==true){
                temp[i]=list[i];
                counter++;
            }
                
        }
        Person[] newList = new Person[counter];
        int n=0;
        for(int i=0; i<temp.length;i++){
            if(temp[i]!=null){
                newList[n]=temp[i];
                n++;
            }   
        }
        printOut(newList);
        return newList;
    }

    public Person[] Student() {
        System.out.println("Filter: Student");
        int counter=0;
        Person[] temp = new Person[list.length];
        for(int i=0; i<list.length;i++){
            if(list[i]!=null && list[i].student==true && list[i].teacher==false){
                temp[i]=list[i];
                counter++;
            }
                
        }
        Person[] newList = new Person[counter];
        int n=0;
        for(int i=0; i<temp.length;i++){
            if(temp[i]!=null){
                newList[n]=temp[i];
                n++;
            }   
        }
        printOut(newList);
        return newList;
    }

    public Person[] TA() {
        System.out.println("Filter: TA");
        int counter=0;
        Person[] temp = new Person[list.length];
        for(int i=0; i<list.length;i++){
            if(list[i]!=null && list[i].student==true && list[i].teacher==true){
                temp[i]=list[i];
                counter++;
            }
                
        }
        Person[] newList = new Person[counter];
        int n=0;
        for(int i=0; i<temp.length;i++){
            if(temp[i]!=null){
                newList[n]=temp[i];
                n++;
            }   
        }
        printOut(newList);
        return newList;
    }

    public Person[] Junior() {
        System.out.println("Filter: Junior");
        int counter=0;
        Person[] temp = new Person[list.length];
        for(int i=0; i<list.length;i++){
            if(list[i]!=null && list[i].age>=18 && list[i].age<=28){
                temp[i]=list[i];
                counter++;
            }
                
        }
        Person[] newList = new Person[counter];
        int n=0;
        for(int i=0; i<temp.length;i++){
            if(temp[i]!=null){
                newList[n]=temp[i];
                n++;
            }   
        }
        printOut(newList);
        return newList;
    }

    public Person[] Middle() {
        System.out.println("Filter: Middle");
        int counter=0;
        Person[] temp = new Person[list.length];
        for(int i=0; i<list.length;i++){
            if(list[i]!=null && list[i].age>=28 && list[i].age<=55){
                temp[i]=list[i];
                counter++;
            }
                
        }
        Person[] newList = new Person[counter];
        int n=0;
        for(int i=0; i<temp.length;i++){
            if(temp[i]!=null){
                newList[n]=temp[i];
                n++;
            }   
        }
        printOut(newList);
        return newList;
    }
    public Person[] Senior() {
        System.out.println("Filter: Senior");
        int counter=0;
        Person[] temp = new Person[list.length];
        for(int i=0; i<list.length;i++){
            if(list[i]!=null &&list[i].age>=55){
                temp[i]=list[i];
                counter++;
            }
                
        }
        Person[] newList = new Person[counter];
        int n=0;
        for(int i=0; i<temp.length;i++){
            if(temp[i]!=null){
                newList[n]=temp[i];
                n++;
            }   
        }
        printOut(newList);
        return newList;
    }

    public void printOut(Person[] list) {
        
        for(int i=0;i<list.length;i++){
            if(list[i]!=null)
            System.out.println("Name: "+list[i].name+"\tYear: "+list[i].birthYear+"\tMonth: "+list[i].birthMonth+"\tDay: "+list[i].birthDay+"\t\tStudent: "+list[i].student+"\tTeacher: "+list[i].teacher);
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Person p1 = new Person("Kiki", 1980, 6, 12, true, true);
        Person p2 = new Person("Koko", 1982, 6, 12, false, true);
        Person p3 = new Person("Tommy", 1999, 7, 4, true, false);
        Person p4 = new Person("Robert", 1950, 7, 9, false, true);
        Person p5 = new Person("Tommy", 1997, 7, 4, true, false);
        Person p6 = new Person("Tommy", 1980, 7, 4, true, false);
        Person p7 = new Person("Tommy", 2000, 7, 4, true, false);
        Person p8 = new Person("Tommy", 2005, 7, 4, true, false);

        Person[] list = new Person[15];
        list[0]=p1;
        list[1]=p2;
        list[2]=p3;
        list[3]=p4;
        list[4]=p5;
        list[5]=p6;
        list[6]=p7;
        list[7]=p8;

        Filter filter1 = new Filter(list);

        filter1.printOut(list);
        filter1.setList(filter1.Junior());

        Filter filter2 = new Filter(list);

        filter2.printOut(filter2.list);
        filter2.setList(filter2.Lecturer());

        Filter filter3 = new Filter(list);

        filter3.printOut(filter3.list);
        filter3.setList(filter3.TA());

        filter2.printOut(filter2.list);
        filter2.setList(filter2.Senior());

    }
    
}
