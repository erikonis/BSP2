public class ToolInstallationException extends Exception {
    private final Tool tool;
    private final Disk disk;

    public ToolInstallationException(Tool tool, Disk disk) {
        super("Tool " + tool.getName() + " cannot be installed on " + disk.getOperatingSystem());
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