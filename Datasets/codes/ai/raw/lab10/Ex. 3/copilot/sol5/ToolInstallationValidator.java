public class ToolInstallationValidator implements InstallationValidator {
    private Tool tool;

    public ToolInstallationValidator(Tool tool) {
        this.tool = tool;
    }

    @Override
    public void validate(Disk disk, User user) throws OperatingSystemException {
        if (disk.getOperatingSystem() == OperatingSystem.MACOS) {
            throw new OperatingSystemException(tool, disk);
        }
    }
}