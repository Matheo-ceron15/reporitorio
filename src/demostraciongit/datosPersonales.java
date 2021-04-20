
package demostraciongit;

import java.util.Scanner;

public class datosPersonales{

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Escriba su nombre");
        String nombre = leer.nextLine();
        
        System.out.println("Escriba su edad");
        int edad = leer.nextInt();
        
        System.out.println("Los datos son");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}
