package ClassesAndInstances.Excercise05;

import ClassesAndInstances.Excercise03.MyPoint;

/**
 *
 * @author apedraza
 */
public class MyTriangle {
  private MyPoint v1;
  private MyPoint v2;
  private MyPoint v3;

  public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
    this.v1 = v1;
    this.v2 = v2;
    this.v3 = v3;
  }
  
  public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
    this.v1 = new MyPoint(x1, y1);
    this.v2 = new MyPoint(x2, y2);
    this.v3 = new MyPoint(x3, y3);
  }

  @Override
  public String toString() {
    return "Triangle @ " + this.v1 + " - " + this.v1.distance(v2)
            + " - "+ this.v2 + " - " + this.v2.distance(v3)
            + " - "+ this.v3 + " - " + this.v3.distance(v1);
  }
  
  public double getPerimeter() {
    return this.v1.distance(this.v2) + this.v2.distance(this.v3) + this.v3.distance(this.v1);
  }
  
  public void printType() {
    if (this.v1.distance(this.v2) == this.v2.distance(this.v3)
            && this.v1.distance(this.v2) == this.v3.distance(v1))
      System.out.println("Equilateral");
    else if(this.v1.distance(this.v2) == this.v2.distance(this.v3)
            || this.v1.distance(this.v2) == this.v3.distance(v1)
            || this.v2.distance(v3) == this.v1.distance(v3))
      System.out.println("Isosceles");
    else System.out.println("Scalene");
  }
}
