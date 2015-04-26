public class AddCoffee implements AddIngredientBehavior {
  
  final double COFFEE_COST;
  
  public AddCoffee() {
    this.COFFEE_COST = 0;
  }
  
  public AddCoffee(double cost) {
    this.COFFEE_COST = cost;
  }
  
  public double add( ) {
    System.out.println("Preparing coffee for order...");
    return COFFEE_COST;
  }
  
}