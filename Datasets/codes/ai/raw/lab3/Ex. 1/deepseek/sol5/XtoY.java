import java.util.*;
import java.math.*;

public class XtoY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigDecimal x = sc.nextBigDecimal();
        BigDecimal y = sc.nextBigDecimal();
        BigDecimal d = sc.nextBigDecimal();
        
        for (BigDecimal i = x; i.compareTo(y) <= 0; i = i.add(d)) {
            System.out.println(i.setScale(2, RoundingMode.HALF_UP));
        }
        sc.close();
    }
}