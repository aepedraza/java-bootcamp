package ClassesAndInstances.Excercise4;

import ClassesAndInstances.Excercise3.MyPoint;

/**
 *
 * @author apedraza
 */
public class TestMyCircle {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    MyCircle c1 = new MyCircle(0, 0, 3);
    MyCircle c2 = new MyCircle(new MyPoint(2, 4), 5);
    
    System.out.println("Testing methods toString() & getters:");
    System.out.println(c1);
    System.out.println(c2);
    System.out.println("Center of c1: " + c1.getCenter());
    System.out.println("Area of c2: " + c1.getArea());
    
    c1.setCenter(new MyPoint(-2, -3));
    c2.setCenterXY(6, 5);
    c1.setRadius(4);
    
    System.out.println("Result of setters:");
    System.out.println(c1.toString());
    System.out.println(c2.toString());
  }
  
}
