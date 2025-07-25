public class Tool extends Software {
    public Tool(String name) {
        super(name);
    }

    private void validateOperatingSystem(Disk disk) throws OperatingSystemException {
        if (disk.getOperatingSystem() == OperatingSystem.MACOS) {
            throw new OperatingSystemException(this, disk);
        }
    }

    @Override
    public InstallStatus install(Disk disk, User user) throws OperatingSystemException {
        validateOperatingSystem(disk);
        System.out.println("Installing tool " + getName() + " to disk " + disk.getName());
        return super.install(disk, user);
    }
}