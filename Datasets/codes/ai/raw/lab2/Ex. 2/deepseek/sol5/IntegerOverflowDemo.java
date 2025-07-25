public class IntegerOverflowDemo {
    public static void main(String[] args) {
        System.out.println("\nInteger Overflow Demonstration:");
        System.out.println("------------------------------");
        
        int maxInt = Integer.MAX_VALUE;  // 2,147,483,647
        int minInt = Integer.MIN_VALUE;  // -2,147,483,648
        
        System.out.println("Max int value: " + maxInt);
        maxInt++;
        System.out.println("After overflow: " + maxInt);
        
        System.out.println("\nMin int value: " + minInt);
        minInt--;
        System.out.println("After underflow: " + minInt);
        
        System.out.println("\nUsing long to avoid overflow:");
        long bigNumber = (long)Integer.MAX_VALUE + 1;
        System.out.println("Value that overflows int: " + bigNumber);
    }
}