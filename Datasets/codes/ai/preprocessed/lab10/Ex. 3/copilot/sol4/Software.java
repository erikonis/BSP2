public abstract class Software {
    private String name;

    public Software(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void validateInstallation(Disk disk, User user) throws Exception;

    public InstallStatus install(Disk disk, User user) throws Exception {
        validateInstallation(disk, user);
        System.out.println("Installing " + name + " to disk " + disk.getName());
        return InstallStatus.SUCCESS;
    }
}