public class Tool extends Software {
    public Tool(String name, int size) {
        super(name, size);
    }

    @Override
    public void install(Disk targetDisk) throws OSCompatibilityException, InstallationException {
        checkOSCompatibility(targetDisk);
        super.install(targetDisk);
    }

    private void checkOSCompatibility(Disk disk) throws OSCompatibilityException {
        if (disk.getOperatingSystem() == OperatingSystem.MACOS) {
            throw new OSCompatibilityException(this, disk);
        }
    }
}