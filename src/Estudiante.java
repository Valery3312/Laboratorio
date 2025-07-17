// Clase Estudiante con atributos privados:
public class Estudiante {
    // Atributos privados
    private String nombre;
    private double nota1;
    private double nota2;
    private double nota3;

// Constructor con valores iniciales:
public Estudiante(String nombre, double nota1, double nota2, double nota3) {
    this.nombre = nombre;
    this.nota1 = nota1;
    this.nota2 = nota2;
    this.nota3 = nota3;
}

//Métodos Getter y Setter:
public String getNombre() { return nombre; }
public void setNombre(String nombre) { this.nombre = nombre; }
public double getNota1() { return nota1; }
public void setNota1(double nota1) { this.nota1 = nota1; }
public double getNota2() { return nota2; }
public void setNota2(double nota2) { this.nota2 = nota2; }
public double getNota3() { return nota3; }
public void setNota3(double nota3) { this.nota3 = nota3; }

    // Intento acceder directamente desde el main (Error):
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Carlos", 9.0, 8.5, 7.5);
        // System.out.println(e1.nombre); // Error por atributo privado

    // Mostrar valores con get:
        System.out.println("Nombre: " + e1.getNombre());
        System.out.println("Nota 1: " + e1.getNota1());
        System.out.println("Nota 2: " + e1.getNota2());
        System.out.println("Nota 3: " + e1.getNota3());

        // Cambiar nota2 usando set y mostrar nuevamente:
        e1.setNota2(9.5);
 System.out.println("Nota 2 corregida: " + e1.getNota2());
}
    }