package Inheritance;

/**
 *
 * @author Alvaro Esteban Pedraza <aepedraza3117@gmail.com>
 */
public class Rectangle extends Shape{
  private double width;
  private double length;

  public Rectangle() {
    this.width = 1.0;
    this.length = 1.0;
  }

  public Rectangle(double width, double length) {
    this.width = width;
    this.length = length;
  }

  public Rectangle(double width, double length, String color, boolean filled) {
    super(color, filled);
    this.width = width;
    this.length = length;
  }

  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public double getLength() {
    return length;
  }

  public void setLength(double length) {
    this.length = length;
  }
  
  public double getPerimeter() {
    return 2 * (this.getLength() + this.getWidth());
  }
  
  public double getArea() {
    return this.getLength() * this.getWidth();
  }

  @Override
  public String toString() {
    // "A Rectangle with width=xxx and length=zzz, which is a subclass of yyy", 
    // where yyy is the output of the toString() method from the superclass.
    return "A Rectangle with width = " + this.width + " and length = " + this. length
            + "wich is a subclass of " + super.toString();
  }
}
