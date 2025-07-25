package lu.uni.programming1.lab5.exercise3;

import java.util.Scanner;

public class Launch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many giveawys are available?");
        int maxNumberOfGiveaways = scanner.nextInt();

        int[] g = {0,0,0};

        for(int i=maxNumberOfGiveaways;i>0;i--)
        {
            g[i%3]++;
        }

        Shop[] shops = {new Shop(g[0],maxNumberOfGiveaways),new Shop(g[1],maxNumberOfGiveaways),new Shop(g[2],maxNumberOfGiveaways)};

        for(int i=10;i>0;i--)
        {
            shops[i%3].buy(new Item((int)(Math.random()*120)));
            maxNumberOfGiveaways--;

        }

        System.out.println("There are "+maxNumberOfGiveaways+" giveways left at a national level");

        for(int i=1;i<4;i++)
        {
            System.out.println("The shop number "+i+" has "+shops[i%3].getLocalNumberOfGiveaways()+" giveaways left");
        }
        scanner.close();
    }
}
