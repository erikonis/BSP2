public class Tool extends Software {

    public Tool(String name) {
        super(name);
    }

    @Override
    public InstallStatus install(User user, Disk disk) throws ToolNotSupportedException {
        if (disk.getOperatingSystem() == OperatingSystem.MACOS) {
            throw new ToolNotSupportedException(this, disk);
        }
        return InstallStatus.SUCCESS;
    }
}