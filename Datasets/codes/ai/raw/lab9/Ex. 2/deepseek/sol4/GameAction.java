import java.time.Instant;

public sealed interface GameAction {
    record Jump(Character actor, Instant timestamp) implements GameAction {}
    
    record Ability(
        Character actor, 
        String name, 
        Instant timestamp
    ) implements GameAction {}

    record TargetedAbility(
        Character actor,
        Character target,
        String name,
        int power,
        Instant timestamp
    ) implements GameAction {}

    default ActionOutcome execute() {
        return switch (this) {
            case Jump j -> new ActionOutcome.Success(
                j.actor(), 
                null, 
                "%s jumped".formatted(j.actor().name())
            );
            
            case Ability a -> new ActionOutcome.Success(
                a.actor(), 
                null, 
                "%s used %s".formatted(a.actor().name(), a.name())
            );
            
            case TargetedAbility ta -> {
                if (ta.target() == null) {
                    yield new ActionOutcome.Failure(
                        "No target specified for " + ta.name()
                    );
                }
                
                ActionEffect effect = ta.power() > 0 
                    ? ActionEffect.heal(ta.power())
                    : ActionEffect.damage(-ta.power());
                
                Character newTarget = effect.apply(ta.target());
                
                yield new ActionOutcome.Success(
                    ta.actor(),
                    newTarget,
                    "%s used %s on %s (%+d HP)".formatted(
                        ta.actor().name(), 
                        ta.name(), 
                        ta.target().name(), 
                        ta.power()
                    )
                );
            }
        };
    }
}

sealed interface ActionOutcome {
    record Success(
        Character actor,
        Character modifiedTarget,
        String message
    ) implements ActionOutcome {}
    
    record Failure(String errorMessage) implements ActionOutcome {}
}