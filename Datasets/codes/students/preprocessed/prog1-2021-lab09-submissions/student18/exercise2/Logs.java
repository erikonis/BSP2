public class Logs {
    private String logs;

    public Logs(){
        logs = "";
    }

    public void saveLog(Action action){
        logs += action.exec()+"\n";
    }

    public void printLog(){
        System.out.println(logs);
    }
}
