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
