import java.util.ArrayList;
import java.util.List;

public class InstallationService {
    private static final List<InstallationRule> rules = new ArrayList<>();

    static {
        rules.add(new GameLicenseRule());
        rules.add(new ToolOSRule());
        // Add more rules here as needed
    }

    public static void install(Software software, Disk disk, User user) throws InstallationException {
        for (InstallationRule rule : rules) {
            if (rule.isApplicable(software)) {
                rule.check(software, disk, user);
            }
        }
        // If all applicable rules pass, the installation can proceed in the caller.
    }
}