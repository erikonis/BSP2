package lu.uni.programming1.lab7.Exercise1;

public class action {
    private int timeToExecute;

    public action(int timeToExecute) { 
        this.timeToExecute = timeToExecute;
    }

    public int getTime() {
        return timeToExecute;
    }

    public void display() {
        System.out.println("We spent : " + timeToExecute + " seconds");
    }
}