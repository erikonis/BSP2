public class Main{
    public static void main(String[] args){
        Person p1 = new Person("Cierra", 34, false, true);
        Person p2 = new Person("Aiden", 23, true, true);
        Person p3 = new Person("Thomas", 56, false, true);
        Person p4 = new Person("Miranda", 47, false, true);
        Person p5 = new Person("Brandy", 22, true, false);
        Person p6 = new Person("Alvaro", 58, false, true);
        Person p7 = new Person("Maggie", 20, true, false);
    
        Person[] array = {p1,p2,p3,p4,p5,p6,p7};
    
        Filters f = new Filters(array);
        System.out.println("Lecturers are: ");
        f.teaches();
        System.out.println("\n"+"Students are: ");
        f.studies();
        System.out.println("\n"+"TA's are: ");
        f.TA();
        System.out.println("\n"+"Juniors are: ");
        f.Junior();
        System.out.println("\n"+"Ppl between Junior and Senior: ");
        f.Middle();
        System.out.println("\n"+"Seniors are: ");
        f.Senior();

    }
}