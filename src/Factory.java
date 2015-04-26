public class Factory {
  
  private int coffeeLevel;
  private int sugarLevel;
  private int creamLevel;
  private int bouillonLevel; 
  
  public Factory() {
  }
  
  public Factory(int coffeeLevel, int sugarLevel, int creamLevel, int bouillonLevel) {
    this.coffeeLevel = coffeeLevel;
    this.sugarLevel = sugarLevel;
    this.creamLevel = creamLevel;
    this.bouillonLevel = bouillonLevel;
  }
  
  public Dispensable dispense(String type, double moneyCounter) {
    
    Dispensable toDispense = null;
    
    if (type.equals("PlainCoffee") && coffeeLevel > 0) {
      
      toDispense = new PlainCoffee();
      if (moneyCounter > toDispense.getTotalCost()) {
        coffeeLevel -= 1;
        System.out.println("Dispensing " + type);
      }
      else {
        toDispense = null;
        System.out.println("Please add more money for " + type + ".");
      }
      
    }
    else if (type.equals("CreamCoffee") && coffeeLevel>0 && creamLevel>0) {
      
      toDispense = new CreamCoffee();
      if (moneyCounter > toDispense.getTotalCost()) {
        coffeeLevel -= 1;
        creamLevel -= 1;
        System.out.println("Dispensing " + type);
      }
      else {
        toDispense = null;
        System.out.println("Please add more money for " + type + ".");
      }
      
    }
    else if (type.equals("SugarCoffee") && coffeeLevel>0 && sugarLevel>0 ) {
      
      toDispense = new SugarCoffee();
      if (moneyCounter > toDispense.getTotalCost()) {
        coffeeLevel -= 1;
        sugarLevel -= 1;
        System.out.println("Dispensing " + type);
      }
      else {
        toDispense = null;
        System.out.println("Please add more money for " + type + ".");
      }
      
    }
    else if (type.equals("SugarCreamCoffee") && coffeeLevel>0 && sugarLevel>0 && creamLevel>0) {
      
      toDispense = new SugarCreamCoffee();
      if (moneyCounter > toDispense.getTotalCost()) {
        coffeeLevel -= 1;
        sugarLevel -= 1;
        creamLevel -= 1;
        System.out.println("Dispensing " + type);
      }
      else {
        toDispense = null;
        System.out.println("Please add more money for " + type + ".");
      }
      
    }
    else if (type.equals("Bouillon") && bouillonLevel>0) {
      
      toDispense = new Bouillon();
      if (moneyCounter > toDispense.getTotalCost()) {
        bouillonLevel -= 1;
        System.out.println("Dispensing " + type);
      }
      else {
        toDispense = null;
        System.out.println("Please add more money for " + type + ".");
      }
      
    }
    else {
      System.out.println( "Ingredients not available for the order!");
    }
    
    return toDispense;
  }
  
}