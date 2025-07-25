public class Jump extends Action {

    public Jump(Character target) {
        super(target);
        
    }

    public void execute(Character target){

        if(target.getMaxhealth()>0){

System.out.println(target.getName()+" jumped!");

}else if(target.getMaxhealth()<0){
    System.out.println(target.getName()+" died!");
}
        
        }

    
}


