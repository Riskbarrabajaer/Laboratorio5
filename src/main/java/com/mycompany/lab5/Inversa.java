/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab5;

/**
 *
 * @author HP
 */
public class Inversa {
    /**CharAt = devuelve un caracter de una cadena segun su indice ejemplo 
     * "hola".charAt(0) retorna "H"
     * SubString = retorna una subcadene de una cadena valga la redundancia
     * segun su indice de inicio y de final ejemplo "hola",subString(0,2)
   *retorna la subcadena "hol"
   * @author HP
   */
    public static String inversaCadena(String cadena) {
        if (cadena.length() == 0) {
            return "";
        } else {
            return cadena.charAt(cadena.length() - 1) + inversaCadena(cadena.substring(0, cadena.length() - 1));
        }
    
}
}