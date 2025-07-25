import java.util.Scanner;

public class SpeedFine {
    public static void main(String[] args) {
        // ... (input and speed limit check - same as above)

        if (speed > speedLimit) {
            int excess = speed - speedLimit;
            double percentage = (double) excess / speedLimit * 100;
            int fine = 0;

            if (percentage <= 5) fine = 0;
            else if (percentage <= 30) fine = 50;
            else if (percentage <= 50) fine = 150;
            else fine = 500;

            System.out.println("Fine: " + fine + " EUR");
        }
    }
}