package Entidades;

public class Materia {
    String nombre;
    double nota;
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    
    public static void limpiar(int lineas) {
        for (int i = 0; i < lineas; i++) {
            System.out.println("");
        }
    }
    
}
