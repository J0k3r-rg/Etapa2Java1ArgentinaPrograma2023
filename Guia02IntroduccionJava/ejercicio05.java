package Guia02IntroduccionJava;

import java.util.Scanner;

/**
 Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, 
 el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().
 * @author j0k3r.rg
 */
public class ejercicio05 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese numero: ");
        double numero = leer.nextDouble();
        System.out.println("El doblre es: " + numero * 2);
        System.out.println("El triple es:" + numero * 3);
        System.out.println("La raiz cuadrada es: " + Math.sqrt(numero));
        
        leer.close();
    }
    
}
