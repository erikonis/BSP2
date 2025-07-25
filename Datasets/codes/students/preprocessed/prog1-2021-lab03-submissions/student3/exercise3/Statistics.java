import java.util.Scanner;
public class Statistics {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int average=0;
        int grade;
        int largestNumber=0;
        int smallestNumber=Integer.MAX_VALUE;
        while(true){
            grade=input.nextInt();
            if(grade==0){
                System.out.println("the smallest number:" + smallestNumber + "\n" + "the largest number:" + largestNumber + "\n" + "the average of all the numbers:" + average);
                return;
            }
            if(largestNumber<grade){
                largestNumber=grade;
            }
            if(smallestNumber>grade){

                smallestNumber=grade;
            }
            average=(average+grade)/2;   
        }

        }
        
    }

