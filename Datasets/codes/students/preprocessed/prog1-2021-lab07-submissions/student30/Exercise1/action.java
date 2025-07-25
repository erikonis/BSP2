public class action {
    private int timeToExecute;

    public action(int timeToExecute) { // This is the base class for all of our actions. All the actions have this
                                       // variable and this is common
        this.timeToExecute = timeToExecute;
    }

    public int getTime() {
        return timeToExecute;
    }

    public void display() { // It displays the time that was consumed
        System.out.println("We spent : " + timeToExecute + " seconds");
    }
}