public class Coins {
    public static void main(String[] args) {
        int number = 0;
        for (int i = 1; i <= 3; i++) {

            switch (i) {
            case 1:
                System.out.println("1 € can be split into " + 100 / 20 + "(20 cent) coins");
                number = number + 100 / 20;
                break;
            case 2:
                System.out.println("1 € can be split into " + 100 / 10 + "(10 cent) coins");
                number = number + 100 / 10;
                break;
            case 3:
                System.out.println("1 € can be split into " + 100 / 5 + "(5 cent) coins");
                number = number + 100 / 5;
                break;
                default:
                

            }

        }
        System.out.println("The total of number of possibilities are: " + number);

    }

}
