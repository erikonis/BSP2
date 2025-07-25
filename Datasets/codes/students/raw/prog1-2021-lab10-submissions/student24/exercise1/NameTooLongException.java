package lu.uni.programming1.lab10.exercise1;

public class NameTooLongException extends Exception {
    
    private String name;

    public NameTooLongException(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
