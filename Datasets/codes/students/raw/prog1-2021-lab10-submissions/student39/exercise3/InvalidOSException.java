package lu.uni.programming1.lab10.exercise3;

public class InvalidOSException extends Exception {
    
    private Tool tool;
    private Disk disk;

    public InvalidOSException(Tool tool, Disk disk) {
        this.tool = tool;
        this.disk = disk;
    }

    public String getMessage() {
        return tool.getName() + " could not be installed on " + disk.getUser().toString() + "'s disk. MacOS is not supported.";
    }
}
