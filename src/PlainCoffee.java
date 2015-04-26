public class PlainCoffee extends Dispensable {
  
  AddIngredientBehavior coffee = new AddCoffee(0.35);
  
  public PlainCoffee() {
    super();
    totalCost += coffee.add();
  }
  
}