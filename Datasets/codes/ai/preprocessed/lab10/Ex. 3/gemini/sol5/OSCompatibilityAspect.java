public class OSCompatibilityAspect implements InstallationAspect {
    @Override
    public InstallStatus aroundInstall(Software software, Disk disk, User user, InstallationInvocation invocation) throws InstallationException {
        if (software instanceof Tool) {
            Tool tool = (Tool) software;
            if (disk.getOperatingSystem() == OperatingSystem.MACOS) {
                throw new MacOSNotSupportedException("Tool cannot be installed on MacOS.", tool, disk);
            }
        }
        return invocation.invoke(software, disk, user);
    }
}