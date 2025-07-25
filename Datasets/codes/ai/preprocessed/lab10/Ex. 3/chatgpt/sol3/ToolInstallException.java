public class ToolInstallException extends Exception {
    private final Tool tool;
    private final Disk disk;

    public ToolInstallException(Tool tool, Disk disk) {
        super("Installation failed: tool cannot be installed on macOS.");
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