public class Game extends Software {
    private String licenseId;
    private InstallationValidator validator;

    public Game(String name, String licenseId) {
        super(name);
        this.licenseId = licenseId;
        this.validator = new GameInstallationValidator(this);
    }

    public String getLicenseId() {
        return licenseId;
    }

    @Override
    public InstallStatus install(Disk disk, User user) throws Exception {
        validator.validate(disk, user);
        System.out.println("Installing game " + getName() + " to disk " + disk.getName());
        return super.install(disk, user);
    }
}