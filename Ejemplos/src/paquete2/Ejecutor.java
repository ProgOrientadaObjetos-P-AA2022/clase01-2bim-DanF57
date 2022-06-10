/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;
// import paquete1.*;

import paquete1.Edificio;
import paquete1.Empresa;
import paquete1.Vehiculo;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {

        // Crear una arreglo de 4 elementos de tipo Edificio
        Edificio edf1 = new Edificio("edificio central");
        edf1.establecerCostos(20000);
        //System.out.println(edf1);
        Edificio edf2 = new Edificio("edificio sur");
        edf2.establecerCostos(30000);

        Edificio edf3 = new Edificio("edificio norte");
        edf3.establecerCostos(10000);

        Edificio edf4 = new Edificio("edificio secundario");
        edf4.establecerCostos(5000);

        Edificio[] lista = {edf1, edf2, edf3, edf4};
        // Crear un objeto de tipo Empresa:
        //  Nombre: Empresa de Hojas
        //  Lista de edificio: edf1, edf2, edf3, edf4
        
        Vehiculo ve1 = new Vehiculo("Auto", "LBB0011", 10000);
        Vehiculo ve2 = new Vehiculo("Camioneta", "LCB0011", 20000);
        Vehiculo ve3 = new Vehiculo("Auto", "LBD0012", 6000);
        Vehiculo ve4 = new Vehiculo("Camioneta", "LCC0011", 10000);
        Vehiculo ve5 = new Vehiculo("Camioneta", "LDC0011", 25000);
        
        Vehiculo[] vehiculos = {ve1, ve2, ve3, ve4, ve5};
        /*
         1. Auto, LBB0011 (10000)
        2. Camioneta, LCB0011 (20000)
        3. Auto, LBD0012 (6000)
        4. Camioneta, LCC0011 (10000)
        5. Camioneta, LDC0011 (25000)
        Total de inmuebles: 71000
        */

        Empresa empresa = new Empresa();

        empresa.establecerNombre("Empresa de Hojas");
        empresa.establecerEdificios(lista);
        empresa.establecerVehiculos(vehiculos);
        empresa.establecerCostoBienesInmuebles();
        empresa.establecerCostoVehiculos();
        empresa.establecerCostoBienes();

        // Imprimir el costo de los bienes inmuebles de la empresa
        System.out.printf("%s",empresa);

    }
}
