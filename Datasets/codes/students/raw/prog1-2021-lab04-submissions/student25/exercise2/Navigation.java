package lu.uni.programming1.lab4.exercise2;

public class Navigation {
    
    static byte[] route = {4, 3, 1, 2, 1, 3, 3, 4, 2, 4};

    static String[] roadType = {"motorway", "ordinary", "town", "calmed"};
    static short[] speedLimit = {130, 90, 50, 30};
    public static void main(String[] args) {
    

        String road = "";
        short limit = 0;

        double travelTime = 0;

        byte counter = 0;
        for (byte ID : route) {
            ++counter;

            road = roadType[ID-1];
            limit = speedLimit[ID-1];

            //each road is 1km long
            //Driving at a given 'speed' in km/h 
            //Travel time is then 1/speed hours or 6/(speed/10)

            travelTime += 6/(limit/10);

            System.out.format("\nroad nb %d : %s, max speed is %d", counter, road, limit);
        }
        System.out.format("\nThe total trip will take %f minutes to complete", travelTime);


    }
}
