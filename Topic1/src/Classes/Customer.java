package Classes;

/**
 *
 * @author Alvaro Esteban Pedraza <aepedraza3117@gmail.com>
 */
public class Customer {
  private String name;
  private String email;
  private String PaypalPass;
  private long creditCardNumber;

  public Customer(String name, String email, String PaypalPass, long creditCardNumber) {
    this.name = name;
    this.email = email;
    this.PaypalPass = PaypalPass;
    this.creditCardNumber = creditCardNumber;
  }

  public Customer(String email, String PaypalPass) {
    this.email = email;
    this.PaypalPass = PaypalPass;
  }

  public Customer(String name, long creditCardNumber) {
    this.name = name;
    this.creditCardNumber = creditCardNumber;
  }
  

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPaypalPass() {
    return PaypalPass;
  }

  public void setPaypalPass(String PaypalPass) {
    this.PaypalPass = PaypalPass;
  }

  public long getCreditCardNumber() {
    return creditCardNumber;
  }

  public void setCreditCardNumber(long creditCardNumber) {
    this.creditCardNumber = creditCardNumber;
  }
}
