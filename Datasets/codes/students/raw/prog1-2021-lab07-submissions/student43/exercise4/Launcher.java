package lu.uni.programming1.lab7.exercise4;

public class Launcher {

    public static void main(String[] args) {

    Individual[] list = new Individual[7];

    list[0] = new Individual("Cierra", 1987, 3, 4, false, true);
    list[1] = new Individual("Alden", 1998, 5, 12, true, true);
    list[2] = new Individual("Thomas", 1965, 12, 25, false, true);
    list[3] = new Individual("Miranda", 1974, 11, 29, false, true);
    list[4] = new Individual("Brandy", 1999, 6, 20, true, false);
    list[5] = new Individual("Alvaro", 1963, 2, 18, false, true);
    list[6] = new Individual("Maggie", 2001, 8, 23, true, false);

    System.out.println("\n" + "---" + "\n");

    // Filters out TAs :
    TAFilter taf1 = new TAFilter(list);
    taf1.showfilter();

    System.out.println("---" + "\n");

    // Filters out senior lecturers :
    LecturerFilter lf1 = new LecturerFilter(new SeniorFilter(list).GetFilteredList());
    lf1.showfilter();;
        
    }
    
}
