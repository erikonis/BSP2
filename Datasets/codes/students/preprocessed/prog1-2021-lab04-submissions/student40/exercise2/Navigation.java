public class Navigation {
    public static void main(String[] args) {
        int arr1[] = {4,3,1,2,2,3,3,4,2,4};
        System.out.println("The route goes through these kinds of roads in order: ");
        for(int c = 0; c<10;){
            String roadtype = switch(arr1[c]){
                case 1 -> "motorway";
                case 2 -> "ordinary";
                case 3 -> "town";
                case 4 -> "calmed";
                default->{System.out.println("ERROR");
                        yield"X";}};
                c++;
            System.out.print(roadtype+", ");}
            //loop cycling through the parts of the array of roads, printing the types
        double sum = 0.0;
        for(int d = 0; d<10;){
            Double roadtime = switch(arr1[d]){
                case 1-> (6.0/13.0);
                case 2-> (6.0/9.0);
                case 3-> (6.0/5.0);
                case 4-> (6.0/3.0);
                default->{System.out.println("x");
                            yield 0.0;}};
                d++;
                sum = sum + roadtime;}
            //another loop cycling through the array, but this time adding
            //the time needed to traverse 1km at the upper speed limit before printing the result
                System.out.println("Estimated time: "+sum+" minutes");
    }}

