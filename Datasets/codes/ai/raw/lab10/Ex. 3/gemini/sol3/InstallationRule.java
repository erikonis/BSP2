import java.util.function.BiPredicate;

public interface InstallationRule {
    boolean isApplicable(Software software);
    void check(Software software, Disk disk, User user) throws InstallationException;
}