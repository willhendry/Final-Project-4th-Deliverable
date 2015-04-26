public class AddCream implements AddIngredientBehavior  {
  
  final double CREAM_COST;
  
  public AddCream() {
    this.CREAM_COST = 0;
  }
  
  public AddCream(double cost) {
    this.CREAM_COST = cost;
  }
  
  public double add( ) {
    System.out.println("Preparing cream for order...");
    return CREAM_COST;
  }
  
}