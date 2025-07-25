public class launcher {
    public static void main(String[] args) {
        order firstOrder = new order("Coke", 1.35, 100);
        order secindOrder = new order("Fanta", 1.21, 10);
        order thirdOrder = new order("Orangina", 1.43, 60);
        order forthOrder = new order("Sprite", 1.32, 60);
        order fifthOrder = new order("Sprite", 1.32, 60);

        orderedList l = new orderedList("The one");
        l.addItem(firstOrder);
        l.addItem(secindOrder);
        l.addItem(thirdOrder);
        l.addItem(forthOrder);
        l.addItem(fifthOrder);
        l.order();
    }
}