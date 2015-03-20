package ClassesAndInstances.Excercise1;

/**
 * @author apedraza
 */
public class TestCircle {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Declare and allocate an instance of class Circle called c1
    // with default radius and color
    Circle c1 = new Circle();
    // Use the dot operator to invoke methods of instance c1.
    System.out.println("The " + c1.getColor() + " circle has radius of "
            + c1.getRadius() + " and area of " + c1.getArea());

    // Declare and allocate an instance of class circle called c2
    //  with the given radius and default color
    Circle c2 = new Circle(2.0, "blue");
    // Use the dot operator to invoke methods of instance c2.
    System.out.println("The " + c2.getColor() + " circle has radius of "
            + c2.getRadius() + " and area of " + c2.getArea());
    
    Circle c3 = new Circle();
    c3.setRadius(5.0);
    c3.setColor("green");
    
    System.out.println(c3.toString());
    System.out.println(c1);
  }

}
