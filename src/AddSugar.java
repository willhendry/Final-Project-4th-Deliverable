public class AddSugar implements AddIngredientBehavior  {
  
  final double SUGAR_COST;
  
  public AddSugar() {
    this.SUGAR_COST = 0;
  }
  
  public AddSugar(double cost) {
    this.SUGAR_COST = cost;
  }
  
  public double add( ) {
    System.out.println("Preparing sugar for order...");
    return SUGAR_COST;
  }
  
}