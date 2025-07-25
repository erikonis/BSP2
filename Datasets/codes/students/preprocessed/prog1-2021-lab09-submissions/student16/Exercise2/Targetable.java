public class Targetable extends Action {

   


    public Targetable(Character target, Character user, String name, int damage) {
        super(target);
        this.user=user;
        this.name = name;
        this.damage = damage;
    }


    private int damage;
    private Character user;
    private String name;
    private Character target;
    

   

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public Character getTarget() {
        return target;
    }

    public void setTarget(Character target) {
        this.target = target;
    }

    public void execute(Action action, Character target, Character user){


        int currenthealth = target.getMaxhealth()+action.getDamage();
 
         if(action instanceof Targetable && target.getMaxhealth()>0){
             System.out.println(user.getName()+" used "+action.getName()+" on "+target.getName()+"!");
             System.out.println(target.getName()+"s Max health went from "+target.getMaxhealth()+" to "+currenthealth);
 
            }else if (action instanceof Targetable && target.getMaxhealth()<=0){
                
                System.out.println(target.getName()+" died!");
    
            }

 target.setMaxhealth(currenthealth);
         


    }

    public Character getUser() {
        return user;
    }

    public void setUser(Character user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

}
    
    

    

