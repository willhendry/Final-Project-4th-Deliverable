public class SugarCoffee extends Dispensable {
  
  AddIngredientBehavior coffee = new AddCoffee(0.35);
  AddIngredientBehavior sugar = new AddSugar(0.00);
  
  public SugarCoffee() {
    super();
    totalCost += sugar.add();
    totalCost += coffee.add();
  }
  
}