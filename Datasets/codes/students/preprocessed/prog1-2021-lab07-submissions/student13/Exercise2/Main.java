public class Main {
    
    public static void main(String[] args) {
        
        Person p1= new Person("Bryan", 2000, 9, 1, false, false);
        Person p2= new Person("Tim", 2002, 9, 1, true, true);
        Person p3= new Person("Kathy", 1941, 9, 1, false, true);
        Person p4= new Person("Anna", 1996, 9, 1, true, true);
        Person p5= new Person("Tom", 1994, 9, 1, false, true);
        Person p6= new Person("Kevin", 1997, 9, 1, true, true);

        PersonList list= new PersonList(6);

        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);
        list.add(p6);

        

        list.filter(new StudentFilter()).filter(new SeniorFilter()).printAll();


    }
}
