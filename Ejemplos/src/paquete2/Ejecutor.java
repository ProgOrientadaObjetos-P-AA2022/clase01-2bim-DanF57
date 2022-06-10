/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;
// import paquete1.*;

import paquete1.Edificio;
import paquete1.Empresa;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {

        // Crear una arreglo de 4 elementos de tipo Edificio
        Edificio edf1 = new Edificio("edificio central");
        edf1.establecerCostos(10000);
        //System.out.println(edf1);
        Edificio edf2 = new Edificio("edificio sur");
        edf2.establecerCostos(20000);

        Edificio edf3 = new Edificio("edificio norte");
        edf3.establecerCostos(30000);

        Edificio edf4 = new Edificio("edificio secundario");
        edf4.establecerCostos(20000);

        Edificio[] lista = {edf1, edf2, edf3, edf4};
        // Crear un objeto de tipo Empresa:
        //  Nombre: Empresa de Hojas
        //  Lista de edificio: edf1, edf2, edf3, edf4

        Empresa empresa = new Empresa();

        empresa.establecerNombre("Empresa de Hojas");
        empresa.establecerEdificios(lista);
        empresa.establecerCostoBienesInmuebles();

        // Imprimir el costo de los bienes inmuebles de la empresa
        System.out.printf("%s",empresa);

    }
}
