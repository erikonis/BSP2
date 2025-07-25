import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int loop = 1;
        Inventory inventory = new Inventory();
        inventory.generateInv();

        while (loop > 0) {

            String name;
            int cost;
            int uses;
            int criticalHit;
            int determination;
            int directHit;
            String rarity;

            System.out.println("What do you want to do? (drop, add, use, sell, inventory)");
            String action = scanner.next();

            if (action.equals("add")) {
                System.out.println("What sort of item do you want to add? (Gear, Consumable, Valuable)");
                String itemTyp = scanner.next();

                switch (itemTyp) {
                    case "Gear":
                        System.out.println("Name of the item:");
                        name = scanner.next();

                        System.out.println("Rarity of the item:");
                        rarity = scanner.next();

                        System.out.println("Cost of the item:");
                        cost = scanner.nextInt();

                        System.out.println("Critical hit value of the item:");
                        criticalHit = scanner.nextInt();

                        System.out.println("determination value of the item:");
                        determination = scanner.nextInt();

                        System.out.println("Directh hit value of the item:");
                        directHit = scanner.nextInt();

                        Gear gear = new Gear(name, cost, rarity, criticalHit, determination, directHit);

                        System.out.println("Added item to inventory:");
                        gear.toString();

                        inventory.add(gear);

                        break;

                    case "Valuable":
                        System.out.println("Name of the item:");
                        name = scanner.next();

                        System.out.println("Rarity of the item:");
                        rarity = scanner.next();

                        System.out.println("Cost of the item:");
                        cost = scanner.nextInt();

                        Trash trash = new Trash(name, cost, rarity);

                        System.out.println("Added item to inventory:");
                        trash.toString();

                        inventory.add(trash);

                        break;

                    case "Consumable":
                        System.out.println("Name of the item:");
                        name = scanner.next();

                        System.out.println("Rarity of the item:");
                        rarity = scanner.next();

                        System.out.println("Cost of the item:");
                        cost = scanner.nextInt();

                        System.out.println("Uses of the item:");
                        uses = scanner.nextInt();

                        Consumable consumable = new Consumable(name, cost, rarity, uses);

                        System.out.println("Added item to inventory:");
                        consumable.toString();

                        inventory.add(consumable);

                        break;
                }
            }

            if (action.equals("use")) {
                System.out.println("What is the position of the item?");
                int index = scanner.nextInt();

                inventory.use(index);
            }

            if (action.equals("drop")) {
                System.out.println(
                        "Do you want to drop all items of a kind or a single one? (single one /or/ all of a kind)");
                String dropMethode = scanner.next();

                switch (dropMethode) {
                    case "single one":

                        System.out.println("Position of the item:");
                        int index = scanner.nextInt();

                        System.out.println("Dropped " + inventory.getInvItems(index));

                        inventory.drop(index);

                        break;

                    case "all of a kind":

                        System.out.println("Name of the item:");
                        name = scanner.next();

                        System.out.println("Rarity of the item:");
                        rarity = scanner.next();

                        System.out.println("Cost of the item:");
                        cost = scanner.nextInt();

                        Items items = new Items(name, cost, rarity);

                        String droppedItem = inventory.getInvItems2(items);

                        System.out.println("Dropped " + inventory.drop(items) + " instances of item: " + droppedItem);
                }
            }

            if (action.equals("sell")) {
                System.out.println("Position of the item that you want to sell:");
                int index = scanner.nextInt();

                String soldItem = inventory.getInvItems(index);

                boolean sold = inventory.sell(index);

                if (sold) {
                    System.out.println("Item sold: " + soldItem);
                } else {
                    System.out.println("The following item cannot be sold: " + soldItem);
                }
            }

            if (action.equals("inventory")) {
                System.out.println("Inventory: ");
                for (int i = 0; i < 20; i++) {
                    System.out.println("{" + i + "} " + inventory.getInvItems(i));
                }
            }

            System.out.println("Are you finished? (yes /or/ no)");
            String close = scanner.next();

            if (close.equals("yes")) {
                loop = -1;
            }
        }
        scanner.close();
    }

}
