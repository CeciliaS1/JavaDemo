import area.CalculadorDeArea;
import cuadratica.FuncionCuadratica;
import java.util.ArrayList;
import java.util.List;
import school.Alumno;

public class Aplication {

  public static void main(String[] args) {
   /* String letter = "a";
    float price = 9f;//aprox5 decimales//
    double elDoble =9d;//tiene el doble de decimales que float
    int number = 4;
    char x = 'a';//es una letra unica//
    boolean esVerdad = true;

    int [] edades = {3,5,7,9,13};
    //edades[2];//para acceder a la posicion 2(el tercer elemento)
    List <String> nombres = new ArrayList<>();
    nombres.add("sebastian");
    //nombres.get(0);
    System.out.println(nombres.get(0));*/
    /*CalculadorDeArea calculador = new CalculadorDeArea();
    double area = calculador.calcularCuadrado(4.6);
    System.out.println(area);
    FuncionCuadratica cuadratica = new FuncionCuadratica();
    double [] resultados = cuadratica.calcular(2,-8,15);
    System.out.println( resultados[0]);

    System.out.println( resultados[0]);
    System.out.println( resultados[1]);*/
    Alumno ceci= new Alumno("Cecilia","Scolaro",26, 104856);
    System.out.println(ceci.toString());

  }

}
