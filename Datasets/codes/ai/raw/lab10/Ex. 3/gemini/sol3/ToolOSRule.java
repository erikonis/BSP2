// ToolOSRule.java
public class ToolOSRule implements InstallationRule {
    @Override
    public boolean isApplicable(Software software) {
        return software instanceof Tool;
    }

    @Override
    public void check(Software software, Disk disk, User user) throws InstallationException {
        Tool tool = (Tool) software;
        if (disk.getOperatingSystem() == OperatingSystem.MACOS) {
            throw new MacOSNotSupportedException("Tool cannot be installed on MacOS.", tool, disk);
        }
    }
}