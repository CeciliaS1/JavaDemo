package cuadratica;

public class FuncionCuadratica {

  private double getPrimeraParte(double a, double b, double c) {
    return Math.sqrt(b * b - (4 * a * c));
  }

  private double getSegundaParte(double b) {
    return b * -1;
  }

  private double getTerceraParte(double a) {
    return 2 * a;
  }

  private double getXuno(double a, double b, double c) {
    return (this.getSegundaParte(b) + this.getPrimeraParte(a, b, c)) / this.getTerceraParte(a);
  }
  private double getXdos(double a, double b, double c) {
    return (this.getSegundaParte(b) - this.getPrimeraParte(a, b, c)) / this.getTerceraParte(a);
  }
  public double[] calcular(double a, double b, double c) {
  double [] resultados = {this.getXuno(a,b,c), this.getXdos(a,b,c)};
  return resultados;
  }

}
