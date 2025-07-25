// Tool.java
public class Tool extends Software {
    public Tool(String name, int size) {
        super(name, size);
    }

    @Override
    public void install(Disk disk) throws ToolInstallationException {
        if (disk.getOperatingSystem() == OperatingSystem.MACOS) {
            throw new ToolInstallationException("Tools cannot be installed on MacOS", this, disk);
        }
        try {
            super.install(disk);
        } catch (Exception e) {
            throw e; // Re-throw any exceptions from Software.install()
        }
    }
}