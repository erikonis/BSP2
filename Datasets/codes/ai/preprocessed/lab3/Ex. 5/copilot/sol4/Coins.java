public class Coins {
    public static void main(String[] args) {
        int totalCents = 100;
        int count = 0;

        System.out.println("Possible decompositions of 1 euro into 20, 10, and 5 cent coins:");

        for (int twentyCent = 0; twentyCent <= totalCents / 20; twentyCent++) {
            for (int tenCent = 0; tenCent <= (totalCents - twentyCent * 20) / 10; tenCent++) {
                for (int fiveCent = 0; fiveCent <= (totalCents - twentyCent * 20 - tenCent * 10) / 5; fiveCent++) {
                    if (twentyCent * 20 + tenCent * 10 + fiveCent * 5 == totalCents) {
                        System.out.println(twentyCent + " x 20 cent, " + tenCent + " x 10 cent, " + fiveCent + " x 5 cent");
                        count++;
                    }
                }
            }
        }

        System.out.println("Total number of possibilities: " + count);
    }
}