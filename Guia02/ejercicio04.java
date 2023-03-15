package Guia02;

import java.util.Scanner;

/**
 Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. 
 * La fórmula correspondiente es: F = 32 + (9 * C / 5).
 * @author j0k3r.rg
 */
public class ejercicio04 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese grados centigrados a convertir");
        double centigrados = leer.nextDouble();
        System.out.println("su equivalente a Farenheit es: " + (32+(9*centigrados /5)));
        /*OTRA OPCION ES
        double farenheit = 32+(9*centigrados /5);
        System.out.println("su equivalente a Farenheit es: " + farenheit);
        */
        leer.close();
    }
    
}
