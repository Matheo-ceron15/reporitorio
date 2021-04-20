/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demostraciongit;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Home PC
 */
public class patitoFeo {
     public static void main(String[] args) {
       try{
            BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese el nombre");
            String nombre = leer.readLine();
            //pasar todo a mayuscula
            leerCaracterFor(nombre.toUpperCase());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    private static void leerCaracterFor(String palabra) {
        //for (valor inicial; valor final; incremento)
        for (int i = 0; i < palabra.length(); i++) 
        {
            System.out.println("Caracter: "  + i + " ->: " + palabra.charAt(i) );
        }
    }
}
