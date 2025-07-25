/**
 * test
 */
public class test {

    public static void main(String[] args) {
        robot rob = new robot(3000);
        controller con = new controller();
        con.doact(rob, "down");
        con.doact(rob, "left");
        con.doact(rob, "left");
        con.doact(rob, "left");
        con.multiact(rob, "down", "lift", "down", "down", "hdpic", "right", "right", "down", "left", "down", "down");
    }
}