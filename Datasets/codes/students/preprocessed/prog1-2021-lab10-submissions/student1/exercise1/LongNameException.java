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
