package Guia03EstructurasDeControl;

import java.util.Scanner;

/**
 *Crear un programa que dado un número determine si es par o impar.
 * @author j0k3r.rg
 */
public class ejercicio01 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero: ");
        int numero = leer.nextInt();
        if (numero % 2 == 0 ){
            System.out.println("El numero es PAR.");
        }else{
            System.out.println("El numero es IMPAR");
        }
        
        leer.close();
    }
    
}
