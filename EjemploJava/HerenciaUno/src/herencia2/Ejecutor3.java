package herencia2;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import herencia1.EstudianteDistancia;
import herencia1.EstudiantePresencial;

/**
 *
 * @author Daniel
 */
public class Ejecutor3 {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        /*
        En el método **main**, se debe permitir ingresar objetos 
        de tipo Estudiante Distancia y Estudiante Presencial. 
        Uno a la vez. Si el usuario ingresa 1, se debe crear un 
        Estudiante Distancia por teclado; si ingresa 2, se debe crear un 
        Estudiante Presencial. Los datos de entrada serán ingresados por 
        teclado.

        Restricciones:
        * En el código solo debe usar por una sola ocasión la siguiente 
        sentencias
        ```
            nombres = entrada.nextLine()
            apellidos = entrada.nextLine()
            cedula = entrada.nextLine()
            edad = entrada.nextInt()
        ```
        * Si el usuario ingresa algo diferente de 1 o 2; el programa debe 
        presentar un mensaje que diga: "Error, opción no válida."
        
         */
        int op;
        
        System.out.println("Ingrese [1] para crear Estudiante Distancia\n"
                         + "Ingrese [2] para crear Estudiante Presencial");
        op = entrada.nextInt();
        
        if (op > 2 || op < 1) {
            System.err.println("Error, opción no válida");
        } else {
            entrada.nextLine();
            System.out.println("Ingrese nombres: ");
            String nombres = entrada.nextLine();
            System.out.println("Ingrese apellidos: ");
            String apellidos = entrada.nextLine();
            System.out.println("Ingrese cedula: ");
            String cedula = entrada.nextLine();
            System.out.println("Ingrese edad: ");
            int edad = entrada.nextInt();

            switch (op) {
                case 1:
                    EstudianteDistancia estudiante = new EstudianteDistancia();
                    estudiante.establecerNombresEstudiante(nombres);
                    estudiante.establecerApellidoEstudiante(apellidos);
                    estudiante.establecerIdentificacionEstudiante(cedula);
                    estudiante.establecerEdadEstudiante(edad);
                    
                    System.out.println("Ingrese numero de Asignaturas: ");
                    estudiante.establecerNumeroAsginaturas(entrada.nextInt());
                    System.out.println("Ingrese costo de Asignaturas: ");
                    estudiante.establecerCostoAsignatura(entrada.nextDouble());
                    estudiante.calcularMatriculaDistancia();
                    System.out.printf("%s\n", estudiante);
                    break;
                case 2:
                    EstudiantePresencial estudiante = new EstudiantePresencial();
                    estudiante.establecerNombresEstudiante(nombres);
                    estudiante.establecerApellidoEstudiante(apellidos);
                    estudiante.establecerIdentificacionEstudiante(cedula);
                    estudiante.establecerEdadEstudiante(edad);
                    
                    System.out.println("Ingrese numero de Creditos: ");
                    estudiante.establecerNumeroCreditos(entrada.nextInt());
                    System.out.println("Ingrese costo de Creditos: ");
                    estudiante.establecerCostoCredito(entrada.nextDouble());
                    estudiante.calcularMatriculaPresencial();
                    System.out.printf("%s\n", estudiante);
                    break;
                default:
                    break;
            }
        }

    }

}
