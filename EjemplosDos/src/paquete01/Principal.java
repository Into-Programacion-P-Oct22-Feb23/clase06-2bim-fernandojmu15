/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import paquete02.*;
import paquete03.DatosUbicacion;
import paquete04.DatoAcademico;
import paquete05.DatoFinal;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        String nombre;
        String institucion;
        String direccion;
        String ciudad;
        String apellidoRetornado;
        
        
        double[] misNotas;
        double promedio;
        
        nombre = DatoPersonal.obtenerNombre();
        apellidoRetornado = DatoPersonal.obtenerApellido();
        institucion = DatoTrabajo.obtenerInstitucion();
        direccion = DatoTrabajo.obtenerDireccion();
        ciudad = DatosUbicacion.obtenerCiudad();
        misNotas = DatoAcademico.obtenerNotas(4);
        promedio = DatoFinal.obtenerPromedio(misNotas);
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.printf("Los datos ingresados son:\n"
                + "Nombre: %s\n"
                + "Apellido: %s\n"
                + "Institucion: %s\n"
                + "Direccion: %s\n"
                + "Ciudad: %s\n"
                + "Promedio: %.2f\n",
                nombre,
                apellidoRetornado,
                institucion,
                direccion,
                ciudad,
                promedio);
    }
    
}
