public class Bouillon extends Dispensable {
  
  AddIngredientBehavior bouillon = new AddBouillon(0.25);
  
  public Bouillon() {
    super();
    totalCost += bouillon.add();
  }
  
}