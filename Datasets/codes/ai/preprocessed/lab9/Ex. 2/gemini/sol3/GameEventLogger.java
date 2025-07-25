import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

class Character {
    private String name;
    private int maxHealth;
    private int currentHealth;

    public Character(String name, int maxHealth) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
        if (maxHealth <= 0) {
            throw new IllegalArgumentException("Maximum health must be positive.");
        }
    }

    public String getName() {
        return name;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = Math.max(0, Math.min(currentHealth, maxHealth));
    }

    public boolean isAlive() {
        return currentHealth > 0;
    }

    public void takeDamage(int damage) {
        if (damage < 0) {
            throw new IllegalArgumentException("Damage cannot be negative.");
        }
        this.currentHealth -= damage;
        if (this.currentHealth < 0) {
            this.currentHealth = 0;
        }
    }

    public void heal(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Heal amount cannot be negative.");
        }
        this.currentHealth = Math.min(this.currentHealth + amount, this.maxHealth);
    }

    @Override
    public String toString() {
        return name + " (HP: " + currentHealth + "/" + maxHealth + ")";
    }
}

abstract class Action {
    private Character user;

    public Action(Character user) {
        if (user == null) {
            throw new IllegalArgumentException("Action user cannot be null.");
        }
        this.user = user;
    }

    public Character getUser() {
        return user;
    }

    public abstract boolean execute();
    public abstract String getDescription();
    public abstract Character getTarget(); // Default implementation, can be overridden
}

class JumpAction extends Action {
    public JumpAction(Character user) {
        super(user);
    }

    @Override
    public boolean execute() {
        Logger.getInstance().logAction(this, true, null);
        System.out.println(getUser().getName() + " jumps!");
        return true;
    }

    @Override
    public String getDescription() {
        return "Jump";
    }

    @Override
    public Character getTarget() {
        return null;
    }
}

class AbilityAction extends Action {
    private String abilityName;

    public AbilityAction(Character user, String abilityName) {
        super(user);
        if (abilityName == null || abilityName.trim().isEmpty()) {
            throw new IllegalArgumentException("Ability name cannot be null or empty.");
        }
        this.abilityName = abilityName;
    }

    public String getAbilityName() {
        return abilityName;
    }

    @Override
    public boolean execute() {
        Logger.getInstance().logAction(this, true, null);
        System.out.println(getUser().getName() + " uses ability: " + abilityName);
        return true;
    }

    @Override
    public String getDescription() {
        return "Ability: " + abilityName;
    }

    @Override
    public Character getTarget() {
        return null;
    }
}

class TargetableAbilityAction extends Action {
    private String abilityName;
    private Character target;
    private int power;

    public TargetableAbilityAction(Character user, String abilityName, Character target, int power) {
        super(user);
        if (abilityName == null || abilityName.trim().isEmpty()) {
            throw new IllegalArgumentException("Ability name cannot be null or empty.");
        }
        this.abilityName = abilityName;
        this.target = target;
        this.power = power;
    }

    public String getAbilityName() {
        return abilityName;
    }

    @Override
    public Character getTarget() {
        return target;
    }

    public int getPower() {
        return power;
    }

    @Override
    public boolean execute() {
        if (target == null) {
            Logger.getInstance().logAction(this, false, null);
            System.out.println(getUser().getName() + " tried to use targetable ability '" + abilityName + "' but no target was specified!");
            return false;
        }

        int initialTargetHealth = target.getCurrentHealth();
        target.takeDamage(-power); // Negative power means heal
        int finalTargetHealth = target.getCurrentHealth();

        Logger.getInstance().logAction(this, true, target);
        System.out.println(getUser().getName() + " uses '" + abilityName + "' on " + target.getName() + " with power " + power + ".");

        // Check for kill events
        if (initialTargetHealth > 0 && finalTargetHealth <= 0) {
            if (target != getUser()) {
                Logger.getInstance().logKill(getUser(), target);
            } else {
                Logger.getInstance().logSelfKill(getUser());
            }
        }

        return true;
    }

    @Override
    public String getDescription() {
        return "Targetable Ability: " + abilityName + (target != null ? " on " + target.getName() : " (no target)");
    }
}

// Singleton Logger Class
class Logger {
    private static Logger instance;
    private List<String> logs;
    private DateTimeFormatter formatter;

    private Logger() {
        this.logs = new ArrayList<>();
        this.formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("Game Logger initialized.");
    }

    public static Logger getInstance() {
        if (instance == null) {
            synchronized (Logger.class) {
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    public void logAction(Action action, boolean success, Character target) {
        String timestamp = LocalDateTime.now().format(formatter);
        String logEntry = "[" + timestamp + "] ACTION: " + action.getUser().getName() + " used '" + action.getDescription() + "'";
        if (target != null) {
            logEntry += " on " + target.getName();
        }
        logEntry += ". Success: " + success;
        logs.add(logEntry);
    }

    public void logKill(Character killer, Character victim) {
        String timestamp = LocalDateTime.now().format(formatter);
        String logEntry = "[" + timestamp + "] KILL: " + killer.getName() + " killed " + victim.getName() + ".";
        logs.add(logEntry);
    }

    public void logSelfKill(Character character) {
        String timestamp = LocalDateTime.now().format(formatter);
        String logEntry = "[" + timestamp + "] SELF-KILL: " + character.getName() + " killed themself.";
        logs.add(logEntry);
    }

    public void printLogs() {
        System.out.println("\n--- Game Event Logs ---");
        for (String log : logs) {
            System.out.println(log);
        }
    }
}

public class GameEventLogger {
    public static void main(String[] args) {
        Character hero = new Character("Hero", 100);
        Character monster = new Character("Goblin", 50);

        System.out.println("Initial State:");
        System.out.println(hero);
        System.out.println(monster);
        System.out.println();

        Action jump = new JumpAction(hero);
        jump.execute();
        System.out.println();

        Action basicAttack = new AbilityAction(hero, "Basic Attack");
        basicAttack.execute();
        System.out.println();

        Action strongHit = new TargetableAbilityAction(hero, "Strong Hit", monster, 25);
        strongHit.execute();
        System.out.println(monster);
        System.out.println();

        Action healSelf = new TargetableAbilityAction(hero, "Heal", hero, -10);
        healSelf.execute();
        System.out.println(hero);
        System.out.println();

        Action weakHealNoTarget = new TargetableAbilityAction(hero, "Weak Heal", null, -5);
        weakHealNoTarget.execute();
        System.out.println();

        Action finalBlow = new TargetableAbilityAction(hero, "Final Blow", monster, 100);
        finalBlow.execute();
        System.out.println(monster);
        System.out.println();

        Action selfDestruct = new TargetableAbilityAction(monster, "Self Destruct", monster, 50);
        selfDestruct.execute();
        System.out.println(monster);
        System.out.println();

        Logger.getInstance().printLogs();
    }
}