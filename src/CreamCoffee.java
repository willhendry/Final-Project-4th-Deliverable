public class CreamCoffee extends Dispensable {
  
  AddIngredientBehavior coffee = new AddCoffee(0.35);
  AddIngredientBehavior cream = new AddCream(0.00);
  
  public CreamCoffee() {
    super();
    totalCost += coffee.add();
    totalCost += cream.add();
  }
  
}