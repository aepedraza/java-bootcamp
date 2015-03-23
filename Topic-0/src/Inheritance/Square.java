/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author Alvaro Esteban Pedraza <aepedraza3117@gmail.com>
 */
public class Square extends Rectangle{

  public Square() {
  }

  public Square(double side) {
    super(side, side);
  }

  public Square(double side, String color, boolean filled) {
    super(side, side, color, filled);
  }

  @Override
  public String toString() {
    //  "A Square with side=xxx, which is a subclass of yyy",
    // where yyy is the output of the toString() method from the superclass.
    return "A Square with side = " + super.getLength()
            + "wich is a subclass of " + super.toString();
  }
  
  public void setSide(double side) {
    super.setLength(side);
    super.setWidth(side);
  }
  
  public double getSide() {
    return super.getWidth();
  }

  @Override
  public void setLength(double length) {
    super.setLength(length);
    super.setWidth(length);
  }

  @Override
  public void setWidth(double width) {
    super.setWidth(width);
    super.setLength(width);
  }
  
  
}
