package Guia03EstructurasDeControl;

import java.util.Scanner;

/**
 * Realizar un programa que simule el funcionamiento de un dispositivo RS232,
 * este tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas
 * deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres
 * de largo, el primer carácter tiene que ser X y el último tiene que ser una O.
 * Las secuencias leídas que respeten el formato se consideran correctas, la
 * secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y
 * toda secuencia distinta de FDE, que no respete el formato se considera
 * incorrecta. Al finalizar el proceso, se imprime un informe indicando la
 * cantidad de lecturas correctas e incorrectas recibidas. Para resolver el
 * ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java
 * Substring(), Length(), equals().
 *
 * @author j0k3r.rg
 */
public class ejercicio07 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String clave;
        int correctas = 0,incorrectas = 0;
        System.out.println("Bienvenido al DISPOSITIVO RS232.");

        do {
            do {
                System.out.println("Ingrese clave");
                clave = leer.next();
                if (clave.length() > 5 ) System.out.println("supero el limite establecido, no se contara este ingreso.");
            } while (clave.length() > 5);
            if (!clave.equals("&&&&&")) System.out.println("clave tomada con exito veremos si es correcta o no.");
            if(clave.substring(0, 1).equals("X") && clave.substring(clave.length()-1).equals("O")){
                System.out.println("CLAVE CORRECTA +");
                correctas++;
            }else if (!clave.equals("&&&&&")){
                System.out.println("CLAVE INCORRECTA +");
                incorrectas++;
            }
        } while (!"&&&&&".equals(clave));
        System.out.println("Claves Correctas Ingresadas: " + correctas);
        System.out.println("Claves Incorrectas Ingresadas: " + incorrectas);
        
        leer.close();

    }

}
