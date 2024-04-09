/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab5;

/**
 *
 * @author HP
 */
public class Recorrer {
    private int entrada;
    private int exponente;
    private int inicio1;
    private int indice;

    private String cadena;

    public Recorrer(int entrada ,int inicio1, int exponente, String cadena, int indice){
        this.entrada = entrada;
        this.inicio1 = inicio1;
        this.exponente = exponente;
        this.cadena = cadena;
        this.indice = indice;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }
    
    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }
    
    public int getInicio1() {
        return inicio1;
    }

    public void setInicio1(int inicio1) {
        this.inicio1 = inicio1;
    }

    public int getExponente() {
        return exponente;
    }

    public void setExponente(int exponente) {
        this.exponente = exponente;
    }
   
    public int getEntrada() {
        return entrada;
    }

    public void setEntrada(int entrada) {
        this.entrada = entrada;
    }
    public void reiniciar(){
        this.setCadena("");
        this.setExponente(1);
        this.setInicio1(1);
        this.setIndice(0);
    }
    
    public int reversa (){
            this.setInicio1(this.getInicio1() * 10);
            int n = ((this.getEntrada() % this.getInicio1()) / this.getExponente());
            this.setExponente(this.getExponente() * 10);
            if (n == 0){
                return 0;
            }
            else {
                this.setCadena(this.getCadena() + n);
                return reversa();
        }
    }
    
    public int suma(){
            this.setInicio1(this.getInicio1() * 10);
            int n = ((this.getEntrada() % this.getInicio1()) / this.getExponente());
            this.setExponente(this.getExponente() * 10);
            this.setIndice(this.getIndice() + n);
            if (n == 0){
                return 0;
            }
            else {
                return suma();
        }
    }
    
    public int cuenta(){
            this.setInicio1(this.getInicio1() * 10);
            int n = ((this.getEntrada() % this.getInicio1()) / this.getExponente());
            this.setExponente(this.getExponente() * 10);
            if (n == 0){
                return 0;
            }
            else {
                this.setIndice(this.getIndice() + 1);
                return cuenta();
        }      
    }
 /**
 *cosas por arreglar si se le entrega un numero que contenga 0 como 508 o 900 no funciona
 * por que n seria == 0 dando como resultado que no se llame a si mismo el metodo
 * como posibles soluciones se podria tranformar la entrada a cadena y si el numero indice es menor que el tamaño de la
 * cadena no retorne 0 en caso contrario no se llame a si misma
 * 
 */

}
