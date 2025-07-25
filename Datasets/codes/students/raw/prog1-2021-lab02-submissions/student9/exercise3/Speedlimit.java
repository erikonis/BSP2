 package lu.uni.programming1.lab2.exercise3;

import java.util.Scanner;

public class Speedlimit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter the id type :");
        int idRoad = scanner.nextInt();

        String roadType = "";

        int speedLimit = 0;

        if (idRoad == 1) {
            roadType = "Moterway";
            speedLimit = 130;
        } else if (idRoad == 2) {
            roadType = "Ordinary";
            speedLimit = 90;
        } else if (idRoad == 3) {
            roadType = "Town";
            speedLimit = 50;
        } else if (idRoad == 4) {
            roadType = "Calmed";
            speedLimit = 30;
        } else {

            System.out.println("The id type is unknown :");
        }

        System.out.print("Please enter the cuurrnt speed : ");
        int speed = scanner.nextInt();

        if (speed <= speedLimit) {

            System.out.println("Speed OK for " + roadType);
        } else if (speed <= speedLimit) {

            System.out.println("Speed OK for " + roadType);
        } else if (speed <= speedLimit) {

            System.out.println("Speed OK for " + roadType);
        } else if (speed <= speedLimit) {

            System.out.println("Speed OK for " + roadType);
        } else {
            System.out.println("Too fast for " + roadType);
        }

        double perecenatge = speed - speedLimit;

        double fine = (perecenatge / speedLimit) * 100;

        if (fine >= 5 && fine <= 30) {
            System.out.print(perecenatge + " is over the limit, your fine is €50");

        } else if (fine >= 30 && fine <= 50) {
            System.out.print(perecenatge + " is over the limit, your fine is €150");
        } else if (fine > 50) {
            System.out.print(perecenatge + " is over the limit, your fine is €500");
        } else {
          
        }
        scanner.close();
    }
}