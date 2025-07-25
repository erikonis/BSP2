package Exercise1;

public enum HandlingTimes {

    EXPRESS (1,100),
    PRIORITY(3,50),
    CLASSIC(5, 10),
    NORUSH(8, 0);

private final int days;

private final int handletax;

HandlingTimes (int days, int handletax) {this.days=days; this.handletax=handletax;}

public int getHandlingTime() {return days;}
public int getHandlingTax() {return handletax;}

}