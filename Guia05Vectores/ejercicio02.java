package Guia05Vectores;

import java.util.Scanner;

/**
 * Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios 
 * y le pida al usuario un número a buscar en el vector. El programa mostrará 
 * dónde se encuentra el numero y si se encuentra 
 * 
 * @author j0k3r.rg
 */
public class ejercicio02 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int tamanio = leer.nextInt();
        int numeros[] = new int[tamanio];
        
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random()*(80-5)+5);
        }
        System.out.print("Ingrese numero a buscar dentro del vector: ");
        int buscar = leer.nextInt(); leer.nextLine();
        String posiciones = "";
        boolean encontrado = false;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]==buscar){
                posiciones+= String.valueOf(i) + ",";
                encontrado = true;
            }
        }
        if(encontrado){
            System.out.println("SE ENCONTRO EL NUMERO "+buscar+" EN LAS POSICIONES: "+ posiciones);
        }else{
            System.out.println("NO SE ENCONTRO DENTRO DEL VECTOR");
        }
        leer.close();
    }
    
}
