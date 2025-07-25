public class WrongOperatingSystemException extends Exception{

    public WrongOperatingSystemException() {
        super("This tool can't be installed on MacOS!");
    }
    
}
