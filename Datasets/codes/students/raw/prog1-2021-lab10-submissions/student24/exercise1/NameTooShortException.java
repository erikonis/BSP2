package lu.uni.programming1.lab10.exercise1;

public class NameTooShortException extends Exception {

    private String name;

    public NameTooShortException (String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

}
