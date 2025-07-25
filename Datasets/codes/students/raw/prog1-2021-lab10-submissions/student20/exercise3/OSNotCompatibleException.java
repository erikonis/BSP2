package lu.uni.programming1.lab10.exercise3;

public class OSNotCompatibleException extends Exception {
    private Tool tool;
    private Disk disk;
    
    public OSNotCompatibleException(Tool tool, Disk disk) {
        this.tool = tool;
        this.disk = disk;
    }

    public Tool getTool() {
        return tool;
    }

    public Disk getDisk() {
        return disk;
    }
    
    
}
