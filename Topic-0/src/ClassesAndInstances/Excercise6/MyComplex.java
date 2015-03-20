package ClassesAndInstances.Excercise6;

/**
 *
 * @author Alvaro Esteban Pedraza <aepedraza3117@gmail.com>
 */
public class MyComplex {
  private double real;
  private double imag;

  public MyComplex(double real, double imag) {
    this.real = real;
    this.imag = imag;
  }

  public double getReal() {
    return real;
  }

  public void setReal(double real) {
    this.real = real;
  }

  public double getImag() {
    return imag;
  }

  public void setImag(double imag) {
    this.imag = imag;
  }
  
  public void setValue(double real, double imag) {
    this.real = real;
    this.imag = imag;
  }

  @Override
  public String toString() {
    return "(" + this.getReal() + (this.getImag() >= 0 ? " + " : " - ") + Math.abs(this.getImag()) + "i)";
  }
  
  public boolean isReal() {
    return this.imag == 0;
  }
  
  public boolean isImaginary() {
    return this.real == 0;
  }
  
  public boolean equals(double real, double imag) {
    return this.real == real && this.imag == imag;
  }
  
  public boolean equals(MyComplex another) {
    return this.real == another.real && this.imag == another.imag;
  }
  
  public double magnitude() {
    return Math.sqrt(Math.pow(Math.abs(this.real), 2.0) + Math.pow(Math.abs(this.imag), 2.0));
  }
  
  public double argumentInRadians() {
    return Math.atan2(this.imag, this.real);
  }
  
  public int argumentInDegrees() {
    return (int) Math.round(Math.toDegrees(this.argumentInRadians()));
  }
  
  public MyComplex conjugate () {
    return new MyComplex(this.real, -this.imag);
  }
  
  public MyComplex add(MyComplex another) {
    return new MyComplex(this.real + another.real, this.imag + another.imag);
  }
  
  public MyComplex subtract(MyComplex another) {
    return new MyComplex(this.real - another.real, this.imag - another.imag);
  }
  
  public MyComplex multiplyWith(MyComplex another) {
    return new MyComplex(this.real * another.real - this.imag * another.imag, 
                        this.real * another.imag + this.imag * another.real);
  }
  
  public MyComplex divideBy(MyComplex another) {
    double factor = another.real * another.real + another.imag * another.imag;
    return new MyComplex(this.getReal() / factor, this.imag / factor)
            .multiplyWith(new MyComplex(another.getReal() / factor, another.getImag() / factor));
  }
}
