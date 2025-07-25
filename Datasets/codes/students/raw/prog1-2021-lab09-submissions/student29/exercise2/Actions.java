package lu.uni.programming1.lab9.exercise2;

public abstract class Actions {
    Character character_;

    public Actions(final Character character_) {
        this.character_ = character_;
    }




    @Override
    public String toString() {
        return "Actions [character_=" + character_ + "]";
    }

    
    
}
