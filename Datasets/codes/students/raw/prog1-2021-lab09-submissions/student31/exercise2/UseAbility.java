package lu.uni.programming1.lab9.exercise2;


public class UseAbility extends Action {

    String atst = " uses ";
    

    public  UseAbility(Ability someAbility) {System.out.print(atst);  damageAmount=someAbility.damageAmount; }
    
}
