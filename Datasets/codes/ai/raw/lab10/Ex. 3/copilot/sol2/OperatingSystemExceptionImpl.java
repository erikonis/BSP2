public class OperatingSystemExceptionImpl extends Exception implements OperatingSystemException {
    private Tool tool;
    private Disk disk;

    public OperatingSystemExceptionImpl(Tool tool, Disk disk) {
        super("Tool " + tool.getName() + " cannot be installed on disk with OS " + disk.getOperatingSystem());
        this.tool = tool;
        this.disk = disk;
    }

    @Override
    public Tool getTool() {
        return tool;
    }

    @Override
    public Disk getDisk() {
        return disk;
    }
}