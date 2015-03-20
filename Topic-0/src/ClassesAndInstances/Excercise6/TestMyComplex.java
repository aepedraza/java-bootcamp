package ClassesAndInstances.Excercise6;

/**
 *
 * @author Alvaro Esteban Pedraza <aepedraza3117@gmail.com>
 */
public class TestMyComplex {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    MyComplex c1 = new MyComplex(5.3, 2.45);
    MyComplex c2 = new MyComplex(2.0, 2.0);
    
    System.out.println("c1 = " + c1);
    System.out.println("c2 = " + c2.toString());
    System.out.println();
    
    System.out.println("Testing setters:");
    c1.setReal(4.6);
    c1.setImag(3);
    c2.setValue(3, 0);
    System.out.println("c1 = " + c1);
    System.out.println("c2 = " + c2);
    System.out.println();
    
    System.out.println("Testing boolean methods:");
    System.out.println(c2.isImaginary() ? "c2 is imaginary" : "c2 is not imaginary");
    System.out.println(c2.isReal() ? "c2 is real" : "c2 is not real");
    System.out.println(c1.equals(c2) ? "c1 == c2" : "c1 <> c2");
    System.out.println(c2.equals(3, 0) ? "c1 == (3 + 0i)" : "c1 <> (3 + 0i)");
    System.out.println();
    
    System.out.println("Testing manipulation:");
    System.out.println("|c2| = " + c2.magnitude());
    System.out.println("<(c1) = " + c1.argumentInRadians() + "[rad] = " + c1.argumentInDegrees() + "°");
    System.out.println("conjugation of c1 = " + c1.conjugate());
    System.out.println("c1 + c2 = " + c1.add(c2));
    System.out.println("c2 - (3.5 - 4i) = " + c2.subtract(new MyComplex(3.5, -4)));
    System.out.println("c1 * c2 = " + c1.multiplyWith(c2));
    System.out.println("c2 / c1 = " + c2.divideBy(c1));
  }
  
}
