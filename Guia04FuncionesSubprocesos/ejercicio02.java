package Guia04FuncionesSubprocesos;

import java.util.Scanner;

/**
 * Diseñe una función que pida el nombre y la edad de N personas e imprima los datos
 * de las personas ingresadas por teclado e indique si son mayores o menores de edad. 
 * Después de cada persona, el programa debe preguntarle al usuario si quiere seguir 
 * mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
 * @author j0k3r.rg
 */
public class ejercicio02 {
    private static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println("ingrese cantidad de personas:");
        int cantidad = leer.nextInt();leer.nextLine();
        
        pedirDatos(cantidad);
        
        System.out.println("GRACIAS POR UTILIZAR NUESTROS SERVICIOS");
        leer.close();
    }
    public static void pedirDatos(int cantidad){
        String nombre;
        int edad;
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese nombre de la persona numero "+(i+1));
            nombre = leer.nextLine();
            System.out.println("Ingrese edad de la persona numero "+(i+1));
            edad = leer.nextInt();leer.nextLine();
            if (edad<18){
                System.out.println("Persona MENOR de edad"+(i+1)+"\nNombre: "+nombre+"\nEdad: "+edad);
            }else{
                System.out.println("Persona MAYOR de edad"+(i+1)+"\nNombre: "+nombre+"\nEdad: "+edad);
            }
            System.out.println("\nQuiere seguir mostrando personas? (no/NO = salir) ");
            nombre = leer.nextLine();
            if ("no".equals(nombre.toLowerCase())) break;
        }
    }
}
