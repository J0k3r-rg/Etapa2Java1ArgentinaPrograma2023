
package Guia02;

import java.util.Scanner;

/**
 Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
 * @author j0k3r.rg
 */
public class ejercicio02 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre = leer.nextLine();
        System.out.println("hola "+nombre+" le damos la bienvenida");
        
        leer.close();
    }
    
}
