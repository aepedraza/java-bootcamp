package ClassesAndInstances.Excercise7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author apedraza
 */
public class MyPolinomial {

  private double[] coeffs;

  public MyPolinomial(double... coeffs) {
    this.coeffs = coeffs;
  }

  public MyPolinomial(String fileName) {
    Scanner in = null;

    try {
      in = new Scanner(new File(fileName));
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    int degree = Integer.parseInt(in.next());
    this.coeffs = new double[degree + 1];
    for (int i = 0; i < this.coeffs.length; i++) {
      this.coeffs[i] = Double.parseDouble(in.next());
    }
  }

  public int getDegree() {
    //for degree = n we have n+1 coeffs (cn, cn-1,..., c0) 
    return this.coeffs.length - 1;
  }

  @Override
  public String toString() {
    String result = "";
    for (int i = this.coeffs.length - 1; i > 1; i--) {
      if (this.coeffs[i] == 0) {
        continue;
      }
      result += this.coeffs[i] == 1.0 ? "x^" + i + " + " : this.coeffs[i] + "x^" + i + " + ";
    }
    result += this.coeffs[1] + "x + ";
    result += this.coeffs[0];
    return result;
  }

  public double evaluate(double x) {
    double result = 0.0;
    for (int i = 0; i < this.coeffs.length; i++) {
      result += this.coeffs[i] * Math.pow(x, i);
    }
    return result;
  }

  public MyPolinomial add(MyPolinomial another) {
    double[] newCoeffs = new double[this.coeffs.length >= another.coeffs.length
            ? this.coeffs.length : another.coeffs.length];

    for (int i = 0; i < this.coeffs.length; i++) {
      newCoeffs[i] = this.coeffs[i];
    }
    for (int i = 0; i < another.coeffs.length; i++) {
      newCoeffs[i] += another.coeffs[i];
    }
    return new MyPolinomial(newCoeffs);
  }

  public MyPolinomial multiply(MyPolinomial another) {
    double[] newCoeffs = new double[this.coeffs.length + another.coeffs.length];

    for (int i = 0; i < this.coeffs.length; i++) {
      for (int j = 0; j < another.coeffs.length; j++) {
        newCoeffs[i + j] += this.coeffs[i] + another.coeffs[j];
      }
    }

    return new MyPolinomial(newCoeffs);
  }
}
