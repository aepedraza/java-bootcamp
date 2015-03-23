package Classes;

import Enums.PayForm;

/**
 *
 * @author Alvaro Esteban Pedraza <aepedraza3117@gmail.com>
 */
public class ShoppingCart {
  private PayForm payForm;
  private Item[] items;
  private float discount;
  private static long counter = 0;

  public ShoppingCart() {
    counter += 1;
  }

  public ShoppingCart(Item[] items) {
    this.items = items;
    counter += 1;
  }

  public ShoppingCart(PayForm payForm, Item[] items) {
    this.setPayForm(payForm);
    this.items = items;
    counter += 1;
  }

  public PayForm getPayForm() {
    return payForm;
  }

  public void setPayForm(PayForm payForm) {
    this.payForm = payForm;
    setDiscount();
  }

  public Item[] getItems() {
    return items;
  }

  public void setItems(Item[] items) {
    this.items = items;
  }
  
  public void setDiscount() {
    float totalPrice = 0.0f;
    float mostExpensive = 0.0f;
    float mostCheap = 0.0f;
    switch(this.payForm){
      case CREDIT_CARD: {
        for (Item item: this.items){
          totalPrice += item.getPrice();
        }
        this.discount = 0.1f * totalPrice;
        break;
      }
      
      case CASH: {
        for(Item item: this.items){
          if(item.getPrice() > mostExpensive)
            mostExpensive = item.getPrice();
        }
        this.discount = 0.9f * mostExpensive;
        break;
      }
      
      case PAYPAL: {
        for(Item item: this.items){
          if(item.getPrice() < mostCheap)
            mostCheap = item.getPrice();
        }
        this.discount = mostCheap;
        break;
      }
    }
  }

  public void viewCart() {
    // * Item Name ....... $ price
    for(Item item: this.items){
      System.out.println("* " + item.getName() + " ....... $" + item.getPrice());
    }
    if(this.discount == null) System.out.println("Discount not set");
    else System.out.println("You have a total discount of $" + this.discount);
  }
}
