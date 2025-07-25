package ex1;
/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        pavilion pav1 = new pavilion("pav1", 10);
        pavilion pav2 = new pavilion("pav2", 10);
        pavilion pav3 = new pavilion("pav3", 10);
        pavilion[] pavArray = new pavilion[3];
        pavArray[0]=pav1;
        pavArray[1]=pav2;
        pavArray[2]=pav3;
        ticket tick = new ticket();
        System.out.println(tick.toString());
    }
}