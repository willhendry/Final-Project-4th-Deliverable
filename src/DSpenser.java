import java.text.*;
import java.util.ArrayList;

public class DSpenser {
  
 // private static NumberFormat moneyFormatter = NumberFormat.getCurrencyInstance();
  
  private double moneyCounter;
  private double totalCharge;
  
  private Factory factory;
  private ArrayList<String> orders;
  
  public DSpenser() {
    factory = new Factory(100, 100, 100, 100);
    moneyCounter = 0.00;
    totalCharge = 0.00;
  }
  
  public void updateCounter(double amount) {
    moneyCounter += amount;
  }
  
  public void updateCharge(double charge) {
    totalCharge += charge;
  }
  
  public double getMoneyCounter() {
    return moneyCounter;
  }
  
  public double getTotalCharge() {
    return totalCharge;
  }
  
  public void processOrders(ArrayList<String> orders) {
    
    for (String order:orders) {
      
      Dispensable toDispense = factory.dispense(order, moneyCounter);
      
      if (toDispense != null) {
        moneyCounter -= toDispense.getTotalCost();
        this.updateCharge(toDispense.getTotalCost());
      }
      else break;
    }
  }
  
  
  
  /*public static void main(String [] args) {
    
    DSpenser machine = new DSpenser();
    machine.updateCounter(1);
    
    ArrayList<String> orders = new ArrayList<String>();
    
    for (int i = 0; i < 100; i++) {
      orders.add("SugarCreamCoffee");
      orders.add("Bouillon");
    }
    
    machine.processOrders(orders);
    
    System.out.println(moneyFormatter.format(machine.getMoneyCounter()));
    System.out.println(moneyFormatter.format(machine.getTotalCharge()));
    
  }*/
  
}