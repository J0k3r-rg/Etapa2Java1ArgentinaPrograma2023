package Guia04FuncionesSubprocesos;

import java.util.Scanner;

/**
 * Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
 * restar, multiplicar y dividir. La aplicación debe tener una función para cada operación 
 * matemática y deben devolver sus resultados para imprimirlos en el main. 
 * @author j0k3r.rg
 */
public class ejercicio01 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese numero 1: ");
        double num1 = leer.nextInt(); leer.nextLine();
        System.out.print("\nIngrese numero 2: ");
        double num2 = leer.nextInt(); leer.nextLine();
        /*
        NETBEANS 8.2 UTILIZAR ESTA FORMA 
                
        System.out.println("\nINGRESE OPERACION QUE DESEA REALIZAR:\n"
                + "\n   1- SUMAR"
                + "\n   2- RESTAR"
                + "\n   3- MULTIPLICAR"
                + "\n   4- DIVIDIR");
        */
        
        //la version de netBEANS 17 nos permite hacer en bloque con triple comilla
        System.out.println("""
                           
                           INGRESE OPERACION QUE DESEA REALIZAR:
                           
                              1- SUMAR
                              2- RESTAR
                              3- MULTIPLICAR
                              4- DIVIDIR""");
        String opcion = leer.nextLine();
        switch (opcion) {
            case "1":
                System.out.println("El resultado de la suma es: "+ suma(num1, num2));
                break;
            case "2":
                System.out.println("El resultado de la resta es: "+ resta(num1, num2));
                break;
            case "3":
                System.out.println("El resultado de la multiplicacion es: "+ multiplicacion(num1, num2));
                break;
            case "4":
                if (num2==0){
                    System.out.println("NO SE PUEDE DIVIDIR POR CERO....");
                }else{
                    System.out.println("El resultado de la division es: "+ division(num1, num2));
                }
                break;
            default:
                System.out.println("OPCION INGRESADA INCORRECTA....");
        }
        leer.close();
    }
    
    
    public static double suma(double num1,double num2){
        return num1+num2;
    }
    public static double resta(double num1,double num2){
        return num1-num2;
    }
    public static double multiplicacion(double num1,double num2){
        return num1*num2;
    }
    public static double division(double num1,double num2){
        return num1/num2;
    }
}
