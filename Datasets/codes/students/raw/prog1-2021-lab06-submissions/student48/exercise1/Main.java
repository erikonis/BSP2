package lu.uni.programming1.lab6.exercise1;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pavilion pav1 = new Pavilion("Murbelsmillen", 5.99);
        Pavilion pav2 = new Pavilion("Wine", 4.99);
        Pavilion pav3 = new Pavilion("City Archives", 4.99);
        Pavilion pav4 = new Pavilion("Ancient World", 4.99);
        Pavilion pav5 = new Pavilion("Dubai VR", 8.99);
        Pavilion[] pavilions = {pav1,pav2, pav3, pav4, pav5};

        // Welcome & determination of amount of people that visit the museum
        System.out.println("Hello! Welcome to the Luxembourg History Museum! \nAre you alone or in a group? Please write the number of people you are:");
        int n = sc.nextInt();
        while(n < 0){
            System.out.println("Please enter a positive number:");
            n = sc.nextInt();
        }
        if(n > 6 && n < 12){
            System.out.println("You are in a group between 6 and 12, which means that you get a 30% discount on your tickets!");
        }else if(n > 12){
            System.out.println("You are more than 12, which means that you get a 40% discount on your tickets!");
        }else{
            System.out.println("Great! For every pavilion you visit after the first three you get a 30% discount on it.");

        }

        // List current pavilions available
        System.out.println("The Following pavilions are currently avaliable:");
        for(int i=0; i<pavilions.length;i++){
            System.out.println(i+1 + ": " + pavilions[i].toString());
        }

        // Visitor chooses the pavilions he/they want/s to visit
        System.out.println("\nNow please choose the pavilions you want to visit by entering their number. If you are done just enter 'done':");
        ArrayList<Integer> choices = new ArrayList<>();
        int choice = sc.nextInt();
        choices.add(choice);
        int size = 1;
        System.out.println("Do you want to continue your choice? (true/false)");
        boolean again = sc.nextBoolean();

        while(again && size != pavilions.length){
            choice = sc.nextInt();
            if(choice <= pavilions.length){
                if(choices.contains(choice)){
                    System.out.println("You already selected this pavilion!");
                }else{
                    choices.add(choice);
                    size++;
                }
            }
            else{
                System.out.println("This pavilion is not available. Please select another one");
            }
            System.out.println("Do you want to continue your choice? (true/false)");
            again = sc.nextBoolean();
        }

        // Store pavilions the visitor wants to visit
        Pavilion[] visit = new Pavilion[size];
        for(int j=0; j<size; j++){
            visit[j] = pavilions[choices.get(j)-1];
        }

        // Create a Ticket
        if(n==1){
            Ticket ticket = new Ticket(visit);
            System.out.println("Here is your ticket: \n" + ticket.toString());
        }else{
            GroupTicket ticket = new GroupTicket(visit, n);
            System.out.println("Here is your ticket: \n" + ticket.toString());

        }

        sc.close();
    }
}
