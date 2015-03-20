package ClassesAndInstances.Excercise1;

/**
 * @author apedraza
 * I can't run this alone because the JVM searchs for the main() method (missing)
 */
public class Circle {
  private double radius;
  private String color;
  
  public Circle(){
    this.radius = 1.0;
    this.color = "red";
  }

  public Circle(double radius) {
    this.radius = radius;
    this.color = "red";
  }

  public Circle(double radius, String color) {
    this.radius = radius;
    this.color = color;
  }

  public double getRadius() {
    return radius;
  }

  public String getColor() {
    return color;
  }

  public double getArea() {
    return this.radius * this.radius * Math.PI;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public void setColor(String color) {
    this.color = color;
  }
  
  @Override
  public String toString() {
    return "Circle: radius=" + this.radius + " color=" + this.color;
  }
}
