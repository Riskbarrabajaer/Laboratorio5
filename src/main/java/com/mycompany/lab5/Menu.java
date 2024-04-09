/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab5;

/**
 *
 * @author HP
 */
public class Menu {
    
    public void menu_op(){
        Recorrer reco = new Recorrer(0,1,1,"",0);
        FuncionesDivertidas fd = new FuncionesDivertidas();
        int condicion = 0;
        while(condicion == 0){
        System.out.println("==============================================================");
        System.out.println("Bienvenido al menu");
        System.out.println("1 = contar digitos de un numero");
        System.out.println("2 = para sumar los digitos de un numero");
        System.out.println("3 = para odtener el maximo comun divisor de dos numeros");
        System.out.println("4 = invertir una cadena");
        System.out.println("5 = salir");
        int n = fd.leerentero();
        System.out.println("==============================================================");
        switch(n) {
            case 1:
                int respuesta = fd.leerentero();
                reco.setEntrada(respuesta);
                reco.cuenta();
                System.out.println("R:" + reco.getIndice());
                reco.reiniciar();
                break;
            case 2:
                int respuesta2 = fd.leerentero();
                reco.setEntrada(respuesta2);
                reco.suma();
                System.out.println("R:" + reco.getIndice());
                reco.reiniciar();
                break;
            case 3:
                int numero1 = fd.leerentero();
                int numero2 = fd.leerentero();
                System.out.println("R:" + fd.mcd(numero1, numero2));
                break;
            case 4:
                Inversa inve = new Inversa();
                String resp = fd.leer();
                System.out.println("R:" + inve.inversaCadena(resp));
                break;
            case 5:
                condicion = 1;
                break;
            default:
                System.out.println("respuesta invalida");
        }
        }
    }
 
}
