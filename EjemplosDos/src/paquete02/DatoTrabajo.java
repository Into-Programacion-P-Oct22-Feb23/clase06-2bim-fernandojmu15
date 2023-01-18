/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class DatoTrabajo {

    // método que permita preguntar al usuario el nombre de la empresa    
    // método que permita preguntar al usuario la dirección de la empresa
    public static String obtenerInstitucion() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese nombre de la institucion:");
        String institucion = entrada.nextLine();
        return institucion;
    }
    public static String obtenerDireccion() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la direccion de la institucion:");
        String direccion = entrada.nextLine();
        return direccion;       
    }

}
