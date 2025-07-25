package scr.lu.uni.programming1.lab5.exercise5;

import java.util.Scanner;

public class Giveaway {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Max Giveaway (national): ");
        int max = sc.nextInt();
        MaxNumberOfGiveaways maxGiv = new MaxNumberOfGiveaways(max);
        Shop s1 = new Shop(maxGiv.getMax()/3);
        Shop s2 = new Shop(maxGiv.getMax()/3);
        Shop s3 = new Shop(maxGiv.getMax()/3);
        while(max > 0){
            Item i1 = new Item((int)(Math.random()*(120-0+1))+0);
            if(s1.getLocalNumberOfGiveaways()>0 &&  s1.buy(i1)){
                max--;
            }
            Item i2 = new Item((int)(Math.random()*(120-0+1))+0);
            if(s2.getLocalNumberOfGiveaways()>0 && s2.buy(i2)){
                max--;
            }
            Item i3 = new Item((int)(Math.random()*(120-0+1))+0);
            if(s3.getLocalNumberOfGiveaways()>0 &&  s3.buy(i3)){
                max--;
            }
        }
        sc.close();
    }
}
