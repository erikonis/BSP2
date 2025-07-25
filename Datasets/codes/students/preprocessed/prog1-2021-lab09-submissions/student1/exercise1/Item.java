public class Item {
  protected String name;
  protected int value; //their cost in gold
  Rarity rarity;

  public Item(){

  }

  public Item(Rarity rarity, String name, int value){
    this.rarity = rarity;
    this.name = name;
    this.value = value;

  }
  public Rarity getRarity() {
      return rarity;
  }

  public String getName() {
      return name;
  }

  public int getValue() {
      return value;
  }
public void use(){
    
} 


  @Override
  public boolean equals(Object object) {
      Item objItem = (Item) object;
      if(objItem.name.compareTo(name) == 0 && objItem.rarity == rarity)
          return true;
      else
          return false;
  }

  @Override
  public int hashCode(){
      return this.name.hashCode() | this.rarity.hashCode() ;
  }

}
