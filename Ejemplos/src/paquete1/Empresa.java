package paquete1;

/**
 *
 * @author reroes
 */
public class Empresa {

    private String nombre;
    private Edificio[] edificios;
    private double costoBienesInmuebles;

    public void establecerNombre(String m) {
        nombre = m;
    }

    public void establecerEdificios(Edificio[] m) {
        edificios = m;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public Edificio[] obtenerEdificios() {
        return edificios;
    }

    public void establecerCostoBienesInmuebles() {
        for (Edificio edificio : edificios) {
            costoBienesInmuebles += edificio.obtenerCosto();
        }
        /*
        double suma = 0;
        for (int i = 0 < obtenerEdificios().length; i++){
            suma = suma + obtenerEdificios()[i].obtenerCosto();
        }
        costoBienesInmuebles = suma;
        */
    }
    
    public double obtenerCostoBienesInmuebles(){
        return costoBienesInmuebles;
    }

    @Override
    public String toString() {
        String cadena = String.format("Nombre: %s\nLista de Edificio: ",
                nombre);//obtenerNombre()
        
        for (int i = 0; i < edificios.length; i++) {
            Edificio e = edificios[i];
            cadena = String.format("%s\n%d. %s",
                    cadena, i+1, e);
        }
        cadena = String.format("%s\nTotal de Inmuebles: %.2f\n",
                 cadena, costoBienesInmuebles);

        return cadena;
    }
}
