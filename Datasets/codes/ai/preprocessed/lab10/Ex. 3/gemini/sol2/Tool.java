public class Tool extends Software {
    private SoftwareInstallValidator osValidator;

    public Tool(String name) {
        super(name);
        this.osValidator = new ToolOSValidator(this);
    }

    @Override
    public InstallStatus install(Disk disk, User user) throws InstallationException {
        osValidator.validate(disk, user);
        return disk.installSoftware(this);
    }
}