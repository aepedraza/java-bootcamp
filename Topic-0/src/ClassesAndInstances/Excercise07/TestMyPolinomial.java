package ClassesAndInstances.Excercise07;

/**
 *
 * @author Alvaro Esteban Pedraza <aepedraza3117@gmail.com>
 */
public class TestMyPolinomial {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    MyPolinomial a = new MyPolinomial(2.0, 1.5, 3.0, 0.0, 8.0);
    MyPolinomial b = new MyPolinomial("/media/DATOS/CODIGO/java-bootcamp/Topic-0/src/ClassesAndInstances/Excercise7/polinomialConstructor");
//    MyPolinomial b = new MyPolinomial(4, 0, 2, 3.3);
    
    System.out.println("degree(a) = " + a.getDegree());
    System.out.println("degree(b) = " + b.getDegree());
    System.out.println();
    
    System.out.println(a);
    System.out.println(b);
    System.out.println();
    
    System.out.println("a(3.5) = " + a.evaluate(3.5));
    System.out.println("b(4.0) = " + b.evaluate(4.0));
    System.out.println();
    
    System.out.println("a(x) + b(x) = " + a.add(b));
    System.out.println("b(x) + a(x) = " + b.add(a));
    System.out.println();
    
    System.out.println("a(x) * b(x)" + a.multiply(b));
  }
  
}
