public class ToolInstallationException extends Exception {
    private final Tool tool;
    private final Disk disk;

    public ToolInstallationException(String message, Tool tool, Disk disk) {
        super(message);
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