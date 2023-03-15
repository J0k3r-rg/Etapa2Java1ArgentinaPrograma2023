package Guia03EstructurasDeControl;

import java.util.Scanner;

/**
 * Escriba un programa en el cual se ingrese un valor límite positivo, 
 * y a continuación solicite números al usuario hasta que la suma de 
 * los números introducidos supere el límite inicial.
 * @author j0k3r.rg
 */
public class ejercicio05 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int tope,suma = 0,numero;
        do{
            System.out.println("Ingrese limite positivo");
            tope = leer.nextInt();
            if (tope<0) System.out.println("error..... ");
        }while (tope<0);
        do{
            System.out.println("Ingrese numero \n(los numeros se sumaran hasta superar el limite establecido)");
            numero = leer.nextInt();
            suma += numero;
        } while (suma<=tope);
        System.out.println("Ha superado el limite establecido \nLimite: "+tope+"   sumaTotal: "+ suma);
        leer.close();
    }
    
}
