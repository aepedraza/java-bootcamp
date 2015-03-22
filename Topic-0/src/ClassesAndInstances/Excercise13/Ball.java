package ClassesAndInstances.Excercise13;

/**
 *
 * @author Alvaro Esteban Pedraza <aepedraza3117@gmail.com>
 */
public class Ball {
  private float x, y;
  private int radius;
  private float xDelta, yDelta;

  public Ball(float x, float y, int radius, float speed, float direction) {
    this.x = x;
    this.y = y;
    this.radius = radius;
    this.xDelta = speed * (float) Math.cos(Math.toRadians(direction));
    this.yDelta = -1 * speed * (float) Math.sin(Math.toRadians(direction));
  }

  public float getX() {
    return x;
  }

  public void setX(float x) {
    this.x = x;
  }

  public float getY() {
    return y;
  }

  public void setY(float y) {
    this.y = y;
  }

  public int getRadius() {
    return radius;
  }

  public void setRadius(int radius) {
    this.radius = radius;
  }

  public float getxDelta() {
    return xDelta;
  }

  public void setxDelta(float xDelta) {
    this.xDelta = xDelta;
  }

  public float getyDelta() {
    return yDelta;
  }

  public void setyDelta(float yDelta) {
    this.yDelta = yDelta;
  }
  
  public void setXY(float x, float y) {
    this.x = x;
    this.y = y;
  }
  
  public void move() {
    this.x += xDelta;
    this.y += yDelta;
  }
  
  public void reflectHorizontal() {
    this.xDelta = -1 * this.xDelta;
  }
  
  public void reflectVertical() {
    this.yDelta = -1 * this.yDelta;
  }

  @Override
  public String toString() {
    return "Ball at (" + this.x + ", " + this.y 
            + ") of velocity (" + this.xDelta + ", " + this.yDelta + ")";
  }
}
