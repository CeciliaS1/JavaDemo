package school;

public class Alumno extends Persona{
private int legajo;
  public Alumno(String nombre, String apellido, int edad, int legajo) {
    super(nombre, apellido, edad);
    this.legajo=legajo;
  }

  @Override
  public String toString() {
    return "Alumno{" + "legajo=" + legajo + '}'+ super.toString();
  }

}
