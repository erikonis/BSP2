package exercise2;


abstract class Actions {
    Character user;

    public Actions(Character user) {
        this.user = user;
    }

    abstract void execute();
}

class Jump extends Actions {

    public Jump(Character user) {
        super(user);
    }

    @Override
    void execute() {
     Logger.log(user.name + " user jumped");
    }
}

class Abilities extends Actions{

    String name;

    public Abilities(Character user,String name) {
        super(user);
        this.name = name;
    }

    @Override
    void execute() {
        Logger.log(user.name + " user used ability " + name);
    }
}

class Targetable extends Actions{

    Character target;
    int value;
    boolean isStrict;

    public Targetable(Character user,Character target,int value,boolean isStrict) {
        super(user);
        this.target = target;
        this.value = value;
        this.isStrict = isStrict;
    }

    @Override
    void execute() {
        if (isStrict){
            if(target != null){
                if (target.redHealth(value)){
                    Logger.log(user.name+" user killed user " + target.name);
                }else {
                    Logger.log(user.name + " user used targetable ability on user " + target.name);
                }
            }else{
                Logger.log(user.name + " action failed (no target specified)");
            }
        }else{
            if (user.redHealth(value)){
                Logger.log(user.name+" killed himself using targetable actioy");
            }else{
                Logger.log(user.name + " used targetable acttion on itself and healt got reduced by " + value);
            }

        }

    }
}
