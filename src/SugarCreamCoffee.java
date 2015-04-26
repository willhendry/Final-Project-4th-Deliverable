public class SugarCreamCoffee extends Dispensable {
  
  AddIngredientBehavior coffee = new AddCoffee(0.35);
  AddIngredientBehavior cream = new AddCream(0.00);
  AddIngredientBehavior sugar = new AddSugar(0.00);
  
  public SugarCreamCoffee() {
    super();
    totalCost += coffee.add();
    totalCost += sugar.add();
    totalCost += cream.add();
  }
  
}

  
 