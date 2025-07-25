public class Navigation {
    public static void main(String[] args) {

        int[] route = {4,3,1,2,1,3,3,4,2,4};

        printRoadType(route);
        printMinimalDrivinghours(route);
			
    }

    public static void printRoadType(int[] route)
    {
        for(int i=0;i<route.length;i++)
        {
            String output = switch(route[i])
            {
                case 1 -> "motorway road";
                case 2 -> "ordinary road";
                case 3 -> "town road";
                case 4 -> "calmed road";
                default -> "Unknown road type:";
            };
            System.out.println(output);
        }
    }

    public static void printMinimalDrivinghours(int[] route)
    {
        double hours=0;

        for(int i=0;i<route.length;i++)
        {
            switch(route[i])
            {
                case 1: hours += 1.0/130.0 ;
                    break;
                case 2: hours += 1.0/90.0;
                    break;
                case 3: hours += 1.0/50.0;
                    break;
                case 4: hours += 1.0/30.0;
                    break;
            }
        }
        double minutes = hours * 60.0;
        System.out.println((int) minutes+" minutes "+(int)((minutes-((int)minutes))*60)+" seconds");
    }

    
}
