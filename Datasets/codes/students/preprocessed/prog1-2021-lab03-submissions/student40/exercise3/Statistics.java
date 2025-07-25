import java.util.Scanner;

public class Statistics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numbers = new double[10000]; boolean stop = true; int k=0; int intstop = 9999; 
        double b = 0; double s = 0; double sum = 0; double average = 0;
        do {
        System.out.println("Type number: " + (k+1) + "... (0 to stop): "); numbers[k] = sc.nextInt();
        if (numbers[k]==0) {stop = false; intstop=k; break;} ++k;} while ((stop) && k<9999);
        if (intstop==0) {System.out.println("The average is 0. "); sc.close(); System.exit(0);}
        else if (intstop==1) {System.out.println("The average is: " + numbers[0]); sc.close(); System.exit(0); }
        else if (intstop==2) {if (numbers[0]<=numbers[1]) {s=numbers[0]; b=numbers[1];} 
                         else {b=numbers[0]; s=numbers[1];}; average = (s+b)/2; System.out.println(s + " is smaller; the average is: " + average); sc.close(); System.exit(0);} 
        else {
        for (int x=0; x<=intstop-2; x++) {if (numbers[x]<=numbers[x+1]) {s=numbers[x]; } else {s=numbers[x+1];}; };
        for (int x2=0; x2<=intstop-2; x2++) {if (numbers[x2]<=numbers[x2+1]) {b=numbers[x2+1]; } else {b=numbers[x2];}; };
        for (int y=0; y<=intstop-1; y++) {sum+= numbers[y];}; average = sum/intstop-1; 
        System.out.println(s + " is the smallest; " + b + " is the biggest; " + "their average is: " + average); };
        sc.close();} }