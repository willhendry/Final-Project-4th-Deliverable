public class AddBouillon implements AddIngredientBehavior {
  
  final double BOUILLON_COST;
  
  public AddBouillon() {
    this.BOUILLON_COST = 0;
  }
  
  public AddBouillon(double cost) {
    this.BOUILLON_COST = cost;
  }
    
  public double add( ) {
    System.out.println("Preparing Bouillon for order...");
    return BOUILLON_COST;
  }
  
}