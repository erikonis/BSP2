// Tool.java
public class Tool implements Software {
    private String name;

    public Tool(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public InstallStatus install(Disk disk, User user) throws InstallationException {
        // Core installation logic
        return disk.installSoftware(this);
    }
}