import java.time.LocalDate;

public class Targetable extends Ability {
    private int value;
    private boolean onSelf = false;

    public Targetable(Character user, String name, int value) {
        super(user, name);

        this.value = value;
    }

    public Targetable(Character user, String name, int value, boolean onSelf) {
        super(user, name);

        this.value = value;
        this.onSelf = onSelf;
    }

    public void execute(Character target) {
        Event e2= null;
        String ev = LocalDate.now() + ": Targetable ability '" + super.getName() + "' used by " + super.user.getName();
        if (this.user.getCurrHealth() == 0) {
            ev=ev + " - FAIL! ( " + this.user.getName() + " is dead, ghosts cannot cast abilites..yet? )";
        }
        else if (target.getCurrHealth() == 0) {
            ev = ev + " on " + target.getName() + " - FAIL! (Stop it!  " + target.getName() + " is already dead ;-; )";
        }
       else if (target.equals(this.user) && !onSelf) {
             ev = ev+ " - FAIL! ( This targetable ability cannot be cast on themselves)";
        }
        else {target.editHealth(value);
            ev= ev + " on " + target.getName() +" - SUCCESS!"; 

        if (target.getCurrHealth()==0) {
            String d=  LocalDate.now() + ": " + target.getName();
            if (target != super.user)
                d = d + " killed by " + super.user.getName() + " using '" + super.getName()+"'";
            else
                d = d + " managed to kill themselves using '" + super.getName()+"'";
            e2 = new Event(d);
        
        }
        }
        Event e= new Event(ev);
        Logger.create(e);
        if(e2 != null)
        Logger.create(e2);

    }

    public void execute() {
        String ev = LocalDate.now() + ": Targetable ability '" + super.getName() + "' used by " + super.user.getName()
                + " - FAIL! ( no target lol)";
        Event e = new Event(ev);
        Logger.create(e);

    }

}
