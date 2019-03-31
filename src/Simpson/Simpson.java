package ComputationalMethods;
import InterfaceFunc.Function;

public class Simpson {
  public static double action(double a, double b) {
    return (((this.b - this.a) / 6) * (4 * ((this.a + this.b) / 2)))
  }
}
