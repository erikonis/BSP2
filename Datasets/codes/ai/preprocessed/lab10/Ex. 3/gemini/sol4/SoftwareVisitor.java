public interface SoftwareVisitor {
    void visit(Game game, Disk disk, User user) throws InstallationException;
    void visit(Tool tool, Disk disk, User user) throws InstallationException;
}