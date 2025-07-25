public interface Actions {

    /**
     * Jump
     */
    public class Jump implements Actions {
    
        
    }
    /**
     * Ability 
     */
    public class Ability implements Actions {
        private String name;

        public void setName(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }
    
    /**
     * Targetable
     */
    public class Targetable implements Actions {
        private int powervalue;
        private Character target;
        public Character getTarget() {
            return target;
        }
        public void setTarget(Character target) {
            this.target = target;
        }
         public int getPowervalue() {
            return powervalue;
        }
        public void setPowervalue(int powervalue) {
            this.powervalue = powervalue;
        }  
        
    }
    

        
        
    
        
    }
    
}
