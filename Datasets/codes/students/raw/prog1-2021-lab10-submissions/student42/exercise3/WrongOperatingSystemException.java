package lu.uni.programming1.lab10.exercise3;

public class WrongOperatingSystemException extends Exception{

    public WrongOperatingSystemException() {
        super("This tool can't be installed on MacOS!");
    }
    
}
