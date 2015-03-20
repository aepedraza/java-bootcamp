package ClassesAndInstances.Excercise6;

import java.util.Scanner;

/**
 *
 * @author Alvaro Esteban Pedraza <aepedraza3117@gmail.com>
 */
public class MyComplexApp {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    MyComplex c1, c2;
    double real, imag;
    String input;
    Scanner in  = new Scanner(System.in);
    
    // All data validation is missing for simplicity
    System.out.print("Enter complex number 1 (real and imaginary part): ");
    input = in.nextLine();
    String[] split = input.split("\\s+");
    real = Double.parseDouble(split[0]);
    imag = Double.parseDouble(split[1]);
    c1 = new MyComplex(real, imag);
    System.out.print("Enter complex number 2 (real and imaginary part): ");
    input = in.nextLine();
    split = input.split("\\s+");
    c2 = new MyComplex(Double.parseDouble(split[0]), Double.parseDouble(split[1]));
    System.out.println();
    
    System.out.println("Number 1 is: " + c1);
    if (c1.isReal()) System.out.println(c1 + " IS a pure real number");
    else System.out.println(c1 + " IS NOT a pure real number");
    if (c1.isImaginary()) System.out.println(c1 + " IS a pure imaginary number");
    else System.out.println(c1 + " IS NOT a pure imaginary number");
    System.out.println();
    
    System.out.println("Number 2 is: " + c2);
    if (c2.isReal()) System.out.println(c2 + " IS a pure real number");
    else System.out.println(c2 + " IS NOT a pure real number");
    if (c2.isImaginary()) System.out.println(c2 + " IS a pure imaginary number");
    else System.out.println(c2 + " IS NOT a pure imaginary number");
    System.out.println();
    
    if (c1.equals(c2)) System.out.println(c1 + " IS equal to " + c2);
    else System.out.println(c1 + " IS NOT equal to " + c2);
    
    System.out.println(c1 + " + " + c2 + " = " + c1.add(c2));
    System.out.println(c1 + " - " + c2 + " = " + c1.subtract(c2));
  }
  
}
