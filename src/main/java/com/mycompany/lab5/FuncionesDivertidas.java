/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab5;
import java.util.Scanner;    
/**
 *
 * @author HP
 */
public class FuncionesDivertidas{
    private int resto;
    
    public static boolean verificar(String km){
        /**
        *prueba si hay un error en el programa
        * si lo hay retorna false
        */
        try {
            int probando = Integer.parseInt(km);
                if (probando <= 0){
                   System.out.println("numeros positivos solo");
                    return false;
                }
            return true;
         } catch (NumberFormatException ex) {
          return false;
         }
    }
    public String leer(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el texto");
        return sc.next();
    
    }
    
    public  int leerentero(){
            Scanner sc = new Scanner(System.in);
            int condicion = 0;
            String salida = "";
            while (condicion == 0){
            System.out.print("ingrese un numero: ");
            String h = sc.next();
            // if pero en un una fila
            condicion = (verificar(h) == true) ? 1:0 ;
            salida = h;
            }
            return Integer.parseInt(salida);
    }
    
    public int mcd(int numero1, int numero2){
        /**
        *max = compara dos atributos y retorna el mayor
        *min = compara dos atributos y retorna el menor
        *aplica la division y odtiene su resto si al aplicarla
        * el resto es igual a cero signica que el numero anterior es el
        * maximo numero por el cual se puede dividir 
        * 
        */
        int mayor = Math.max(numero1, numero2);
        int menor = Math.min(numero1, numero2);
        if (menor == 0){
            System.out.println(resto);
            return menor;
        }
        else{
            resto = menor;
            return mcd(resto,mayor%menor);
        }       
    }
    
}
