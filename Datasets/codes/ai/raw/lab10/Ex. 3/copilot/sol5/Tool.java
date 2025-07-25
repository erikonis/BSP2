public class Tool extends Software {
    private InstallationValidator validator;

    public Tool(String name) {
        super(name);
        this.validator = new ToolInstallationValidator(this);
    }

    @Override
    public InstallStatus install(Disk disk, User user) throws Exception {
        validator.validate(disk, user);
        System.out.println("Installing tool " + getName() + " to disk " + disk.getName());
        return super.install(disk, user);
    }
}