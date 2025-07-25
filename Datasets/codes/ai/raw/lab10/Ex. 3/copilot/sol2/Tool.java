public class Tool extends Software {
    public Tool(String name) {
        super(name);
    }

    @Override
    public InstallStatus install(Disk disk, User user) throws OperatingSystemExceptionImpl {
        if (disk.getOperatingSystem() == OperatingSystem.MACOS) {
            OperatingSystemExceptionImpl exception = new OperatingSystemExceptionImpl(this, disk);
            System.err.println("Installation failed: " + exception.getMessage());
            throw exception;
        }
        System.out.println("Installing tool " + getName() + " to disk " + disk.getName());
        return super.install(disk, user);
    }
}