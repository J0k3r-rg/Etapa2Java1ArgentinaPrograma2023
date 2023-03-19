package Guia00PruebasMias_RECOMIENDO_MIRAR;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * EN LA SIGUIENTE PRUEBA VAMOS A VER LAS VALIDACIONES, VAMOS A HACERLO
 * MANUALMENTE Y TAMBIEN VAMOS A HACER PRUEBAS CON EL TRY CATCH
 *
 * RECUERDEN QUE PUEDEN HACER LAS PRUEBAS NECESARIAS PARA LOGRAR SU OBJETIVO
 * NO APLIQUEN POR QUE LEEN . TRATEN DE ENTENDER EL CODIGO Y DE SABER QUE 
 * ES LO QUE ESTAN HACIENDO ... ESPERO LES GUSTE LOS EJEMPLOS Y PUEDAN 
 * INTERPRETARLOS SIN NINGUN PROBLEMA
 * 
 * 
 * @author j0k3r.rg
 */
public class pruebas03ManejoDeErroresTryCatch {

    public static void main(String[] args) {

        
        Scanner leer = new Scanner(System.in);
        
        // EN ESTA VALIDACION DE DATOS CORROBORAMOS QUE EL NUMERO SEA ENTERO
        // CASO QUE QUIERA INGRESAR OTRA COSA VOLVERA A SOLICITAR EL NUMERO
        // HASTA QUE INGRESE UN NUMERO CORRECTO
        String real;
        System.out.println("*******************************************************************************");
        System.out.println("*****            VALIDAMOS DATOS CON NUSTRA FUNCION DE REALES ...          ****");
        System.out.println("*******************************************************************************");
        //recordar que esta funcion tambien sirve para numeros enteros, ya que se encuentra dentro de los reales
        //existe la posibilidad que ingresen un entero como real o algo similar
        do {            
            System.out.println("INGRESE UN NUMERO REAL (recordar el conjunto de los reales):");
            real = leer.next();
            if (validarNumeroReal(real)) {
                break;
            }else{
                System.out.println("DATO INGRESADO INCORRECTO");
            }
        } while (true);
        System.out.println("Dato ingresado CORRECTO...");
        leer.nextLine();
        String cadena;
        System.out.println("*******************************************************************************");
        System.out.println("***           VALIDAMOS DATOS CON NUSTRA FUNCION DE CARACTERES...           ***");
        System.out.println("*** solo tomaremos las minusculas y las mayusculas el espacio esta ignorado ***");
        System.out.println("*******************************************************************************");
        do {            
            System.out.println("INGRESE UNa PALABRA (recordad que si introduce un espacio volveremos a solicitar el dato):");
            cadena = leer.nextLine();
            if (validarCaracteres(cadena)) {
                break;
            }else{
                System.out.println("DATO INGRESADO INCORRECTO");
            }
        } while (true);
        System.out.println("Dato ingresado CORRECTO...");
        
        
        String numero;
        System.out.println("*******************************************************************************");
        System.out.println("*****            VALIDAMOS DATOS CON NUSTRA FUNCION DE ENTEROS...          ****");
        System.out.println("*******************************************************************************");
        do {            
            System.out.println("INGRESE UN NUMERO ENTERO:");
            numero = leer.next();
            if (validarNumeroEntero(numero)) {
                break;
            }else{
                System.out.println("DATO INGRESADO INCORRECTO");
            }
        } while (true);
        System.out.println("Dato ingresado CORRECTO...");
        
        //esta parte del codigo esta mejorada! ver las versiones anteriores
        //para ver las modificaciones que se le hicieron
        
        System.out.println("*******************************************************************************");
        System.out.println("****                   VALIDAMOS DATOS CON TRY/CATCH ...                   ****");
        System.out.println("*******************************************************************************");
        int num;
        do {
            try {
                System.out.print("ingrese un numero ENTERO: ");
                // Nota importante... puede ser para int, double, float y cualquier tipo de variable
                // tendriamos que probar con char aver que sucede, es cuestion de modificar algunas
                // cosas
                num = leer.nextInt();
                break;
            } catch (InputMismatchException ex) {
                System.out.println("HA INGRESADO UN DATO INCORRECTO");
                leer.nextLine();
            }
        } while (true);
        System.out.println("dato ingresado CORRECTO...");
        System.out.println(num);
        leer.nextLine();
        
        
        double num2;
        do {
            try {
                System.out.print("ingrese un numero REAL: ");
                num2 = leer.nextDouble();
                break;
            } catch (InputMismatchException ex) {
                System.out.println("HA INGRESADO UN DATO INCORRECTO");
                leer.nextLine();
            }
        } while (true);
        System.out.println("dato ingresado CORRECTO...");
        System.out.println(num2);
        leer.nextLine();
    }

    //AQUI DECLARAMOS NUESTRAS FUNCIONES PARA VALIDAR DATOS 

    
    //          ESTA FUNCION SIRVE PARA VALIDAR SOLO NUMEROS ENTEROS
    private static boolean validarNumeroEntero(String num) {
        String numeros = "0123456789";
        boolean bandera = true;
        if (num.charAt(0) == '-') num = num.substring(1,num.length()-1);
        for (int i = 0; i < num.length(); i++) {
            for (int j = 0; j < numeros.length(); j++) {
                if (num.charAt(i) == numeros.charAt(j)) {
                    bandera = true;
                    break;
                } else {
                    bandera = false;
                }
            }
            if (!bandera){
                return false;
            }
        }
        return true;
    }
    
    
    //           ESTA FUNCION SIRVE PARA VALIDAR SOLO LETRAS EN MINUSCULAS Y MAYUSCULAS
    private static boolean validarCaracteres(String cadena) {
        String letras = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        boolean bandera = true;
        for (int i = 0; i < cadena.length(); i++) {
            for (int j = 0; j < letras.length(); j++) {
                if (cadena.charAt(i) == letras.charAt(j)) {
                    bandera = true;
                    break;
                } else {
                    bandera = false;
                }
            }
            if (!bandera){
                return false;
            }
        }
        return true;
    }
    
    
    //     ESTA FUNCION SOLO SIRVE PARA VALIDAR NUMEROS REALES... ENTRAN LOS ENTEROS 
    private static boolean validarNumeroReal(String num) {
        String numeros = "0123456789.";
        if (num.charAt(0) == '-') num = num.substring(1,num.length()-1);
        boolean bandera = true;
        int punto = 0;
        for (int i = 0; i < num.length(); i++) {
            for (int j = 0; j < numeros.length(); j++) {
                if (num.charAt(i) == numeros.charAt(j)) {
                    if (num.charAt(i) == '.') punto++;
                    if (punto == 2 ) return false;
                    bandera = true;
                    break;
                } else {
                    bandera = false;
                }
            }
            if (!bandera){
                return false;
            }
        }
        return true;
    }
}
