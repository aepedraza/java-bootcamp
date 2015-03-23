package Inheritance;

/**
 *
 * @author Alvaro Esteban Pedraza <aepedraza3117@gmail.com>
 */
public class Shape {
  private String color = "red";
  private boolean filled = false;

  public Shape() {
    this.color = "green";
    this.filled = true;
  }

  public Shape(String color, boolean filled) {
    this.color = color;
    this.filled = filled;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public boolean isFilled() {
    return filled;
  }

  public void setFilled(boolean filled) {
    this.filled = filled;
  }
  
  // "A Shape with color of xxx and filled/Not filled"
  @Override
  public String toString() {
    return "A Shape with" + this.getColor() + "and" +
            (this.isFilled() ? "filled": "NOT filled");
  }
}
