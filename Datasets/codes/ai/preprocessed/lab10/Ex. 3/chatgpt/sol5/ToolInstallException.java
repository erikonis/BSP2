public class ToolInstallException extends Exception {
    private final Tool tool;
    private final Disk disk;

    public ToolInstallException(Tool tool, Disk disk) {
        super(String.format("Tool '%s' cannot be installed on disk with OS '%s'",
                tool.getName(), disk.getOperatingSystem()));
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