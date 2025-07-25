public class InvalidInput extends Exception{
    String input;
    public InvalidInput(String input){ this.input = input; }
    public String getInput(){return input;}
}
