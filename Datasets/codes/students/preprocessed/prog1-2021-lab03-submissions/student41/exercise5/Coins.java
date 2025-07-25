public class Coins {
    public static void main(String[] args) {
        System.out.println("Decomposition of a 1€ coin:");
        System.out.println("5c    10c    20c");
        int twentieth = 20;
        int tenth = 0;
        int fifth = 0;
        int c = 1;
        //starting values with 1€ in 5c couins
        System.out.println(twentieth+"     "+tenth+"      "+fifth);
        while (fifth < 5){
            //while there's less then 5 20c coins
            while (twentieth > 0){
                c++;
                twentieth = twentieth - 2;
                tenth++;
                System.out.println(twentieth+"      "+tenth+"       "+fifth);}
                //removes 2 5c coins, replaced with a 10c coin
                //until there are no 5c coins left
                //ups the counter each time
        fifth++;
        tenth = 0;
        twentieth = (20 -(4*fifth));
        c++;
        //adds 1 20c coin, sets 10c coins to 0, fills the rest with 5c coins and adds 1 to the counter
        System.out.println(twentieth+"      "+tenth+"       "+fifth);}
    System.out.println("Total number of possibilities to decompose 1€: "+c);
    }
}
