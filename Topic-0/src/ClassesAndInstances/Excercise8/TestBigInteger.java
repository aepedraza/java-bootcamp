package ClassesAndInstances.Excercise8;

import java.math.BigInteger;

/**
 *
 * @author Alvaro Esteban Pedraza <aepedraza3117@gmail.com>
 */
public class TestBigInteger {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    BigInteger b1 = new BigInteger("11111111111111111111111111111111111111111111111111111111111111");
    BigInteger b2 = new BigInteger("22222222222222222222222222222222222222222222222222");
    
    System.out.println("b1 + b2 = " + b1.add(b2));
    System.out.println("b1 * b2 = " + b2.multiply(b1));
  }
  
}
