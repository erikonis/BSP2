public class OSCompatibilityException extends InstallationException {
    private final Tool tool;
    private final Disk disk;

    public OSCompatibilityException(Tool tool, Disk disk) {
        super("OS incompatibility for tool: " + tool.getName());
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