public class Tool extends Software {
    public Tool(String name, int size) {
        super(name, size);
    }

    @Override
    public void install(Disk disk) throws ToolInstallationException, Exception {
        if (disk.getOperatingSystem() == OperatingSystem.MACOS) {
            throw new ToolInstallationException(this, disk);
        }
        super.install(disk);
    }
}