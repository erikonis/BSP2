public class Targetable extends Actions {
	private Character target;
	private int damage;
	
	public Targetable(String name, Character user, Character target, int damage) {
		super(name, user);
		this.target = target;
		this.damage = damage;
	}

	public void execute(){
		if (super.getUser().getCurrHealth() <= 0){
			Logs.log("the dead spirit of " + super.getUser() + " tried to use " + super.getName() + " on " + target);
			System.out.println("are you trying to revive zombies???");
		}else if(target.getCurrHealth() <= 0){
			Logs.log(super.getUser() + " tried to use " + super.getName() + " on the dead body of " + target.getName());
			System.out.println("Stop! Stop! they're already dead !!!");
		} else {
			Logs.log(super.toString() + " on " + target + " doing " + damage + " damage");
			target.setCurrHealth(target.getCurrHealth() - damage);
			if(target.getCurrHealth() <= 0){
				Logs.log(target.getName() + " was killed by " + super.getUser());
			}
		}
	}

	public Character getTarget() {
		return target;
	}

	public int getDamage() {
		return damage;
	}
}
