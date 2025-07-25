// InstallationAspect.java (Interface)
public interface InstallationAspect {
    InstallStatus aroundInstall(Software software, Disk disk, User user, InstallationInvocation invocation) throws InstallationException;
}