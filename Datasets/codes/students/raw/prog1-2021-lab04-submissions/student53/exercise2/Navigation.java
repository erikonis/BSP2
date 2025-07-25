package lu.uni.programming1.lab4.exercise2;

public class Navigation {
    public static void main(String[] args) {
        int[] a = initA();
        String text = "";
        double timeNeeded = 0;

        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1) {
                text += switch (a[i]) {
                case 1 -> "motorway.";
                case 2 -> "ordinary.";
                case 3 -> "town.";
                case 4 -> "calmed.";
                default -> "";
                };
            } else {
                text += switch (a[i]) {
                case 1 -> "motorway, ";
                case 2 -> "ordinary, ";
                case 3 -> "town, ";
                case 4 -> "calmed, ";
                default -> "";
                };
            }
        }
        for (int i = 0; i < a.length; i++) {
            timeNeeded += switch (a[i]) {
            case 1 -> (1.0 / 130) * 60;
            case 2 -> (1.0 / 90) * 60;
            case 3 -> (1.0 / 50) * 60;
            case 4 -> (1.0 / 30) * 60;
            default -> 0;
            };
        }

        System.out.println(text);
        System.out.println("Estimated time of driving: "+timeNeeded+ " min");
    }

    private static int[] initA() {
    int[] arr = {4, 3, 1, 2, 1, 3, 3, 4, 2, 4 };
        return arr;
    }
}
