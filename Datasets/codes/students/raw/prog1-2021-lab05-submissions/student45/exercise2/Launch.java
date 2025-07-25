package lu.uni.programming1.lab5.exercise2;

import java.util.Scanner;

public class Launch {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Insert how many students will be in class: ");
        int i = scanner.nextInt();
        Classroom classroom = new Classroom(i);
        classroom.add("Ruben Serralva");
        classroom.add("joao silva");
        classroom.add("marco horacio");
        classroom.add("patricio bento");
        classroom.add("joao pardal");
        classroom.add("tiago martins");
        classroom.report();
        classroom.remove("patricio bento");
        System.out.println("");
        classroom.report();
        scanner.close();
    }
}
