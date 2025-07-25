import java.util.Scanner;

public class TimeConverterApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TimeInputReader inputReader = new TimeInputReader(scanner);
        TimeDisplayer displayer = new TimeDisplayer();
        TimeAdvancer advancer = new TimeAdvancer();

        // Read the initial time from the user
        Time currentTime = inputReader.readTime();

        // Display the indicated time
        displayer.display("Indicated time", currentTime);

        // Advance the time by five seconds
        Time newTime = advancer.advanceBySeconds(currentTime, 5);

        // Display the new time
        displayer.display("Time after 5 seconds", newTime);

        scanner.close();
    }
}