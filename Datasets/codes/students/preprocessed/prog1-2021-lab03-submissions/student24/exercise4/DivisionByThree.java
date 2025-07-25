import java.util.Scanner;

public class DivisionByThree {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a integer number");
        int num = scanner.nextInt();
        
        while(num>=10){
            int length = String.valueOf(num).length();
            Integer[] arNum = new Integer[length];
            int tempNum = num;
            int index = 0;
            while(tempNum!=0){
                arNum[index] = tempNum%10;
                tempNum=tempNum/10;
                index++;
            }
            for (Integer i : arNum) {
                tempNum += i;
            }
            num = tempNum;
        }
        if(num%3==0){
            System.out.println("The number is divisible !");
        }
        else{
            System.out.println("The number is not divisible !");
        }
        scanner.close();
    } 
}
