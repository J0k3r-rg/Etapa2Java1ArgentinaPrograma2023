package Guia05Vectores;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y,
 * a medida que el usuario las va ingresando, construya una “sopa de letras para
 * niños” de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en
 * orden horizontal en una fila que será seleccionada de manera aleatoria. Una
 * vez concluida la ubicación de las palabras, rellene los espacios no
 * utilizados con un número aleatorio del 0 al 9. Finalmente imprima por
 * pantalla la sopa de letras creada.
 *
 * Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las
 * siguientes funciones de Java substring(), Length() y Math.random().
 *
 * NOTA IMPORTANTE ESE ES EL EJERCICIO ORIGINAL PERO VAMOS A TRATAR DE HACERLO
 * MAS DIFICIL QUE ARME LA SOPA DE LETRAS COMO LAS QUE CONOCEMOS DE FORMA
 * HORIZONTAL O VERTICAL. MANOS A LA OBRA!!
 *
 * @author j0k3r.rg
 */
public class extras06 {

    //constantes para las longitudes de las palabras
    private static final int desde = 6, hasta = 10;
    //constantes para la cantidadde palabras
    private static final int cantmin = 5, cantmax = 9;

    static int indiceA, indiceB;

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num = 0;
        String[] palabras;

        boolean continuar;
        do {
            try {
                continuar = false;
                System.out.println("Ingrese cantidad de palabras para armar la sopa de letras (minimo " + cantmin + ", maximo " + cantmax + "):");
                num = leer.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("HA INGRESADO UN DATO INCORRECTO");
                leer.nextLine();
                continuar = true;
            }
        } while (continuar || num < cantmin || num > cantmax);
        palabras = new String[num];
        leer.nextLine();
        boolean noRepetido = true;
        String cadena = "";
        for (int i = 0; i < palabras.length; i++) {
            do {
                noRepetido = true;
                System.out.println("INGRESE PALABRA NUMERO " + (i + 1) + " A INGRESAR EN LA SOPA DE LETRAS (" + desde + " a " + hasta + " letras):");
                System.out.println("       solo letras y en mayusculas...");
                cadena = leer.nextLine();
                if (validarCaracteres(cadena)) {
                    for (int j = 0; j < i; j++) {
                        if (cadena.equals(palabras[j])) {
                            noRepetido = false;
                            break;
                        }
                    }
                    if (noRepetido) {
                        break;
                    } else {
                        System.out.println("LA PALABRA YA FUE INGRESADA");
                    }
                } else {
                    System.out.println("ALGO ANDA MAL, INGRESE CORRECTAMENTE POR FAVOR.... LEA LO SOLICITADO!!!!");
                }
            } while (true);
            palabras[i] = cadena;
        }
        //TENEMOS TODAS NUESTRAS PALABRAS NO REPETIDAS, OSEA UNICAS
        // HASTA AQUI TENEMOS LAS PALABRAS PARA INTODUCIR EN LA SOPA DE LETRAS XD  AHORA ???? 
        //QUE HACEMOS.... BUENO A VER !!

        String[][] matriz = new String[20][20];
        matriz = iniciarMatriz(matriz);

        for (int i = 0; i < palabras.length; i++) {
            if (i == 0) {
                for (int j = 0; j < palabras[i].length(); j++) {
                    matriz[10][j + 6] = String.valueOf(palabras[i].charAt(j));
                }
            } else if (i == 1) {
                //ahora tengo que encontrar una palabra que tenga una letra de la primera ...
                if (buscarLetra(palabras[i - 1], palabras[i])) {
                    for (int j = 0; j < palabras[i].length(); j++) {
                        matriz[j + (10 - indiceB)][indiceA + 6] = String.valueOf(palabras[i].charAt(j));
                    }
                }
                // solo logre que cargue 2 palabras unahorizontal y la otra vertical... tengo que 
                // buscar la mannera de que cargue las demas... pero no se como XD
                // quisas con preguntas al usuario si quiere la palabra horizontal o vertical
                // hay que pensar bien
                // existe la minima posibilidad que todas las palabras que ingrese no combine ninguna
            }
        }

        imprimirMatriz(matriz);
        leer.close();
    }

    /*
     * AQUI DECLARAREMOS NUESTRAS FUNCIONES NECESARIAS PARA LOGAR 
     * NUESTRO OBJETIVO
     */
    public static void imprimirMatriz(String[][] matriz) {
        for (String[] strings : matriz) {
            for (String dato : strings) {
                System.out.print(dato + " ");
            }
            System.out.println("");
        }
    }

    public static String[][] iniciarMatriz(String[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = "-";
            }
        }
        return matriz;
    }

    private static boolean validarCaracteres(String cadena) {
        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        boolean bandera = true;
        int longitud = cadena.length();
        if (longitud < desde || longitud > hasta) {
            return false;
        }
        for (int i = 0; i < cadena.length(); i++) {
            for (int j = 0; j < letras.length(); j++) {
                if (cadena.charAt(i) == letras.charAt(j)) {
                    bandera = true;
                    break;
                } else {
                    bandera = false;
                }
            }
            if (!bandera) {
                return false;
            }
        }
        return true;
    }

    //con esta funcion verifico si alguna letra de la palabra 2 esta en palabra 1
    public static boolean buscarLetra(String palabra1, String palabra2) {

        for (int i = 0; i < palabra2.length(); i++) {
            if (palabra1.contains(String.valueOf(palabra2.charAt(i)))) {
                indiceA = palabra1.indexOf(palabra2.charAt(i));
                indiceB = palabra2.indexOf(palabra2.charAt(i));
                return true;
            }
        }
        return false;
    }

    public static boolean buscarLetraMatriz(String[][] matriz, String palabra) {
        for (int k = 0; k < palabra.length(); k++) {
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz.length; j++) {
                    if (matriz[i][j].equals(String.valueOf(palabra.charAt(k)))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
