package notasapp;

import Entidades.Materia;
import java.util.Scanner;
import java.util.ArrayList;

public class NotasApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quieres ingresar notas? Ingrese 1 si lo desea.");
        System.out.println("Quieres consultar cuantas materias aprobaste? ingrese 2");
        int opcion = scanner.nextInt();

        ArrayList<Materia> materias = new ArrayList<Materia>();

        while (opcion >= 1 && opcion < 3) {
            switch (opcion) {
                case 1:
                    Materia nuevaMateria = new Materia();

                    System.out.println("Ingrese el nombre de la materia");
                    nuevaMateria.setNombre(scanner.next());

                    System.out.println("Ingrese la nota de la materia");
                    nuevaMateria.setNota(scanner.nextInt());

                    materias.add(nuevaMateria);

                    // Limpiar la consola
                    Materia.limpiar(30);

                    // Mostrar el menu
                    System.out.println("Quieres ingresar notas? Ingrese 1 si lo desea.");
                    System.out.println("Quieres consultar cuantas materias aprobaste? ingrese 2");
                    opcion = scanner.nextInt();

                    break;
                case 2:
                    int materiasAprobadas = 0;
                    int materiasReprobadas = 0;

                    for (Materia materia : materias) {
                        if (materia.getNota() >= 6) {
                            materiasAprobadas = materiasAprobadas + 1;
                        } else {
                            materiasReprobadas = materiasReprobadas + 1;
                        }
                    }

                    System.out.println("Aprobaste " + materiasAprobadas + " materias.");
                    System.out.println("Reprobaste " + materiasReprobadas + " materias.");
                    opcion = 0;
                    break;
            }

        }
    }

    
}
