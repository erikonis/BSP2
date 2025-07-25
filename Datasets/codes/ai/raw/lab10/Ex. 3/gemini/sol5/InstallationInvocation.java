// InstallationInvocation.java (Simulates JoinPoint/Proceed)
public interface InstallationInvocation {
    InstallStatus invoke(Software software, Disk disk, User user) throws InstallationException;
}