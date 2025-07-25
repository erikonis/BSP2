import java.util.Arrays;

public class Launcher {
    public static void main(String[] args) {

        Person alden = new Person("Alden", 23, true, true);
        Person maggie = new Person("Maggie", 20, true, false);
        Person brandy = new Person("Brandy", 22, true, false);
        Person alvaro = new Person("Alvaro", 58, false, true);
        Person thomas = new Person("Thomas", 55, false, true);
        Person cierra = new Person("Cierra", 34, false, true);
        Person miranda = new Person("Miranda", 47, false, true);
        Person []peoplelist = new Person[7];
        peoplelist[0] = alden;
        peoplelist[1] = maggie;
        peoplelist[2] = brandy;
        peoplelist[3] = alvaro;
        peoplelist[4] = thomas;
        peoplelist[5] = cierra;
        peoplelist[6] = miranda;
        JuniorFilter filterJuniors = new JuniorFilter(peoplelist);
        LecturerFilter filterLecturers = new LecturerFilter(peoplelist);
        SeniorFilter filterSeniors = new SeniorFilter(peoplelist);
        MiddleFilter filterMiddles = new MiddleFilter(peoplelist);
        StudentFilter filterStudents = new StudentFilter(peoplelist);
        TAFilter filterTAs = new TAFilter(peoplelist);
     
        
        

       System.out.println("This is the peoplelist: "+Arrays.toString(peoplelist));
        
       filterSeniors.applyFilter();
        //filterMiddles.applyFilter();
        filterLecturers.applyFilter();
        //filterStudents.applyFilter();
        //filterTAs.applyFilter();
        //filterJuniors.applyFilter();
        
  
        

       






    }
}
