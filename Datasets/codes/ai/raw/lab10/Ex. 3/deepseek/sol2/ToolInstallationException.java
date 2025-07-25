// ToolInstallationException.java
public class ToolInstallationException extends InstallationException {
    private final Tool tool;
    private final Disk disk;

    public ToolInstallationException(Tool tool, Disk disk) {
        super(String.format("Tool %s cannot be installed on %s", 
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