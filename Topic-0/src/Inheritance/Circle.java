package Inheritance;

/**
 *
 * @author Alvaro Esteban Pedraza <aepedraza3117@gmail.com>
 */
public class Circle extends Shape{
  private double radius;

  public Circle() {
    this.radius = 1.0;
  }

  public Circle(double radius) {
    this.radius = radius;
  }

  public Circle(double radius, String color, boolean filled) {
    super(color, filled);
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }
  
  public double getArea() {
    return Math.PI * Math.pow(this.getRadius(), 2);
  }
  
  public double getPerimeter() {
    return 2 * Math.PI * this.getRadius();
  }

  @Override
  public String toString() {
    //  "A Circle with radius=xxx, which is a subclass of yyy
    // where yyy is the output of the toString() method from the superclass.
    return "A Circle with radius = " + this.getRadius()
            + ", wich is a subclass of " + super.toString();
  }
  
  
}
