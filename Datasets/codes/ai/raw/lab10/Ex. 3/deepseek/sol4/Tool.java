public class Tool extends Software {
    public Tool(String name, int size) {
        super(name, size);
    }

    @Override
    public void install(Disk disk) throws ToolInstallationException, InstallationException {
        // Check if disk is running MacOS
        if (disk.getOperatingSystem() == OperatingSystem.MACOS) {
            throw new ToolInstallationException(this, disk);
        }
        
        // Proceed with normal installation
        super.install(disk);
    }
}