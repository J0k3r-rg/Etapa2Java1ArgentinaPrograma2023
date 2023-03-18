package Guia03EstructurasDeControl;

import java.util.Scanner;

/**
 *Realizar un programa que pida dos números enteros positivos por teclado y muestre por pantalla 
 * el siguiente menú:El usuario deberá elegir una opción y el programa deberá mostrar el resultado 
 * por pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5. 
 * Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa 
 * directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que desea 
 * salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, 
 * caso contrario se vuelve a mostrar el menú.
 * @author j0k3r.rg
 */
public class ejercicio06 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean salir = true;
        String opcion;
        System.out.println("Ingrese numero 1: ");
        int num1 = leer.nextInt();leer.nextLine();
        System.out.println("Ingrese numero 2: ");
        int num2 = leer.nextInt();leer.nextLine();
        do{
            System.out.println("Ingrese opcion a realizar"
                    + "\n     1- sumar"
                    + "\n     2-restar"
                    + "\n     3-multiplicar"
                    + "\n     4-dividir"
                    + "\n     5-salir\n");
            opcion = leer.nextLine();
            switch (opcion) {
                case "1":
                    System.out.println("El resultado de la suma es: "+ (num1+num2));
                    break;
                case "2":
                    System.out.println("El resultado de la resta es: "+ (num1-num2));
                    break;
                case "3":
                    System.out.println("El resultado de la multiplicacion es: "+ (num1*num2));
                    break;
                case "4":
                    if (num2==0){
                        System.out.println("NO SE PUEDE DIVIDIR POR CERO");
                    }else{
                        System.out.println("El resultado de la division es: "+ (num1/num2));
                    }
                    break;
                case "5":
                    System.out.println("esta seguro que quiere salir? (si/cuaklquier letra = no)");
                    opcion = leer.nextLine();
                    if (opcion.equals("si")){
                        salir = false;
                    }
                    break;
                default:
                    System.out.println("Ingreso una opcion incorrecta............");
            }
        }while(salir);
        System.out.println("MUCHAS GRACIAS POR USAR NUESTROS SERVICIOS");
        leer.close();
    }
    
}
