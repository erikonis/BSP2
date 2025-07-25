package lu.uni.programming1.lab4.exercise2;

public class Navigation {

    //1°
    public static int route[] = {4, 3, 1, 2, 1, 3, 3, 4, 2, 4};

    public static void main(String[] args) {
        //2°
        String RoadType = "";

        for (int i = 0; i < route.length; ++i) {
            int id = route[i];

            //assigns road's name to its id
            RoadType += switch (id) {
                case 1 -> "motorway\n";
                case 2 -> "ordinary\n";
                case 3 -> "town\n";
                case 4 -> "calmed\n";
                default -> "unknown\n";
            };
        }

        System.out.println(RoadType);

        //3°
        double minutes = 0;

        for (int i = 0; i < route.length; ++i) {
            int id = route[i];

            //assigns time to drive 1km on this road to its id
            minutes += switch (id) {
                case 1 -> 6/13.0;
                case 2 -> 2/3.0;
                case 3 -> 6/5.0;
                case 4 -> 2;
                default -> 0;
            };
        } 
        long seconds = Math.round((minutes%1)*60);

        System.out.println("The estimated driving time is: " + (minutes - minutes % 1) + " minutes and " + seconds + " seconds.");
    }   
}
