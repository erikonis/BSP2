import java.util.Scanner;

public class Statistics {
    public static void main(String[] args) {
        
        
        Integer number = 1;
        Integer count = 0;
        float average = 0;
        Integer min = 0;
        Integer max = 0;
        while(number != 0){
            number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            average = average + number;
            if(number < min){
                min = number;
            }else if(number > max){
                max = number;
            }
            ++count;
        }
        System.out.println("Minimum = " + min);
        System.out.println("Maximum = " + max);
        System.out.println("Average = " + (average/count));

        scanner.close();
    }
    
}
