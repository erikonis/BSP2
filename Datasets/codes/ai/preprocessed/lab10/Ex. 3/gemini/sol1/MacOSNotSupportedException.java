public class MacOSNotSupportedException extends InstallationException {
    private Tool tool;
    private Disk disk;

    public MacOSNotSupportedException(String message, Tool tool, Disk disk) {
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