package ClassesAndInstances.Excercise13;

/**
 *
 * @author Alvaro Esteban Pedraza <aepedraza3117@gmail.com>
 */
public class Container {
  private float xTopLeft, yTopLeft;
  private float xBottomRight, yBottomRight;

  public Container(float xTopLeft, float yTopLeft, float width, float height) {
    this.xTopLeft = xTopLeft;
    this.yTopLeft = yTopLeft;
    // Missing width > 0 and heiht > 0 validation
    this.xBottomRight = xTopLeft + width;
    this.yBottomRight = yTopLeft = height;
  }

  @Override
  public String toString() {
    //  "Container at (x1,y1) to (x2, y2)"
    return "Container at (" + xTopLeft + ", " + yTopLeft + ") "
            + "to (" + xBottomRight + ", " + yBottomRight + ")";
  }

  public float getxTopLeft() {
    return xTopLeft;
  }

  public void setxTopLeft(float xTopLeft) {
    this.xTopLeft = xTopLeft;
  }

  public float getyTopLeft() {
    return yTopLeft;
  }

  public void setyTopLeft(float yTopLeft) {
    this.yTopLeft = yTopLeft;
  }

  public float getxBottomRight() {
    return xBottomRight;
  }

  public void setxBottomRight(float xBottomRight) {
    this.xBottomRight = xBottomRight;
  }

  public float getyBottomRight() {
    return yBottomRight;
  }

  public void setyBottomRight(float yBottomRight) {
    this.yBottomRight = yBottomRight;
  }
  
  
  public boolean collidesWith(Ball ball) {
    boolean result = false;
    if(ball.getX() - ball.getRadius() <= this.getxTopLeft() ||
        ball.getX() - ball.getRadius() >= this.getxBottomRight()) {
      ball.reflectHorizontal();
      result = true;
    }
    
    if(ball.getY() - ball.getRadius() <= this.getyTopLeft() ||
        ball.getY() - ball.getRadius() >= this.getyBottomRight()) {
      ball.reflectVertical();
      result = true;
    }
    
    return result;
  }
}
