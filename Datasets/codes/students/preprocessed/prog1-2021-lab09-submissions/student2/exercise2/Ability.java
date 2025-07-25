public class Ability {
    
    private String abilityName;

public Ability(String abilityName){
    this.abilityName=abilityName;
}

public String getAbilityName() {
    return abilityName;
}

public void setAbilityName(String abilityName) {
    this.abilityName = abilityName;
}

public void use() {
    System.out.println(abilityName+" ability gets used.");
}

@Override
public String toString() {
    return "Ability: "+ abilityName;
}



}
