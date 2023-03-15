package Guia03;

import java.util.Scanner; 

/**
 * Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase es una ‘A’.
 * Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”,
 * en caso contrario, se deberá imprimir “INCORRECTO”. 
 * Nota: investigar la función Substring y equals() de Java.
 * @author j0k3r.rg
 */
public class ejercicio04 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese palabra o frase:");
        String frase = leer.nextLine();
        if(frase.charAt(0)== 'A'){
            System.out.println("CORRECTO");
        }else{
            System.out.println("INCORRECTO");
        }
        
        leer.close();
    }
    
}
