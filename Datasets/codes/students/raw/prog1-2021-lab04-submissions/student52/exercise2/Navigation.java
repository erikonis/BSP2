public class Navigation {
    // 1
    static int[] roadt = new int[] { 4, 3, 1, 2, 1, 3, 3, 4, 2, 4 };

    public static void main(String[] args) {

        // 2
        System.out.println("Our route is:");
        for (int i = 0; i < 10; i++) {
            String a = switch (roadt[i]) {
            case 1 -> "motorway";
            case 2 -> "ordinary";
            case 3 -> "town";
            case 4 -> "calmed";
            default -> {
                yield "unknown";
            }
            };
            System.out.println(a);
        }

        // 3
        float time = 0;
        for (int i = 0; i < 10; i++)
            switch (roadt[i]) {
            case 1:
                time += 1 / 130.;
                break;

            case 2:
                time += 1 / 90.;
                break;

            case 3:
                time += 1 / 50.;
                break;

            case 4:
                time += 1 / 30.;
                break;

            default:

            }
        System.out.println("Driving takes " + time + " hours, " + time * 60 + " minutes");
    }
}
