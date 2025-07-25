
public class inventory {

    private int invSize;
    private Item [] inventory ;

  
    

    public inventory(int invSize) {
        this.invSize = invSize;
        inventory = new Item[this.invSize];
       
    }





  




    public boolean addItem(Item item){

        boolean truth = false;

        for (int i = 0; i < inventory.length ; i++){

        if (inventory[i] == null){
            inventory[i] = item;
            truth = true;
            break;
            
        }
        
        }
        for (int i = 0; i < inventory.length; i++){
            if (item instanceof ConsumableItem){
                System.out.println("Added item to inventory: "+"["+item.getRarity()+"] "+item.getName()+" ("+item.getValue()+" Gold) "+"- "+item.getCharges()+" charges");
                System.out.println();
                break;
                
               
                }else if (item instanceof GearItem){
                    System.out.println("Added item to inventory: "+"["+item.getRarity()+"] "+item.getName()+" ("+item.getValue()+" Gold) "+" - "+item.getCriticalhit()+" Critical hit / "+item.getDetermination()+" Determination / "+item.getDirecthit()+" Direct Hit");
                    System.out.println();
                break;
             
                }
                else  System.out.println("Added item to inventory: "+"["+item.getRarity()+"] "+item.getName()+" ("+item.getValue()+" Gold) ");
                System.out.println();
                break;
             
                }
        return truth;

        }
        
        


    

    public int dropitem(Item item){

        int removed = 0;

        for(int i = 0; i < inventory.length; i++){

            if (inventory[i] == item){
                inventory[i] = null ;
                
                removed++;
                break;

            }
            
        }

        if (item instanceof ConsumableItem){
            System.out.println("Dropped "+removed+" instances of item: "+"["+item.getRarity()+"] "+item.getName()+" ("+item.getValue()+" Gold) "+"- "+item.getCharges()+" charges");
            System.out.println();
            }else if (item instanceof GearItem){
                System.out.println("Dropped "+removed+" instances of item: "+"["+item.getRarity()+"] "+item.getName()+" ("+item.getValue()+" Gold) "+" - "+item.getCriticalhit()+" Critical hit / "+item.getDetermination()+" Determination / "+item.getDirecthit()+" Direct Hit");
                System.out.println();
            }
            else  {System.out.println("Dropped "+removed+" instances of item: "+"["+item.getRarity()+"] "+item.getName()+" ("+item.getValue()+" Gold) ");
            System.out.println();
            }
            return removed;
     
        }
       
    

    public void use(int index){


        if (inventory[index] instanceof GearItem){
            System.out.println("The gear item "+inventory[index].getName()+(" created a rampaging Storm above the Monsters."));
           } 
        else if (inventory[index] instanceof ConsumableItem){

            int newcharges = inventory[index].getCharges()-1;

            inventory[index].setCharges(newcharges);


            if(inventory[index].getCharges() == 0){

                System.out.println("The consumable item "+inventory[index].getName()+" has no charges left!");
                System.out.println();
                
                inventory[index] = null;

                
            }else
            System.out.println("Used the consumable item "+inventory[index].getName()+"."+"("+inventory[index].getCharges()+")");
            System.out.println();
        } else{
            System.out.println("Hmm, nothing happened.");
        }System.out.println();
    }


    

    public boolean sell(int index){
        boolean truth2 = false;
        

        if(inventory[index] instanceof GearItem){
            System.out.println("This Item can not be sold!");
       
        } else { 
           

            if (inventory[index] instanceof ConsumableItem){
                System.out.println("Item sold: "+"["+inventory[index].getRarity()+"] "+inventory[index].getName()+" ("+inventory[index].getValue()+" Gold) "+"- "+inventory[index].getCharges()+" charges");
        
                }else if (inventory[index] instanceof GearItem){
                    System.out.println("Item sold: "+"["+inventory[index].getRarity()+"] "+inventory[index].getName()+" ("+inventory[index].getValue()+" Gold) "+" - "+inventory[index].getCriticalhit()+" Critical hit / "+inventory[index].getDetermination()+" Determination / "+inventory[index].getDirecthit()+" Direct Hit");
        
                }
                else  {System.out.println("Item sold: "+"["+inventory[index].getRarity()+"] "+inventory[index].getName()+" ("+inventory[index].getValue()+" Gold) ");
            }
         
            }inventory[index] = null;
            
            truth2=true;

            return truth2 ;

        }


        

       
    

    public void showItem(int index){
    
       if (inventory[index] instanceof ConsumableItem){
        System.out.println("{"+(index+1)+"} "+"["+inventory[index].getRarity()+"] "+inventory[index].getName()+" ("+inventory[index].getValue()+" Gold) "+"- "+inventory[index].getCharges()+" charges");

        }else if (inventory[index] instanceof GearItem){
            System.out.println("{"+(index+1)+"} "+"["+inventory[index].getRarity()+"] "+inventory[index].getName()+" ("+inventory[index].getValue()+" Gold) "+" - "+inventory[index].getCriticalhit()+" Critical hit / "+inventory[index].getDetermination()+" Determination / "+inventory[index].getDirecthit()+" Direct Hit");

        }
        else  System.out.println("{"+(index+1)+"} "+"["+inventory[index].getRarity()+"] "+inventory[index].getName()+" ("+inventory[index].getValue()+" Gold) ");
 
    }

    @Override
    public String toString(){
        return null;


        
    }

    public void printinventory(){

        for(int i = 0; i < inventory.length; i++){

            if(inventory[i] == null){
                System.out.println("{"+(i+1)+"}"+" Empty");
                System.out.println();

            } else

        showItem(i);
        System.out.println();;
    }
}
}
