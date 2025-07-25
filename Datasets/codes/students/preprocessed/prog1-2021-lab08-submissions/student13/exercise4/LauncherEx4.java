public class LauncherEx4 {

    public static void main(String[] args) {
        
        loyaltyCardUser l1 = new loyaltyCardUser(1);

        order o1 = new order(l1, 9999);

        o1.pay();

        order o2 = new order(l1, 1000);

        o2.payWithPoints();

        

    }
    
}
