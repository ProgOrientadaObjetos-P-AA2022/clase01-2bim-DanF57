package herencia2;

import herencia1.EstudianteDistancia;

/**
 *
 * @author Daniel
 */
public class Ejecutor {

    public static void main(String[] args) {
        // 1. Crear un objeto de tipo Estudiante.
        EstudianteDistancia estudiante = new EstudianteDistancia();
        estudiante.establecerNombresEstudiante("Daniel");
        estudiante.establecerApellidoEstudiante("Flores");
        estudiante.establecerIdentificacionEstudiante("1106067679");
        estudiante.establecerEdadEstudiante(20);
        estudiante.establecerCostoAsignatura(30);
        estudiante.establecerNumeroAsginaturas(5);
        estudiante.calcularMatriculaDistancia();

        /*
        System.out.printf("%s - (%.1f)\n", 
                estudiante.obtenerApellidoEstudiante(),
                estudiante.obtenerMatriculaDistancia());
         */
        
        System.out.printf("%s\n", estudiante);
    }

}
