package lu.uni.programming1.lab5.exercise5;

import java.util.Random;
import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of total giveaways: ");
        int nationalGiveaways = scanner.nextInt();
        Shop luxCity, esch, diekirch;
        switch (nationalGiveaways % 3) {
        case 1:
            luxCity = new Shop(nationalGiveaways / 3 + 1);
            esch = new Shop(nationalGiveaways / 3);
            diekirch = new Shop(nationalGiveaways / 3);
            break;
        case 2:
            luxCity = new Shop(nationalGiveaways / 3 + 1);
            esch = new Shop(nationalGiveaways / 3 + 1);
            diekirch = new Shop(nationalGiveaways / 3);
            break;
        default:
            luxCity = new Shop(nationalGiveaways / 3);
            esch = new Shop(nationalGiveaways / 3);
            diekirch = new Shop(nationalGiveaways / 3);
            break;
        }

        luxCity.setNumberOfNationalGiveaways(nationalGiveaways);

        Random ran = new Random();

        Item clock = new Item(ran.nextInt(120));
        Item watch = new Item(ran.nextInt(120));
        Item phone = new Item(ran.nextInt(120));
        Item bed = new Item(ran.nextInt(120));
        Item oven = new Item(ran.nextInt(120));

        while (Shop.nationalGiveawaysLeft()) {
            while (luxCity.localGiveawaysLeft()) {
                luxCity.buy(clock);
                luxCity.buy(watch);
                luxCity.buy(phone);
                luxCity.buy(bed);
                luxCity.buy(oven);
            }
            while (esch.localGiveawaysLeft()) {
                esch.buy(clock);
                esch.buy(watch);
                esch.buy(phone);
                esch.buy(bed);
                esch.buy(oven);
            }
            while (diekirch.localGiveawaysLeft()) {
                diekirch.buy(clock);
                diekirch.buy(watch);
                diekirch.buy(phone);
                diekirch.buy(bed);
                diekirch.buy(oven);
            }
        }

        scanner.close();
    }
}
