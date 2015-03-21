package ClassesAndInstances.Excercise05;

import ClassesAndInstances.Excercise03.MyPoint;

/**
 *
 * @author apedraza
 */
public class TestMyTriangle {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    MyTriangle t1 = new MyTriangle(0, 0, 4, 0, 2, 4);
    MyTriangle t2 = new MyTriangle(new MyPoint(0, 0), new MyPoint(-5, 3), new MyPoint(2, 2));
    
    t1.printType();
    t2.printType();
    
    System.out.println(t1);
    System.out.println(t2.toString());
    
    System.out.println(t1.getPerimeter());
    System.out.println(t2.getPerimeter());
    
    
  }
  
}
