package Guia03;

import java.util.Scanner;

/**
 *Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa 
 * pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. 
 * Nota: investigar la función equals() en Java.
 * @author j0k3r.rg
 */
public class ejercicio02 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese frase: ");
        String frase = leer.nextLine();
        
        if("eureka".equals(frase /* O TAMBIEN frase.equals("eureka") */ )){
            System.out.println("CORRECTO");
        }else{
            System.out.println("INCORRECTO");
        }
        
        leer.close();
    }
    
}
