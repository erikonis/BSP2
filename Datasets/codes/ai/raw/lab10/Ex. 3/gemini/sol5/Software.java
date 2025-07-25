public interface Software {
    String getName();
    InstallStatus install(Disk disk, User user) throws InstallationException;
}