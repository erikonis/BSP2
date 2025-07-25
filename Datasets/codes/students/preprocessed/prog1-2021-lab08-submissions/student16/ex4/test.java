import java.util.UUID;

public class test {

  public static void main(String[] args) {

    Supermarket Supermarket = new Supermarket();

    Card card1 = new Card(50);

    // Output
    // Test

    System.out.println("*********************");

    // test with a bill which is worth 200$
    // pwp=paid with points
    //
    System.out.println("" + card1.bill(200));
    card1.pwp(12);

    System.out.println("*********************");

  }

}