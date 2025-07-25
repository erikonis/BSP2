public class Tool extends Software {

    public Tool(String name) {
        super(name);
    }

    @Override
    public InstallStatus install(User user, Disk disk) throws ToolInstallException {
        if (disk.getOperatingSystem() == OperatingSystem.MACOS) {
            throw new ToolInstallException(this, disk);
        }
        return disk.installSoftware(this);
    }
}
