public class ToolNotSupportedException extends Exception {
    private final Tool tool;
    private final Disk disk;

    public ToolNotSupportedException(Tool tool, Disk disk) {
        super("Tool cannot be installed on this OS.");
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