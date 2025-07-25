public interface SoftwareInstallValidator {
    void validate(Disk disk, User user) throws InstallationException;
}