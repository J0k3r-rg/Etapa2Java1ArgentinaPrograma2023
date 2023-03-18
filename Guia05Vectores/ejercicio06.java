package Guia05Vectores;

import java.util.Scanner;

/**
 *
 * @author j0k3r.rg
 */
public class ejercicio06 {
        /*
        Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 
        donde la suma de sus filas, sus columnas y sus diagonales son idénticas. 
        Crear un programa que permita introducir un cuadrado por teclado y determine 
        si este cuadrado es mágico o no. El programa deberá comprobar que los números 
        introducidos son correctos, es decir, están entre el 1 y el 9.
         */
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        Scanner leer = new Scanner(System.in);
        int num;
        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                do{
                    num = leer.nextInt();
                    if ((num <1 || num>9)) System.out.println("valor ingresado incorrecto");
                }while (num <1 || num>9 );
                matriz[i][j]=num;
            }
        }
        if (esMagica(matriz) == true){
            System.out.println("la matriz ES MAGICA ♥ ,... infeliz!");
        }else{
            System.out.println("la matriz NO ES MAGICA ;)");
        }
        leer.close();
    }
    public static boolean esMagica(int[][] matriz){
        int sumaBandera = matriz[0][0] + matriz[0][1] + matriz[0][2];
        System.out.println(sumaBandera);
        int sumaFila, sumaColumna, sumaDiagonalPrincipal = 0,sumaDiagonalInversa=0;
        for (int i = 0; i < matriz[0].length; i++) {
            sumaFila = 0;
            sumaColumna = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                sumaFila += matriz[i][j]; 
                
                sumaColumna += matriz[j][i];
                if (i==j){
                    sumaDiagonalPrincipal += matriz[i][j];
                }
                if ( (i+j) == matriz.length-1){
                    sumaDiagonalInversa += matriz[i][j]; 
                }
            }
            if (sumaFila != sumaBandera || sumaColumna != sumaBandera) return false;
        }
        if (sumaBandera != sumaDiagonalPrincipal || sumaBandera != sumaDiagonalInversa) return false;
        return true;
    }
}
