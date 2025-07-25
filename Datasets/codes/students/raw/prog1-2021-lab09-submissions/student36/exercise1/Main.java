package lu.uni.programming1.lab9.exercise1;


public class Main {
    public static void main(String[] args) {

        ItemGear armor = new ItemGear("Armor", 150, Rarity.BLUE, 5, 10, 3);
        ItemGear classicSword = new ItemGear("Classic sword", 100, Rarity.BLUE, 2, 9, 5);
        ItemConsumable recoveryPotion = new ItemConsumable("Recovery potion", 10, Rarity.GREEN, 2);
        ItemTrash postCard = new ItemTrash("Post card from grandma'", 5, Rarity.WHITE);
        ItemGear excalibur = new ItemGear("Excalibur Sword", 350, Rarity.PURPLE, 10, 15, 17);
        ItemConsumable immortalityPotion = new ItemConsumable("Immortality potion", 1000, Rarity.GREEN, 1);
        ItemConsumable defensePotion = new ItemConsumable("Defense potion", 15, Rarity.GREEN, 2);
        ItemTrash fork = new ItemTrash("Fork", 1, Rarity.WHITE);

        // Create an inventory Pocket
        Inventory pocket = new Inventory();

        //------Add an item
        pocket.add(armor);
        pocket.add(classicSword);
        pocket.add(recoveryPotion);
        pocket.add(postCard);
        pocket.add(excalibur);
        pocket.add(immortalityPotion);
        pocket.add(defensePotion);
        pocket.add(fork);
        System.out.println(pocket);
        
        //------Remove an item with int drop
        pocket.drop(classicSword);
        System.out.println(pocket);

        //------Remove an item with boolean drop
        pocket.drop(2);
        System.out.println(pocket);

        //------Use a potion or gear item
        pocket.use(1);
        pocket.use(3);
        pocket.use(0);
        System.out.println(pocket);
        
        //------Sell a trash item
        pocket.sell(4);
        System.out.println(pocket);

        //------Compare 2 items
        pocket.comparaison(armor, excalibur);  
        pocket.comparaison(recoveryPotion, defensePotion);
        System.out.println(pocket);
    }
}
