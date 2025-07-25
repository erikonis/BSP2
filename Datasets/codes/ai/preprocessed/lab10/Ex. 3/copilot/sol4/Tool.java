public class Tool extends Software {
    public Tool(String name) {
        super(name);
    }

    @Override
    public void validateInstallation(Disk disk, User user) throws OperatingSystemException {
        if (disk.getOperatingSystem() == OperatingSystem.MACOS) {
            throw new OperatingSystemException(this, disk);
        }
    }
}