package Guia05Vectores;
/**
 * Realizar un algoritmo que llene un vector con los 100 primeros números enteros
 * y los muestre por pantalla en orden descendente.
 * @author j0k3r.rg
 */
public class ejercicio01 {
    
    public static void main (String argos [] ) {
        int[] numeros = new int[100];
        
        for (int i = 0; i < numeros.length; i++) {
            numeros[i]=i;
        }
        
        for (int i = numeros.length-1; i > 0; i--) {
            System.out.print("["+numeros[i]+"]");
        }
    }
}
