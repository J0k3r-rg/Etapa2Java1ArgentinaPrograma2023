package Guia05Vectores;

import java.util.Scanner;

/**
 * Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, 
 * cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 * @author j0k3r.rg
 */
public class ejercicio03 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese tamanio del vector:");
        int tamanio = leer.nextInt(); leer.nextLine();
        
        int numeros[] = new int[tamanio];
        numeros = cargarVector(numeros);
        int dig1 = 0,dig2  =0,dig3 = 0, dig4 = 0, dig5 = 0;
        
        for (int i = 0; i < numeros.length; i++) {
            switch (contarDigitos(numeros[i])) {
                case 1:
                    dig1++;
                    break;
                case 2:
                    dig2++;
                    break;
                case 3:
                    dig3++;
                    break;
                case 4:
                    dig4++;
                    break;
                case 5:
                    dig5++;
                    break;
            }
        }
        System.out.println("Numeros de 1 digito: " + dig1);
        System.out.println("Numeros de 2 digito: " + dig2);
        System.out.println("Numeros de 3 digito: " + dig3);
        System.out.println("Numeros de 4 digito: " + dig4);
        System.out.println("Numeros de 5 digito: " + dig5);
        
        leer.close();
    }
    public static int[] cargarVector(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            vector[i]= (int) (Math.random()*100000);
        }
        return vector;
    }
    
    public static int contarDigitos(int num){
        int digitos=0;
        
        while (num>0){
            num = num /10;
            digitos++;
        }
        return digitos;
    }
    
}
