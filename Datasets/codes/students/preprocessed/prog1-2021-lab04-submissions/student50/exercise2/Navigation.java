public class Navigation {
    static short[] route = {4, 3, 1, 2, 1, 3, 3, 4, 2, 4};
    static double[] speedLimit = {130, 90, 50, 30};
    public static void main(String[] args) {
        // Prints road segment
        for(int i = 0; i < route.length; i++){
            String segment = switch(route[i]){
                case 1 -> "motorway";
                case 2 -> "ordinary";
                case 3 -> "town";
                case 4 -> "calmed";
                default -> "ERROR";
            };
            System.out.println(segment);
        }
        
        double best = 0;
        for(int j = 0; j < route.length; j++){
            best += 1/speedLimit[route[j]-1];
        }
        int hours = (int) best;
        int minutes = (int)((best * 60) % 60);
        int seconds = (int)((best * 3600) % 60);
        System.out.printf("The minimal driving time for that road is: %02d:%02d:%02d",hours, minutes, seconds);
    }
}
