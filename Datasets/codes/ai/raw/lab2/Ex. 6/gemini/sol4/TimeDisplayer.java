public class TimeDisplayer {
    public void display(String label, Time time) {
        System.out.println(label + ": " + time.format());
    }
}