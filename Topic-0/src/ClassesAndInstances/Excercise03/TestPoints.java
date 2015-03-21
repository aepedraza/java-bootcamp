package ClassesAndInstances.Excercise03;

/**
 *
 * @author apedraza
 */
public class TestPoints {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    MyPoint p1 = new MyPoint();
    MyPoint p2 = new MyPoint(3, 4);
    MyPoint p3 = new MyPoint();
    
    p1.setX(0);
    p1.setY(3);
    p3.setXY(5, 5);
    
    System.out.println("p1: " + p1);
    System.out.println("p2: " + p2.toString());
    System.out.println("distance p1-p2: " + p1.distance(p2));
    System.out.println("distance p1-(0, 0): " + p3.distance(0, 0));
    
    MyPoint[] points = new MyPoint[10];
    for (int i = 0; i < points.length; i++) points[i] = new MyPoint(i + 1, i + 1);
    for (MyPoint p : points) System.out.print(p);
    
    System.out.println(p1.distance(p2) == p2.distance(p1));
  }
  
}
