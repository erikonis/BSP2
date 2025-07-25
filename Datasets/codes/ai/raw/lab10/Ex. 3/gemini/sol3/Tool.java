public class Tool extends Software {

    public Tool(String name) {
        super(name);
    }

    @Override
    public InstallStatus install(Disk disk, User user) throws InstallationException {
        InstallationService.install(this, disk, user);
        return disk.installSoftware(this);
    }
}