public class OperatingSystemException extends Exception {
    private Tool tool;
    private Disk disk;

    public OperatingSystemException(Tool tool, Disk disk) {
        super("Tool " + tool.getName() + " cannot be installed on disk with OS " + disk.getOperatingSystem());
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