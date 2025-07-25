import java.util.Scanner;

public class Main {
    private static StudentList sdl = new StudentList();

    public static void main(String[] args){
        System.out.println(sdl.size());
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter multiple names :");
        sdl.add(sc.nextLine());
        sdl.add(sc.nextLine());
        sdl.add(sc.nextLine());
        sdl.add(sc.nextLine());
        sdl.add(sc.nextLine());
        sdl.add(sc.nextLine());
        sdl.print();
        System.out.println("\nPlease remove a name :");
        sdl.remove(sc.nextLine());
        sdl.print();
        sc.close();
    }
}
