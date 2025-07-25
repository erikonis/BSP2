public class LauncherEx2 {

    public static void main(String[] args) {
        
        person a = new person("Albert", 2001, 10, 3, true, false);
        person b = new person("Balaga", 1995, 7, 2, true, true);
        person c = new person("Caldio", 1970, 3, 20, true, false);
        person d = new person("Dennis", 1999, 12, 28, false, true);
        person e = new person("Eowyn", 1964, 8, 1, false, true);
        person f = new person("Florenz", 1910, 11, 5, true, false);


        person[] initial = {a,b,c,d,e,f};

        filter filter = new filter(initial);

        filter.studentF();

        filter.printName();
        System.out.println("-----");

        filter.seniorF();

        filter.printName();
        System.out.println("-----");
    }
    
}
