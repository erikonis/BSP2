package exercise2;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person p1=new Person("pit", LocalDate.of(2000,01,02), true, false);
        Person p2=new Person("paul", LocalDate.of(2010,01,02), true, true);
        Person p3=new Person("jean", LocalDate.of(1956,01,02), false, true);
        Person p4=new Person("pierre", LocalDate.of(1948,01,02), false, true);
        Person p5=new Person("opal", LocalDate.of(1989,01,02), true, false);
        Person p6=new Person("werner", LocalDate.of(1999,01,02), true, true);
        Person p7=new Person("klein", LocalDate.of(1975,01,02), true, false);
        Person p8=new Person("arnet", LocalDate.of(2003,01,02), true, false);
        People p = new People(20);
        p.add(p1);
        p.add(p2);
        p.add(p3);
        p.add(p4);
        p.add(p5);
        p.add(p6);
        p.add(p7);
        p.add(p8);
        System.out.println("Lecturers: "+p.lecturerFilter());
        System.out.println("Students: "+p.studentFilter());
        System.out.println("TAs: "+p.taFilter());
        System.out.println("Juniors: "+p.juniorFilter());
        System.out.println("Middles: "+p.middleFilter());
        System.out.println("Seniors: "+p.seniorFilter());
    }
}
