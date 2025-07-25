public class Tool extends Software {

    public Tool(String name) {
        super(name);
    }

    @Override
    public InstallStatus install(Disk disk, User user) throws InstallationException {
        if (disk.getOperatingSystem() == OperatingSystem.MACOS) {
            throw new MacOSNotSupportedException("Tool cannot be installed on MacOS.", this, disk);
        }
        return disk.installSoftware(this);
    }
}