public class ToolOSValidator implements SoftwareInstallValidator {
    private Tool tool;

    public ToolOSValidator(Tool tool) {
        this.tool = tool;
    }

    @Override
    public void validate(Disk disk, User user) throws InstallationException {
        if (disk.getOperatingSystem() == OperatingSystem.MACOS) {
            throw new MacOSNotSupportedException("Tool cannot be installed on MacOS.", tool, disk);
        }
    }
}