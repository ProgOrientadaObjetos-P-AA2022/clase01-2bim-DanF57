/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia2;

import herencia1.EstudiantePresencial;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Ejecutor2 {

    public static void main(String[] args) {
        //1. Crear un objeto de tipo Estudiante Presencial
        // Con datos por teclado
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        EstudiantePresencial estudiante = new EstudiantePresencial();
        
        System.out.println("Ingrese nombre: ");
        estudiante.establecerNombresEstudiante(entrada.nextLine());
        
        System.out.println("Ingrese apellido: ");
        estudiante.establecerApellidoEstudiante(entrada.nextLine());
        
        System.out.println("Ingrese identificacion: ");
        estudiante.establecerIdentificacionEstudiante(entrada.nextLine());
        
        System.out.println("Ingrese edad: ");
        estudiante.establecerEdadEstudiante(entrada.nextInt());
        
        System.out.println("Ingrese numero de Creditos: ");
        estudiante.establecerNumeroCreditos(entrada.nextInt());
        
        System.out.println("Ingrese costo de Credito: ");
        estudiante.establecerCostoCredito(entrada.nextDouble());
        
        estudiante.calcularMatriculaPresencial();
        
        System.out.printf("%s", estudiante);
    }

}
