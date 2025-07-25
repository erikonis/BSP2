import java.time.LocalDate;
import java.util.Scanner;

public class Launcher {
    
    public static void main(String[] args) {
        Person p0= new Person("Cierra",LocalDate.of(1987,3,4),false,true);
        Person p1 = new Person("Aiden",LocalDate.of(1998,5,12),true,true);
        Person p2 = new Person("Thomas",LocalDate.of(1965,12,25),false,true);
        Person p3 = new Person("Miranda",LocalDate.of(1974,11,29),false,true);
        Person p4 = new Person("Brandy",LocalDate.of(1999,6,20),true,false);
        Person p5 = new Person("Alvaro",LocalDate.of(1963,2,18),false,true);
        Person p6 = new Person("Maggie",LocalDate.of(2001,8,23),true,false);
        Person person[] = new Person[]{p0,p1,p2,p3,p4,p5,p6};
        Person result[] = new Person[]{};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Which filter you want to use?");
        System.out.println(" Lecturer Filter: l \n Student Filter: st \n TA filter: t \n Junior Filter: j \n Middle Filter: \n Senior Filter: se");
        
        String filter = scanner.next();
        switch(filter){
            case "l"->{
                LecturerFilter l = new LecturerFilter(person);
                l.check();
                result = l.getResult();
            }
            case "st"->{
                StudentFilter st = new StudentFilter(person);
                st.check();
                result = st.getResult();
            }
            case "t"->{
                TAFilter t = new TAFilter(person);
                t.check();
                result = t.getResult();
            }
            case "j"->{
                JuniorFilter j = new JuniorFilter(person);
                j.check();
                result = j.getResult();
            }
            case "m"->{
                MiddleFilter m = new MiddleFilter(person);
                m.check();
                result = m.getResult();
            }
            case "se"->{
                SeniorFilter se = new SeniorFilter(person);
                se.check();
                result = se.getResult();
            }
            default -> System.out.println("There is no filter like that!");

        };
        System.out.println("Use an other filter on that outcome? (yes/no)");
        if(scanner.next().toUpperCase().equals("YES")){
            System.out.println("Which filter you want to use?");
            System.out.println(" Lecturer Filter: l \n Student Filter: st \n TA filter: t \n Junior Filter: j \n Middle Filter: \n Senior Filter: se");   
            String filter2 = scanner.next();
            switch(filter2){
                case "l"->{
                    LecturerFilter l = new LecturerFilter(result);
                    l.check();
                    result = l.getResult();
                }
                case "st"->{
                    StudentFilter st = new StudentFilter(result);
                    st.check();
                    result = st.getResult();
                }
                case "t"->{
                    TAFilter t = new TAFilter(result);
                    t.check();
                    result = t.getResult();
                }
                case "j"->{
                    JuniorFilter j = new JuniorFilter(result);
                    j.check();
                    result = j.getResult();
                }
                case "m"->{
                    MiddleFilter m = new MiddleFilter(result);
                    m.check();
                    result = m.getResult();
                }
                case "se"->{
                    SeniorFilter se = new SeniorFilter(result);
                    se.check();
                    result = se.getResult();
                }
                default -> System.out.println("There is no filter like that!");
    
            };
        }
        //I made that you can only apply 2 filters.In this case it is nosense to apply more than 2
        //Otherwise I would loop the last switch as long ass we type yes in the termial
        //close
        scanner.close();
    }
    
}
