package lu.uni.programming1.lab9.exercise2;

public class Launcher {
    static Logs logs = new logs();
    public static void main(String[] args) {
        log.printHP();
        Simulate();

    }
    public static void Simulate(){
        for(int i=0; i<= 5 ; i++){
            Actions.setChoosenAction((int) (Math.random()*3));
            Actions.FetchAction();
        }
    }
    
}
