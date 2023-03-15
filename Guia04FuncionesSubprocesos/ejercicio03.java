package Guia04FuncionesSubprocesos;

import java.util.Scanner;

/**
 * Crea una aplicación que a través de una función nos convierta una cantidad de euros 
 * introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. 
 * La función tendrá como parámetros, la cantidad de euros y la moneda a convertir que 
 * será una cadena, este no devolverá ningún valor y mostrará un mensaje indicando 
 * el cambio (void).
 *            El cambio de divisas es:
 *            - 0.86 libras es un 1 €
 *            - 1.28611 $ es un 1 €
 *            - 129.852 yenes es un 1 €

 * @author j0k3r.rg
 */
public class ejercicio03 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese cantidad de euros a convertir: ");
        double euros = leer.nextDouble();leer.nextLine();
        System.out.println("Ingrese moneda (libra,dolar,yen)");
        String moneda = leer.nextLine();
        convertir(euros, moneda);
        leer.close();
    }
    public static void convertir(double euros, String moneda){
        switch (moneda.toLowerCase()) {
            case "libra":
                System.out.println("la cantidad de libras es: "+(0.86 * euros));
                break;
            case "dolar":
                System.out.println("la cantidad de dolares es: "+(1.28611 * euros));
                break;
            case "yen":
                System.out.println("la cantidad de yenes es: "+(129.852 * euros));
                break;
            default:
                System.out.println("TIPO DE MONEDA INCORRECTA");
        }
    }
}
