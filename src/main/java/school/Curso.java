package school;

import java.util.List;

public class Curso {

  public Curso(String materia, List<Alumno> alumnos, Profesor profesor) {
    this.materia = materia;
    this.alumnos = alumnos;
    this.profesor = profesor;
  }

  private String materia;

  private List<Alumno> alumnos;

  private Profesor profesor;

  public String getMateria() {
    return materia;
  }

  public void setMateria(String materia) {
    this.materia = materia;
  }

  public List<Alumno> getAlumnos() {
    return alumnos;
  }

  public void setAlumnos(List<Alumno> alumnos) {
    this.alumnos = alumnos;
  }

  public Profesor getProfesor() {
    return profesor;
  }

  public void setProfesor(Profesor profesor) {
    this.profesor = profesor;
  }

}
