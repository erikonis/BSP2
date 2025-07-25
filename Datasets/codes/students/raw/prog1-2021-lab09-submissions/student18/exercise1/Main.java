package lab9.exercise1;

import lab9.exercise1.Item.Rarity;

public class Main {
    public static void main(String[] args){
        Inventory inventory = new Inventory(10);
        Gear betterHelmet = new Gear("Better Helmet", 250, Rarity.PURPLE, 10, 6, 8);
        inventory.add(betterHelmet);
        Consumable mana = new Consumable("Mana Potion", 35, Rarity.WHITE, 2);
        inventory.add(mana);
        System.out.println(inventory.toString());

        inventory.use(mana);
        inventory.use(mana);
        mana.use();
        inventory.use(mana);
        inventory.use(betterHelmet);
        System.out.println(inventory.toString());

        Trash paper = new Trash("Paper", 5, Rarity.WHITE);
        inventory.add(paper);
        inventory.sell(betterHelmet);
        inventory.sell(paper);
        System.out.println(inventory.toString());
    }
}
