package lu.uni.programming1.lab9.exercise3.Exercise2;

public class Log {
    String log;

    public Log(){
        log = "";
    }

    public void setLog(Action action){
        log += action.execute()+ "\n";
    }

    public void print(){
        System.out.println(log);
    }
}
