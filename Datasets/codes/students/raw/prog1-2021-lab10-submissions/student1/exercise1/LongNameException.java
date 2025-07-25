package lu.uni.programming1.lab10.exercise1;

public class LongNameException extends Throwable {
    private String name;
    
        public LongNameException(String name){
            this.name = name;
        }

        @Override
        public String toString(){
            return "Invalid character name (name is too long - max 20 characters): " + name;
        }
}
