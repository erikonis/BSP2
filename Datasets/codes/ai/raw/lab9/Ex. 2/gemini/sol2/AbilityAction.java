public class AbilityAction implements Action {
    private Character user;
    private String abilityName;

    public AbilityAction(Character user, String abilityName) {
        if (user == null || abilityName == null || abilityName.trim().isEmpty()) {
            throw new IllegalArgumentException("User and ability name cannot be null or empty.");
        }
        this.user = user;
        this.abilityName = abilityName;
    }

    public String getAbilityName() {
        return abilityName;
    }

    @Override
    public Character getUser() {
        return user;
    }

    @Override
    public boolean execute() {
        EventManager.getInstance().publishEvent(new ActionExecutedEvent(this, true, null));
        System.out.println(user.getName() + " uses ability: " + abilityName);
        return true;
    }

    @Override
    public String getDescription() {
        return "Ability: " + abilityName;
    }

    @Override
    public Target getTarget() {
        return null;
    }
}